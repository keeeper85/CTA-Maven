package org.example.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Square {

    public final String name;
    private Point topLeftPoint;
    private Point topRightPoint;
    private Point bottomLeftPoint;
    private Point bottomRightPoint;
    private int layer;
    private SquareColor squareColor;
    public boolean clickable;
    private Pocket pocket;
    private PocketSlots pocketSlot;

    public Square(SquareColor color, String name) {

        squareColor = color;
        clickable = true;
        this.name = name;
    }

    public List<Square> onClick(){

        if (clickable){
            clickable = false;
            pocket.addSquareToPocket(this);
            return pocket.getTriplesListForRemoval(this);
        }
        return new ArrayList<>();
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

    public Point getTopRightPoint() {
        return topRightPoint;
    }

    public Point getBottomLeftPoint() {
        return bottomLeftPoint;
    }

    public Point getBottomRightPoint() {
        return bottomRightPoint;
    }
    public Color getDrawingColor(){
        return squareColor.getColor();
    }

    private void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

    public Pocket getPocket() {
        return pocket;
    }

    public void setPocket(Pocket pocket) {
        this.pocket = pocket;
    }

    public PocketSlots getPocketSlot() {
        return pocketSlot;
    }

    public void setPocketSlot(PocketSlots pocketSlot) {
        this.pocketSlot = pocketSlot;
    }

    public SquareColor getSquareColor() {
        return squareColor;
    }
}
