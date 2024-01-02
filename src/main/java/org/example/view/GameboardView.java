package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameboardView extends JPanel {
    public List<Square> squares = new ArrayList<>();

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
        Square square = new Square();
        squares.add(square);
        square.gameboardView = this;
        square.setBounds(square.x, square.y, square.squareSize, square.squareSize);
        add(square);
    }

    public void drawPocket(){
        pocket = new Pocket();
        pocket.setBounds(220, 800, 560, 80);
        pocket.setVisible(true);
        add(pocket);
    }

    public void addSquareToPocket(Square square){

        square.setLocation(224, 804);

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
