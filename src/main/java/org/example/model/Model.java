package org.example.model;

import org.example.model.strategy.DifficultStrategy;
import org.example.model.strategy.Difficulty;
import org.example.model.strategy.EasyStrategy;
import org.example.model.strategy.NormalStrategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Model {
    public Queue<Square> allSquaresReadyToPlace;
    public Gameboard gameboard;

    public Model(Difficulty difficulty) {

        List<Square> allSquares = new ArrayList<>();
        switch (difficulty){
            case EASY -> allSquares = new EasyStrategy().getSquares();
            case NORMAL -> allSquares = new NormalStrategy().getSquares();
            case DIFFICULT -> allSquares = new DifficultStrategy().getSquares();
        }
        setPocket(allSquares);
        allSquaresReadyToPlace = new LinkedList<>(allSquares);

        gameboard = new Gameboard();

    }

    public void gameWon(){
        System.out.println("You won!");
    }

    public void gameLost(){
        System.out.println("You lost!");
    }

    public List<Square> setPocket(List<Square> squareList){
        Pocket pocket = new Pocket(this);
        List<Square> squaresWithPocket = new ArrayList<>();
        for (Square square : squareList) {
            square.setPocket(pocket);
        }
        return squaresWithPocket;
    }
}
