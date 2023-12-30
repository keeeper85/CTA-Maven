package org.example.view;

import org.example.controller.Controller;
import org.example.controller.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Square extends JComponent {

    MiddlePanel middlePanel;
    EventListener eventListener;
    Square square;
    boolean isClickable = true;
    int squareSize = 76;
    int x = 250;
    int y = 500;

    public Square(Controller controller) {
        square = this;
        square.setVisible(true);
        square.setFocusable(true);
        square.addMouseListener(new ClickHandler());
        eventListener = controller;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(0,0,getWidth(),getHeight());
    }

    public void setEventListener(EventListener eventListener){
//        this.eventListener = eventListener;
    }

    class ClickHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            System.out.println(e.getPoint());
            if (contains(e.getX(), e.getY())) {
                new Controller().moveToPocket(square, middlePanel);
            }
        }
    }

    @Override
    public boolean contains(int x, int y) {

        Point componentPoint = SwingUtilities.convertPoint(this, x, y, this);

        int componentX = (int) componentPoint.getX();
        int componentY = (int) componentPoint.getY();


        if (componentX >= 0 && componentX <= squareSize && componentY >= 0 && componentY <= squareSize) {
            return true;
        }

        return false;
    }
}
