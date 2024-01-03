package org.example.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Gameboard {

    public static final int NUMBER_OF_BLOCKS = 1;
    public static final int BOARD_SIZE = 50;
    public static final int NUMBERS_OF_LAYERS = 1;
    public int[][] gameboard;
    public List<Square> squaresOnTheBoard = new ArrayList<>();

    public final int POINT_SIZE_PIXELS = 1;

    public List<Point> pointsUsed = new ArrayList<>();

    public Gameboard() {
//        gameboard = new int[BOARD_SIZE][BOARD_SIZE];
        gameboard = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}

    };
    }

    public void giveCoordinates(Queue<Square> allSquaresReadyToPlace){

        Square square = allSquaresReadyToPlace.poll();

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[0].length; j++) {
                Point point = new Point(i, j);
                if (pointsUsed.contains(point)) continue;

                if (gameboard[j][i] == 1){
                    addUsedPoints(i, j);

                    square.setTopLeftPoint(setCoordinates(i, j));
                    square.setTopRightPoint(setCoordinates(i + 1, j));
                    square.setBottomLeftPoint(setCoordinates(i,j + 1 ));
                    square.setBottomRightPoint(setCoordinates(i + 1,j + 1 ));

                    squaresOnTheBoard.add(square);
                    square = allSquaresReadyToPlace.poll();
                }
            }
        }
    }

    private void addUsedPoints(int x, int y) {
        pointsUsed.add(new Point(x, y));
        pointsUsed.add(new Point(x + 1, y));
        pointsUsed.add(new Point(x, y + 1));
        pointsUsed.add(new Point(x + 1, y + 1));
    }

    private Point setCoordinates(int x, int y) {

        Point point = new Point(POINT_SIZE_PIXELS * x, POINT_SIZE_PIXELS * y);
        return point;
    }


}
