package org.example.view;

import org.example.controller.Controller;
import org.example.controller.EventListener;

import javax.swing.*;
import java.awt.*;

public class MiddlePanel extends JPanel {

    public EventListener eventListener;
    public Controller controller;

    public MiddlePanel(Controller controller) {
        setVisible(true);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        addSquare();
        eventListener = controller;
        this.controller = controller;
    }

    public void addSquare(){
        Square square = new Square(controller);
        square.middlePanel = this;
        square.setEventListener(this.eventListener);
        square.setBounds(square.x, square.y, square.squareSize, square.squareSize);
        add(square);
    }

    public void removeSquare(Square square){
        remove(square);
    }
}
