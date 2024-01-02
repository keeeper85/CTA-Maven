package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameboardView extends JPanel {
    public List<SquareView> squareViews = new ArrayList<>();

    private Pocket pocket;

    public GameboardView() {
        setVisible(true);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        addSquare(); //change to populateWithSquares
        drawPocket();
        repaint();
    }

    public void addSquare(){
        SquareView squareView = new SquareView();
        squareViews.add(squareView);
        squareView.gameboardView = this;
        squareView.setBounds(squareView.x, squareView.y, squareView.squareSize, squareView.squareSize);
        add(squareView);
    }

    public void drawPocket(){
        pocket = new Pocket();
        pocket.setBounds(220, 800, 560, 80);
        pocket.setVisible(true);
        add(pocket);
    }

    public void addSquareToPocket(SquareView squareView){

        squareView.setLocation(224, 804);

        removeThrees();
        repaint();
    }

    public void removeThrees(){

        if (areTriplesInPocket()){

        }

    }

    private static boolean areTriplesInPocket() {
        return false;
    }
}
