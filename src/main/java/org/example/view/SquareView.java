package org.example.view;

import org.example.controller.Controller;
import org.example.model.Model;
import org.example.model.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SquareView extends JComponent {

    protected final String name;
    protected final int squareSize;
    public GameboardView gameboardView;
    public SquareView squareView;
    private final int BORDER_WIDTH = 2;
    private final Color color;
    private Square square;
    private Model model;

    public SquareView(Model model, Square square) {
        squareView = this;
        this.model = model;
        this.square = square;
        this.name = square.name;
        this.color = square.getDrawingColor();

        squareSize = model.gameboard.POINT_SIZE_PIXELS * 2;
        squareView.addMouseListener(new ClickHandler());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(color);
        g.fillRect(BORDER_WIDTH, BORDER_WIDTH, getWidth()-(2 * BORDER_WIDTH), getHeight()-(2 * BORDER_WIDTH));

        if (!square.inPocket){
            String text = String.valueOf(square.getColumnSize());
            FontMetrics fm = g.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(text)) / 2;
            int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            g.setColor(Color.BLACK);
            g.drawString(text, x, y);
        }
    }

    class ClickHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            if (model.gameboard.checkClickable(square)) {
                Controller.getInstance(model).moveToPocket(squareView, gameboardView);
            }
        }
    }

    public Square getSquare() {
        return square;
    }
}
