package org.example.view;

import org.example.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SquareView extends JComponent {

    GameboardView gameboardView;
    SquareView squareView;
    boolean isClickable = true;
    int squareSize = 70;
    int x = 250;
    int y = 500;

    public SquareView() {
        squareView = this;
        squareView.setVisible(true);
        squareView.setFocusable(true);
        squareView.addMouseListener(new ClickHandler());
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
            if (isClickable) Controller.getInstance().moveToPocket(squareView, gameboardView);
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
