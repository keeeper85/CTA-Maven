package org.example.view;

import org.example.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Square extends JComponent {

    GameboardView gameboardView;
    Square square;
    boolean isClickable = true;
    int squareSize = 70;
    int x = 250;
    int y = 500;

    public Square() {
        square = this;
        square.setVisible(true);
        square.setFocusable(true);
        square.addMouseListener(new ClickHandler());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.CYAN);
        g.fillRect(0,0,getWidth(),getHeight());
    }

    class ClickHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            Controller.getInstance().moveToPocket(square, gameboardView);
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
