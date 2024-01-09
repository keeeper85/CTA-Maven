package org.example.model;

import org.example.model.constants.Scores;
import org.example.model.strategy.DifficultStrategy;
import org.example.model.strategy.Difficulty;
import org.example.model.strategy.EasyStrategy;
import org.example.model.strategy.NormalStrategy;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Model {
    public Queue<Square> allSquaresReadyToPlace;
    public Gameboard gameboard;
    private List<Square> allSquares;
    private int maxScore;
    private int currentScore;
    private Difficulty difficulty;
    private boolean isGameFinished;

    public Model(Difficulty difficulty) {

        this.difficulty = difficulty;

        allSquares = new ArrayList<>();
        switch (difficulty){
            case EASY -> allSquares = new EasyStrategy().getSquares();
            case NORMAL -> allSquares = new NormalStrategy().getSquares();
            case DIFFICULT -> allSquares = new DifficultStrategy().getSquares();
        }
        allSquaresReadyToPlace = new LinkedList<>(allSquares);
        initModel();
    }

    private void initModel(){
        gameboard = new Gameboard();
        gameboard.giveCoordinates(allSquaresReadyToPlace);

        isGameFinished = false;
        setMaxScore();
        setPocket(allSquares);
    }

    public void gameWon(){
        isGameFinished = true;
        String message = "Congratulations! You won!. Your score is: " + maxScore + " Try playing at higher difficulty.";
        if (difficulty == Difficulty.DIFFICULT) message = "Congratulations! You won!. Your score is: " + maxScore + " You've beat the game! You're the best!";
        JOptionPane.showMessageDialog(null, message);
    }

    public void gameLost(){
        isGameFinished = true;
        String message = "Game over. Your score is: " + getScore() + " Try playing at lower difficulty.";
        if (difficulty == Difficulty.EASY) message = "Game over. Your score is: " + getScore() + " Try again and don't give up!";
        JOptionPane.showMessageDialog(null, message);
    }

    private List<Square> setPocket(List<Square> squareList){
        Pocket pocket = new Pocket(this);
        List<Square> squaresWithPocket = new ArrayList<>();
        for (Square square : squareList) {
            square.setPocket(pocket);
        }
        return squaresWithPocket;
    }

    private void setMaxScore(){

        int maxScore = 0;
        for (Square square : allSquares) {
            for (Scores value : Scores.values()) {
                if (square.name.contains(value.getColor())) maxScore += value.getPoints();
            }
        }
        this.maxScore = maxScore;
    }

    public int getScore(){
        currentScore = maxScore - gameboard.getScoreLeft();
        return currentScore;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public boolean isGameFinished() {
        return isGameFinished;
    }

    public int getMaxScore() {
        return maxScore;
    }
}
