package org.example.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareFactoryTest {

    static List<Square> list;

    @BeforeAll
    static void createYellowSquares(){
        list = SquareFactory.createYellowSquares(100);
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
            if (!squareName.contains("yellow")) testFailed = true;
        }
        assertFalse(testFailed);
    }
}