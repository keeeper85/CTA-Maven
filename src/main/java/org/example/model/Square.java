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
    private final int SQUARE_SIZE = 60;

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

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public int getSQUARE_SIZE() {
        return SQUARE_SIZE;
    }

    public Color getDrawingColor(){
        return squareColor.getColor();
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareColor=" + squareColor +
                " " + topLeftPoint +
                '}';
    }
}
