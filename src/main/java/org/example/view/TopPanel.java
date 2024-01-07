package org.example.view;

import org.example.model.Model;
import org.example.model.buttonlogic.Info;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    private Model model;

    public TopPanel(Model model) {
        this.model = model;
        setVisible(true);
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
        setLayout(boxLayout);
        infoButton();
        add(Box.createHorizontalStrut(50));
        restartButton();
        add(Box.createHorizontalStrut(50));
        revertButton();
        add(Box.createHorizontalStrut(50));
        chooseDifficultyButton();
    }

    private void infoButton(){
        JButton info = new JButton("?");
        info.addActionListener(new Info());
        info.setToolTipText("Restarts the current game.");
        Dimension dimension = new Dimension(30, 30);
        info.setPreferredSize(dimension);
        add(info);
    }

    private void restartButton(){
        JButton restart = new JButton("Restart");
        restart.setToolTipText("Restarts the current game.");
        Dimension dimension = new Dimension(100, 30);
        restart.setPreferredSize(dimension);
        add(restart);
    }

    private void revertButton(){
        JButton revert = new JButton("Revert");
        revert.setToolTipText("Reverts the last move. Can be used only once per move.");
        Dimension dimension = new Dimension(100, 30);
        revert.setPreferredSize(dimension);
        add(revert);
    }

    private void chooseDifficultyButton(){
        JButton difficulty = new JButton("Difficulty");
        difficulty.setToolTipText("Starts a new game at chosen difficulty");
        Dimension dimension = new Dimension(100, 30);
        difficulty.setPreferredSize(dimension);
        add(difficulty);
    }
}
