package org.example.view;

import org.example.model.Model;
import org.example.model.constants.Constants;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    private Model model;
    public GameboardView gameboardView;

    public View(Model model) throws HeadlessException {
        this.model = model;

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(Constants.WINDOW_WIDTH_PIXELS, Constants.WINDOW_HEIGHT_PIXELS);
        setLocationRelativeTo(null);
        setTitle(Constants.GAME_TITLE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
        setResizable(false);

        init();
    }

    public void init() {
        this.gameboardView = new GameboardView(model);
        add(gameboardView);
        gameboardView.setPreferredSize(new Dimension(Integer.MAX_VALUE, getHeight()));
    }

}
