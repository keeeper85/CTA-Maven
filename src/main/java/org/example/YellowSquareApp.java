package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class YellowSquareApp extends JFrame {

    private YellowSquare yellowSquare;

    public YellowSquareApp() {
        setTitle("Yellow Square App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        yellowSquare = new YellowSquare();

        // Add a mouse listener to the yellow square
        yellowSquare.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // When the square is clicked, make it disappear
                if (yellowSquare.contains(e.getX(), e.getY())) {
                    System.out.println(e.getPoint());
                }
//                if (!yellowSquare.isVisible()) yellowSquare.setVisible(true);
            }
        });

        // Add the yellow square to the frame
        add(yellowSquare);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            YellowSquareApp app = new YellowSquareApp();
            app.setVisible(true);
        });
    }
}

class YellowSquare extends JComponent {

    private int x = 200;
    private int y = 50;
    private int width = 80;
    private int height = 80;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the color to yellow
        g.setColor(Color.YELLOW);

        // Draw a filled yellow square
        g.fillRect(x, y, width, height);
    }

    @Override
    public boolean contains(int x, int y) {
        if ((x >= this.x) && (x <= this.x + this.width)){
            if (((y >= this.y) && (y <= this.y + this.height))) return true;
        }

        return false;
    }
}