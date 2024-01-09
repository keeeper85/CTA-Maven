package org.example.model.strategy;

import org.example.model.Square;
import org.example.model.constants.Constants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NormalStrategyTest {

    static List<Square> allSquaresCreated;
    @BeforeAll
    static void createSquares() {
        NormalStrategy normal = new NormalStrategy();
        allSquaresCreated = normal.getSquares();
    }

    @Test
    void testAmountCreated(){
        int result = allSquaresCreated.size();
        int expected = Constants.TOTAL_SQUARES_AMOUNT;
        assertEquals(expected,result);
    }

    @Test
    void isNumberOfYellowSquaresDividableByThree(){
        int count = 0;
        for (Square square : allSquaresCreated) {
            if (square.name.contains("yellow")) count++;
        }
        assertEquals(0, count % 3);
    }

    @Test
    void isNumberOfGreenSquaresDividableByThree(){
        int count = 0;
        for (Square square : allSquaresCreated) {
            if (square.name.contains("green")) count++;
        }
        assertEquals(0, count % 3);
    }

    @Test
    void isNumberOfPinkSquaresDividableByThree(){
        int count = 0;
        for (Square square : allSquaresCreated) {
            if (square.name.contains("pink")) count++;
        }
        assertEquals(0, count % 3);
    }

    @Test
    void isNumberOfCrimsonSquaresDividableByThree(){
        int count = 0;
        for (Square square : allSquaresCreated) {
            if (square.name.contains("crimson")) count++;
        }
        assertEquals(0, count % 3);
    }

    @Test
    void isNumberOfTealSquaresDividableByThree(){
        int count = 0;
        for (Square square : allSquaresCreated) {
            if (square.name.contains("teal")) count++;
        }
        assertEquals(0, count % 3);
    }

    @Test
    void isNumberOfGoldSquaresDividableByThree(){
        int count = 0;
        for (Square square : allSquaresCreated) {
            if (square.name.contains("gold")) count++;
        }
        assertEquals(0, count % 3);
    }
}