package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    public static final int NUMBER_OF_BLOCKS = 1;
    public static final int BOARD_SIZE = 50;
    public static final int NUMBERS_OF_LAYERS = 1;
    public int[][] gameboard;
    public List<Block> blocksOnTheBoard = new ArrayList<>();

    public GameBoard() {
//        gameboard = new int[BOARD_SIZE][BOARD_SIZE];
        gameboard = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}

    };
    }


}
