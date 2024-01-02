package org.example.model;

import java.awt.*;

public class Square {

    private Point topLeftPoint;
    private Point topRightPoint;
    private Point bottomLeftPoint;
    private Point bottomRightPoint;
    private int layer;
    private SquareColor squareColor;
    private boolean clickable;
    private boolean inPocket;
    private Gameboard gameBoard;

    public Square(SquareColor color) {

        squareColor = color;
        inPocket = false;
    }

    public void onClick(){
        if (this.clickable){
        }
    }

    


}
