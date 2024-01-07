package org.example.view;

import org.example.model.Model;
import org.example.model.buttonlogic.ChooseDifficulty;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    private Model model;
    public GameboardView gameboardView;
    public TopPanel topPanel;

    public View(Model model) throws HeadlessException {
        this.model = model;
        ChooseDifficulty chooseDifficulty = ChooseDifficulty.getInstance();
        chooseDifficulty.setView(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1040, 1000);
        setLocationRelativeTo(null);
        setTitle("Clean Them All!");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
        setResizable(false);
    }

    public void init(GameboardView gV) {
        topPanel = new TopPanel(model);
        gameboardView = gV;

        add(topPanel);
        add(gameboardView);

        topPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, (int) (getHeight() * 0.05)));
        gameboardView.setPreferredSize(new Dimension(Integer.MAX_VALUE, (int) (getHeight() * 0.95)));
    }

}
