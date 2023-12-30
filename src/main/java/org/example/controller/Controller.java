package org.example.controller;

import org.example.Main;
import org.example.view.Square;

public class Controller implements EventListener{

    private Square square;
    @Override
    public void moveToPocket() {
        System.exit(0);
    }
    public void setSquare(Square square) {
        this.square = square;
    }
}
