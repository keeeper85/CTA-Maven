package org.example.view;

import org.example.model.*;
import org.example.model.constants.Constants;
import org.example.model.constants.PocketSlots;
import org.example.model.constants.Scores;
import org.example.model.constants.SquareColor;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class GameboardView extends JPanel {
    public List<SquareView> squareViews = new ArrayList<>();
    private PocketView pocketView;
    private Model model;
    private TreeMap<PocketSlots, SquareView> squareViewsInPocket;
    private int remainingSquares;
    private int currentScore = 0;
    private JLabel remainingSquaresLabel;
    private JLabel scoreLabel;
    private List<Square> squaresOnTheBoard;

    public GameboardView(Model model) {
        this.model = model;
        this.squaresOnTheBoard = model.gameboard.squaresOnTheBoard;
        this.remainingSquares = Constants.TOTAL_SQUARES_AMOUNT;

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        drawSquares();
        drawPocket();
        drawRemainingSquaresLabel();
        drawScoreLabel();

        initiateMap();
        repaint();
    }

    public void drawSquares(){

        for (Square square : squaresOnTheBoard) {
            SquareView squareView = new SquareView(model, square);
            squareView.gameboardView = this;
            squareView.setBounds(square.getPoint().x, square.getPoint().y, Constants.SQUARE_SIZE_PIXELS, Constants.SQUARE_SIZE_PIXELS);
            squareViews.add(squareView);
            add(squareView);
        }
    }

    public void drawPocket(){
        pocketView = new PocketView();
        pocketView.setBounds(pocketView.X, pocketView.Y, pocketView.WIDTH, pocketView.HEIGHT);
        pocketView.setVisible(true);
        add(pocketView);
    }

    private void drawRemainingSquaresLabel(){
        String label = "Remaining squares: " + remainingSquares + "/360";
        remainingSquaresLabel = new JLabel(label);
        remainingSquaresLabel.setBounds(30, 880, 200, 30);
        add(remainingSquaresLabel);
    }

    private void drawScoreLabel(){
        String label = "(" + model.getDifficulty() + ") Score: " + currentScore + "/" + model.getMaxScore();
        scoreLabel = new JLabel(label);
        scoreLabel.setBounds(850, 880, 200, 30);
        add(scoreLabel);
    }

    private void initiateMap(){
        squareViewsInPocket = new TreeMap<>();

        squareViewsInPocket.put(PocketSlots.SLOT_1, null);
        squareViewsInPocket.put(PocketSlots.SLOT_2, null);
        squareViewsInPocket.put(PocketSlots.SLOT_3, null);
        squareViewsInPocket.put(PocketSlots.SLOT_4, null);
        squareViewsInPocket.put(PocketSlots.SLOT_5, null);
        squareViewsInPocket.put(PocketSlots.SLOT_6, null);
        squareViewsInPocket.put(PocketSlots.SLOT_7, null);
    }

    public void addSquareViewsToPocket(SquareView squareView, PocketSlots pocketSlots){
        squareView.setLocation(pocketSlots.getX(), pocketSlots.getY());
        squareViewsInPocket.put(pocketSlots, squareView);
        if (haveTriples(squareView)) removeTriples(squareView);

        revalidate();
        repaint();
    }

    private void removeTriples(SquareView squareView){

        List<PocketSlots> freedSlots = new ArrayList<>();

        SquareColor color = squareView.getSquare().getSquareColor();
        for (Map.Entry<PocketSlots, SquareView> squareViewEntry : squareViewsInPocket.entrySet()) {
            SquareView value = squareViewEntry.getValue();
            if (value == null) continue;

            SquareColor valueColor = squareViewEntry.getValue().getSquare().getSquareColor();
            if (color.equals(valueColor)){
                freedSlots.add(squareViewEntry.getKey());
                remove(value);
                recalculateScore(value);
                squareViews.remove(squareViewEntry.getValue());
            }
        }

        for (PocketSlots freedSlot : freedSlots) {
            squareViewsInPocket.put(freedSlot, null);
        }

        remainingSquares -= freedSlots.size();
        updateLabels();
        if (remainingSquares == 0) model.gameWon();
    }

    private void recalculateScore(SquareView squareView) {
        String squareName = squareView.name;
        for (Scores value : Scores.values()){
            if (squareName.contains(value.getColor())) currentScore += value.getPoints();
        }
    }

    private boolean haveTriples(SquareView squareView){
        int amount = 0;
        SquareColor color = squareView.getSquare().getSquareColor();

        for (SquareView value : squareViewsInPocket.values()) {
            if (value == null) continue;
            SquareColor valueColor = value.getSquare().getSquareColor();
            if (color.equals(valueColor)){
                amount++;
            }
        }

        return amount >= Constants.SQUARES_FOR_REMOVAL;
    }

    private void updateLabels() {
        remove(remainingSquaresLabel);
        remove(scoreLabel);
        drawRemainingSquaresLabel();
        drawScoreLabel();
        revalidate();
        repaint();
    }
}
