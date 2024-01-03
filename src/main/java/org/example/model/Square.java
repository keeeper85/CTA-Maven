package org.example.model;

import org.example.view.PocketSlots;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Square {

    public static int id;
    private Point topLeftPoint;
    private Point topRightPoint;
    private Point bottomLeftPoint;
    private Point bottomRightPoint;
    private int layer;
    private SquareColor squareColor;
    public boolean clickable;
    private final int SQUARE_SIZE = 60;

    private Pocket pocket;
    private PocketSlots pocketSlot;

    public Square(SquareColor color) {

        squareColor = color;
        clickable = true;
        id++;
    }

    public List<Square> onClick(){

        if (clickable){
            clickable = false;
            pocket.addSquareToFreeSlot(this);
            return pocket.removeTriples(this);
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

    public int getSQUARE_SIZE() {
        return SQUARE_SIZE;
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

    @Override
    public String toString() {
        return "Square{" +
                "squareColor=" + squareColor +
                " " + topLeftPoint +
                '}';
    }
}
