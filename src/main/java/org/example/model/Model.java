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
    public int maxScore;
    private List<Square> allSquares;
    public Model(Difficulty difficulty) {

        allSquares = new ArrayList<>();
        switch (difficulty){
            case EASY -> allSquares = new EasyStrategy().getSquares();
            case NORMAL -> allSquares = new NormalStrategy().getSquares();
            case DIFFICULT -> allSquares = new DifficultStrategy().getSquares();
        }
        setPocket(allSquares);
        setMaxScore();
        allSquaresReadyToPlace = new LinkedList<>(allSquares);

        gameboard = new Gameboard();
    }

    public void gameWon(){
        System.out.println("You won! Your score is: " + getScore());
    }

    public void gameLost(){
        System.out.println("You lost. Your score is: " + getScore());
    }

    public List<Square> setPocket(List<Square> squareList){
        Pocket pocket = new Pocket(this);
        List<Square> squaresWithPocket = new ArrayList<>();
        for (Square square : squareList) {
            square.setPocket(pocket);
        }
        return squaresWithPocket;
    }

    private void setMaxScore(){

        int score = 0;
        for (Square square : allSquares) {
            for (Scores value : Scores.values()) {
                if (square.name.contains(value.getColor())) score += value.getPoints();
            }
        }
        maxScore = score;
    }

    public int getScore(){
        return maxScore - gameboard.getScoreLeft();
    }
}
