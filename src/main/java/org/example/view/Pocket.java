package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pocket extends JComponent {

    private final int BORDER_WIDTH = 4;
    public List<Square> currentSquaresInPocket = new ArrayList<>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.GRAY);
        g.fillRect(BORDER_WIDTH, BORDER_WIDTH, getWidth()-(2 * BORDER_WIDTH), getHeight()-(2 * BORDER_WIDTH));


    }
}
