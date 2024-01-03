package org.example.view;

import javax.swing.*;
import java.awt.*;

public class PocketView extends JComponent {

    private final int BORDER_WIDTH = 4;
    public final int X = 220;
    public final int Y = 800;
    public final int HEIGHT = 70;
    public final int WIDTH = 560;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.GRAY);
        g.fillRect(BORDER_WIDTH, BORDER_WIDTH, getWidth()-(2 * BORDER_WIDTH), getHeight()-(2 * BORDER_WIDTH));

    }
}
