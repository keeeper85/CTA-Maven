package org.example.model;

import org.example.model.constants.Constants;
import org.example.model.constants.Layers;
import org.example.model.constants.Scores;
import org.example.model.constants.SquareColor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class GameboardTest {

    Gameboard gameboard;
    Queue<Square> testQueue;
    int maxAmountSquares = 360;

    @BeforeEach
    void createGameboard(){
        gameboard = new Gameboard();
        testQueue = new LinkedList<>();

        for (int i = 0; i < maxAmountSquares; i++) {
            Square square = new Square(SquareColor.AQUA, "aqua" + i);
            testQueue.add(square);
        }
    }

    @Test
    void getLayers() {
        TreeMap<Integer, int[][]> layers = gameboard.getLayers();
        boolean testFailed = false;

        if (!layers.get(0).equals(Layers.LAYER_0.getLayer())) testFailed = true;
        if (!layers.get(5).equals(Layers.LAYER_5.getLayer())) testFailed = true;
        if (!layers.get(10).equals(Layers.LAYER_10.getLayer())) testFailed = true;
        if (!layers.get(15).equals(Layers.LAYER_15.getLayer())) testFailed = true;
        if (!layers.get(20).equals(Layers.LAYER_20.getLayer())) testFailed = true;
        if (!layers.get(25).equals(Layers.LAYER_25.getLayer())) testFailed = true;

        assertFalse(testFailed);
    }

    @Test
    void giveCoordinates() {
        gameboard.giveCoordinates(testQueue);

        Point wrongPoint = new Point(0,0);
        boolean testFailed = false;

        for (Square square : gameboard.squaresOnTheBoard) {
            if (square.getPoint().equals(wrongPoint)) testFailed = true;
        }

        assertFalse(testFailed);
    }

    @Test
    void removeSquare() {
        gameboard.giveCoordinates(testQueue);
        Square square = gameboard.squaresOnTheBoard.get(0);
        int x = square.getPoint().x / Constants.POINT_SIZE_PIXELS;
        int y = square.getPoint().y / Constants.POINT_SIZE_PIXELS;
        int layerID = square.getLayer();

        boolean testFailed = false;
        gameboard.removeSquare(square);

        if (gameboard.squaresOnTheBoard.contains(square)) testFailed = true;
        int[][] testLayer = gameboard.getLayers().get(layerID);
        if (testLayer[y][x] == 1) testFailed = true;

        assertFalse(testFailed);
    }

    @Test
    void checkClickable() {
        gameboard.giveCoordinates(testQueue);
        Square bottomSquare = gameboard.squaresOnTheBoard.get(359);
        boolean clickable = gameboard.checkClickable(bottomSquare);

        assertFalse(clickable);

        Square topSquare = gameboard.squaresOnTheBoard.get(0);
        clickable = gameboard.checkClickable(topSquare);

        assertTrue(clickable);
    }

    @Test
    void getScoreLeft() {
        int maxPoints = maxAmountSquares * Scores.AQUA.getPoints();

        gameboard.giveCoordinates(testQueue);
        int score = gameboard.getScoreLeft();

        assertEquals(maxPoints, score);

        gameboard.squaresOnTheBoard.remove(0);
        int scoreAfterRemoval = maxPoints - Scores.AQUA.getPoints();

        assertEquals(scoreAfterRemoval, gameboard.getScoreLeft());
    }
}