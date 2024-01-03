package org.example.view;

import org.example.model.Model;
import org.example.model.Square;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameboardView extends JPanel {
    public List<SquareView> squareViews = new ArrayList<>();

    private Pocket pocket;
    private Model model;

    public GameboardView(Model model) {
        this.model = model;
        setVisible(true);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        drawSquares(); //change to populateWithSquares
        drawPocket();
        repaint();
    }

    public void drawSquares(){

        for (Square square : model.gameboard.squaresOnTheBoard) {
            SquareView squareView = new SquareView();
            squareView.gameboardView = this;
            squareView.setBounds(square.getTopLeftPoint().x, square.getTopLeftPoint().y, square.getSQUARE_SIZE(), square.getSQUARE_SIZE());
            add(squareView);
        }
    }

    public void drawPocket(){
        pocket = new Pocket();
        pocket.setBounds(220, 800, 560, 70);
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
