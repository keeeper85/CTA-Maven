package org.example.view;

import org.example.controller.Controller;
import org.example.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SquareView extends JComponent {

    GameboardView gameboardView;
    SquareView squareView;
    boolean isClickable = true;
    int squareSize;
    private final int BORDER_WIDTH = 2;
    private final Color color;

    public SquareView(Model model, Color color) {
        squareView = this;
        this.color = color;
        squareSize = model.gameboard.POINT_SIZE_PIXELS * 2;
        squareView.setVisible(true);
        squareView.setFocusable(true);
        squareView.addMouseListener(new ClickHandler());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(color);
        g.fillRect(BORDER_WIDTH, BORDER_WIDTH, getWidth()-(2 * BORDER_WIDTH), getHeight()-(2 * BORDER_WIDTH));
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
