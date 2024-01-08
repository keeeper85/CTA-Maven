package org.example.view;

import org.example.model.Model;
import org.example.model.buttonlogic.ChooseDifficulty;
import org.example.model.buttonlogic.Info;
import org.example.model.buttonlogic.Restart;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    private Model model;

    public TopPanel(Model model) {
        this.model = model;
        setVisible(false);
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
        setLayout(boxLayout);

        revertButton();
        add(Box.createHorizontalStrut(50));
        restartButton();
        add(Box.createHorizontalStrut(50));
        chooseDifficultyButton();
        add(Box.createHorizontalStrut(800));
        infoButton();
    }

    private void infoButton(){
        JButton info = new JButton("?");
        info.setFocusable(false);
        info.addActionListener(new Info());
        info.setToolTipText("How to play?");
        Dimension dimension = new Dimension(30, 30);
        info.setPreferredSize(dimension);
        add(info);
    }

    private void restartButton(){
        JButton restart = new JButton("Restart");
        restart.addActionListener(Restart.getInstance());
        restart.setToolTipText("Restarts the game at current difficulty.");
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
        difficulty.addActionListener(ChooseDifficulty.getInstance());
        difficulty.setToolTipText("Starts a new game at chosen difficulty");
        Dimension dimension = new Dimension(100, 30);
        difficulty.setPreferredSize(dimension);
        add(difficulty);
    }
}
