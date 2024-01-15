package org.example.model;

import org.example.model.constants.SquareColor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareFactoryTest {

    static List<Square> list;

    @BeforeAll
    static void createColoredSquares(){
        list = SquareFactory.createColoredSquares(100, SquareColor.BLUE);
    }

    @Test
    void testAmountCreated(){
        int result = list.size();
        assertEquals(100,result);
    }

    @Test
    void testSquareNames(){
        boolean testFailed = false;
        for (Square square : list) {
            String squareName = square.name;
            if (!squareName.contains("blue")) testFailed = true;
        }
        assertFalse(testFailed);
    }
}