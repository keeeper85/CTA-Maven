package org.example.model;

import org.example.model.layers.Layers;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Gameboard {
    public final int POINT_SIZE_PIXELS = 40;
    private TreeMap<Integer, int[][]> layers;
    public List<Square> squaresOnTheBoard = new ArrayList<>();
    public Gameboard() {

        layers = new TreeMap<>(Collections.reverseOrder());

        for (Layers value : Layers.values()) {
            layers.put(value.ordinal(), value.getLayer());
        }
    }

    public void giveCoordinates(Queue<Square> allSquaresReadyToPlace){

        Square square = allSquaresReadyToPlace.poll();

        for (Map.Entry<Integer, int[][]> layer : layers.entrySet()) {
            int[][] gameboard = layer.getValue();
            int z = layer.getKey();
            List<Point> pointsUsed = new ArrayList<>();

            for (int y = 0; y < gameboard.length; y++) {
                for (int x = 0; x < gameboard[0].length; x++) {
                    Point point = new Point(y, x);
                    if (pointsUsed.contains(point)) continue;

                    if (gameboard[y][x] == 1){

                        square.setPoint(setCoordinatesXY(x, y));
                        square.setLayer(z);
                        setColumnSize(square);

                        pointsUsed.add(new Point(y, x));

                        squaresOnTheBoard.add(square);
                        square = allSquaresReadyToPlace.poll();
                    }
                }
            }
        }
    }

    private Point setCoordinatesXY(int x, int y) {

        Point point = new Point(POINT_SIZE_PIXELS * x, POINT_SIZE_PIXELS * y);
        return point;
    }

    public void removeSquare(Square square){
        squaresOnTheBoard.remove(square);
        Point point = square.getPoint();
        int x = point.x / POINT_SIZE_PIXELS;
        int y = point.y / POINT_SIZE_PIXELS;
        int layer = square.getLayer();

        int[][] gameboard = layers.get(layer);
        gameboard[y][x] = 0;

        layers.put(layer, gameboard);
        removeEmptyLayers(square);
    }

    private void removeEmptyLayers(Square square) {
        int layerKey = square.getLayer();
        if (isLayerEmpty(layerKey)) layers.remove(layerKey);
    }

    private boolean isLayerEmpty(int layerKey) {
        int[][] gameboard = layers.get(layerKey);

        for (int y = 0; y < gameboard.length; y++) {
            for (int x = 0; x < gameboard[0].length; x++) {
                if (gameboard[y][x] == 1) return false;
            }
        }
        return true;
    }

    private void setColumnSize(Square square){
        int columnSize = getColumnSize(square);
        square.setColumnSize(columnSize);
    }

    private int getColumnSize(Square square) {

        int squareLayer = square.getLayer();
        int y = square.getPoint().y / POINT_SIZE_PIXELS;
        int x = square.getPoint().x / POINT_SIZE_PIXELS;
        int count = 0;

        for (int i = squareLayer; i >= 0; i--) {
            int[][] gameboard = layers.get(i);
            if (gameboard[y][x] == 1) count++;
        }
        return count;
    }

    public boolean checkClickable(Square square){
        int squareLayer = square.getLayer();
        int y = square.getPoint().y / POINT_SIZE_PIXELS;
        int x = square.getPoint().x / POINT_SIZE_PIXELS;

        if (squareLayer == layers.size() - 1) return true;

        int[][] gameboard = layers.get(squareLayer + 1);
        if (!isAreaClear(gameboard, y, x)) return false;

        return true;
    }

    private boolean isAreaClear(int[][] gameboard, int y, int x) {
        if (gameboard[y][x] == 1) return false;
        else if (gameboard[y+1][x] == 1) return false;
        else if (gameboard[y-1][x] == 1) return false;
        else if (gameboard[y][x+1] == 1) return false;
        else if (gameboard[y][x-1] == 1) return false;
        else if (gameboard[y+1][x+1] == 1) return false;
        else if (gameboard[y+1][x-1] == 1) return false;
        else if (gameboard[y-1][x-1] == 1) return false;
        else if (gameboard[y-1][x+1] == 1) return false;

        return true;
    }

    public int getScoreLeft(){
        int score = 0;
        for (Square square : squaresOnTheBoard) {
            for (Scores value : Scores.values()) {
                if (square.name.contains(value.getColor())) score += value.getPoints();
            }
        }
        return score;
    }
}
