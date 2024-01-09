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
    public int maxScore;
    public int currentScore;
    public List<Square> allSquares;
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
        gameboard = new Gameboard(new LinkedList<>(allSquaresReadyToPlace));
        initModel();
    }

    public void gameWon(){
        isGameFinished = true;
        String message = "Congratulations! You won!. Your score is: " + getScore() + " Try playing at higher difficulty.";
        JOptionPane.showMessageDialog(null, message);
    }

    public void gameLost(){
        isGameFinished = true;
        String message = "You lost. Your score is: " + getScore() + " Try playing at lower difficulty.";
        JOptionPane.showMessageDialog(null, message);
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
        currentScore = maxScore - gameboard.getScoreLeft();
        return currentScore;
    }

    public void resetCurrentScore(){
        currentScore = 0;
    }

    public void initModel(){
        isGameFinished = false;
        setMaxScore();
        resetCurrentScore();
        setPocket(allSquares);
        allSquaresReadyToPlace = new LinkedList<>(allSquares);
    }
    public Difficulty getDifficulty() {
        return difficulty;
    }

    public boolean isGameFinished() {
        return isGameFinished;
    }
}
