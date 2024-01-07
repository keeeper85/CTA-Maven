package org.example.model.buttonlogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        String message = "Click on the colorful squares to move them to the pocket below.\n" +
                "Once you get there 3 squares of the same color, they will disappear.\n" +
                "If you remove all squares, you win the game.\n" +
                "If you get your pocket full, you lose.\n" +
                "Good luck!";

        JOptionPane.showMessageDialog(null, message);

    }
}
