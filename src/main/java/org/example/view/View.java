package org.example.view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {


    public View() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setTitle("Clean Them All!");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
        setResizable(false);
    }

    public void init() {
        TopPanel topPanel = new TopPanel();
        GameboardView gameboardView = new GameboardView();

        add(topPanel);
        add(gameboardView);

        topPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, (int) (getHeight() * 0.05)));
        gameboardView.setPreferredSize(new Dimension(Integer.MAX_VALUE, (int) (getHeight() * 0.95)));
    }

}
