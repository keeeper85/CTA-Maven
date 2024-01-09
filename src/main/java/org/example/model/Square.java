package org.example.model;

import org.example.model.constants.PocketSlots;
import org.example.model.constants.SquareColor;

import java.awt.*;

public class Square {

    public final String name;
    public boolean inPocket;
    private final SquareColor squareColor;
    private int columnSize;
    private Point point;
    private int layer;
    private Pocket pocket;
    private PocketSlots pocketSlot;

    public Square(SquareColor color, String name) {
        squareColor = color;
        inPocket = false;
        this.name = name;
    }

    public void onClick(){
        inPocket = true;
        pocket.addSquareToPocket(this);
        pocket.getTriplesListForRemoval(this);
    }

    public void setPoint(Point point) {
        this.point = point;
    }
    public Point getPoint() {
        return point;
    }
    public Color getDrawingColor(){
        return squareColor.getColor();
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
    public int getLayer() {
        return layer;
    }
    public void setLayer(int layer) {
        this.layer = layer;
    }
    public int getColumnSize() {
        return columnSize;
    }
    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }
}
