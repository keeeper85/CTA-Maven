package org.example.model;

import org.example.model.layers.Layers;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Gameboard {
    public final int POINT_SIZE_PIXELS = 40;
    private TreeMap<Integer, Layers> layers;
    public List<Square> squaresOnTheBoard = new ArrayList<>();
    public Gameboard() {

        layers = new TreeMap<>();

        for (Layers value : Layers.values()) {
            layers.put(value.ordinal(), value);
        }
    }

    public void giveCoordinates(Queue<Square> allSquaresReadyToPlace){

        Square square = allSquaresReadyToPlace.poll();

        for (Map.Entry<Integer, Layers> layer : layers.entrySet()) {
            int[][] gameboard = layer.getValue().getLayer();
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

        int[][] gameboard = layers.get(layer).getLayer();
        gameboard[y][x] = 0;

        for (Map.Entry<Integer, Layers> entry : layers.entrySet()) {
            if (entry.getKey() == layer){
                entry.getValue().getLayer()[y][x] = 0;
            }
        }
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

        for (int i = 0; i <= squareLayer; i++) {
            int[][] gameboard = layers.get(i).getLayer();
            if (gameboard[y][x] == 1) count++;
        }
        return count;
    }

}
