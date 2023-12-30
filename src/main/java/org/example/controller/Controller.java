package org.example.controller;

import org.example.Main;
import org.example.view.MiddlePanel;
import org.example.view.Square;

public class Controller implements EventListener{

    @Override
    public void moveToPocket(Square square, MiddlePanel middlePanel) {
        middlePanel.removeSquare(square);
        middlePanel.revalidate();
        middlePanel.repaint();
        System.out.println("test");

    }


}
