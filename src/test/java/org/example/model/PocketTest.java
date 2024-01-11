package org.example.model;

import org.example.model.constants.PocketSlots;
import org.example.model.constants.SquareColor;
import org.example.model.strategy.Difficulty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class PocketTest {

    Model model;
    Square square;
    Pocket pocket;
    List<Square> eightSquares = new ArrayList<>();

    @BeforeEach
    void initPocket(){
        model = new Model(Difficulty.EASY);
        pocket = new Pocket(model);
        square = model.gameboard.squaresOnTheBoard.get(0);

        for (int i = 1; i < 9; i++) {
            square = model.gameboard.squaresOnTheBoard.get(i);
            eightSquares.add(square);
        }
    }

    @Test
    @DisplayName("Checks if the square gets removed from the board")
    void addSquareToPocket_1() {
        pocket.addSquareToPocket(square);
        boolean isStillOnGameboard = model.gameboard.squaresOnTheBoard.contains(square);

        assertFalse(isStillOnGameboard);
        assertFalse(model.isGameFinished());
    }

    @Test
    @DisplayName("Checks if the game is lost after taking too many squares")
    void addSquareToPocket_2() {
        for (Square value : eightSquares) {
            pocket.addSquareToPocket(value);
        }
        assertTrue(model.isGameFinished());
    }

    @Test
    @DisplayName("Checks if the method removes only squares in the same color.")
    void getTriplesListForRemoval() {

        int squaresInPocket = getHowManySquaresInPocket();
        assertEquals(0, squaresInPocket);

        Square square1 = new Square(SquareColor.AQUA, "0");
        square1.setPoint(new Point(40,40));
        Square square2 =new Square(SquareColor.AQUA, "1");
        square2.setPoint(new Point(80,80));
        Square square3 = new Square(SquareColor.AQUA, "2");
        square3.setPoint(new Point(120,120));
        Square square4 = new Square(SquareColor.BLUE, "3");
        square4.setPoint(new Point(160,160));


        pocket.addSquareToPocket(square1);
        pocket.addSquareToPocket(square2);
        pocket.addSquareToPocket(square3);
        pocket.addSquareToPocket(square4);

        squaresInPocket = getHowManySquaresInPocket();
        assertEquals(4, squaresInPocket);

        pocket.deleteTripleFromPocket(square1);

        squaresInPocket = getHowManySquaresInPocket();
        assertEquals(1, squaresInPocket);
    }

    private int getHowManySquaresInPocket() {
        TreeMap<PocketSlots, Square> pocketMap = pocket.getSquaresInPocket();
        int count = 0;

        for (Square value : pocketMap.values()) {
            if (value != null) count++;
        }

        return count;
    }
}