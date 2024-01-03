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

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setTopRightPoint(Point topRightPoint) {
        this.topRightPoint = topRightPoint;
    }

    public void setBottomLeftPoint(Point bottomLeftPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomRightPoint = bottomRightPoint;
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareColor=" + squareColor +
                " " + topLeftPoint +
                '}';
    }
}
