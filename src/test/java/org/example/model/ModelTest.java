package org.example.model;

import org.example.model.strategy.Difficulty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    Model model;
    Gameboard gameboard;
    Square square;

    @BeforeEach
    void modelCreation(){
        model = new Model(Difficulty.EASY);
        gameboard = model.gameboard;
        square = gameboard.squaresOnTheBoard.get(0);
    }

    @Test
    @Disabled
    void getScore() {
        assertEquals(0, model.getScore());
        gameboard.removeSquare(square);
        assertNotEquals(0, model.getScore());
    }

    @Test
    void getDifficulty() {
        assertEquals(Difficulty.EASY, model.getDifficulty());
    }

}