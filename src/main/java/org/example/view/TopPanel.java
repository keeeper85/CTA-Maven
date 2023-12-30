package org.example.view;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    public TopPanel() {
        setVisible(true);
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
        setLayout(boxLayout);
        restartButton();
        add(Box.createHorizontalStrut(20));
        revertButton();
        add(Box.createHorizontalStrut(20));
        chooseDifficultyButton();
    }

    private void restartButton(){
        JButton restart = new JButton("Restart");
        Dimension dimension = new Dimension(100, 30);
        restart.setPreferredSize(dimension);
        add(restart);
        restart.setVisible(true);
    }

    private void revertButton(){
        JButton revert = new JButton("Revert");
        Dimension dimension = new Dimension(100, 30);
        revert.setPreferredSize(dimension);
        add(revert);
        revert.setVisible(true);
    }

    private void chooseDifficultyButton(){
        JButton difficulty = new JButton("Difficulty");
        Dimension dimension = new Dimension(100, 30);
        difficulty.setPreferredSize(dimension);
        add(difficulty);
        difficulty.setVisible(true);
    }
}
