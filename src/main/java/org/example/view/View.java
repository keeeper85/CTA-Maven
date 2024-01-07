package org.example.view;

import org.example.model.Model;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    private Model model;
    public GameboardView gameboardView;
    private TopPanel topPanel;

    public View(Model model) throws HeadlessException {
        this.model = model;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1040, 1000);
        setLocationRelativeTo(null);
        setTitle("Clean Them All!");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
        setResizable(false);
    }

    public void init() {
        topPanel = new TopPanel(model);
        gameboardView = new GameboardView(model);

        add(topPanel);
        add(gameboardView);

        topPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, (int) (getHeight() * 0.05)));
        gameboardView.setPreferredSize(new Dimension(Integer.MAX_VALUE, (int) (getHeight() * 0.95)));
    }

}
