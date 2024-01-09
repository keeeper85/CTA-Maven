package org.example;

import org.example.model.Model;
import org.example.model.constants.Constants;
import org.example.model.strategy.Difficulty;
import org.example.view.GameboardView;
import org.example.view.View;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Difficulty difficulty = chooseDifficulty("Choose difficulty:", "Higher difficulty brings more rare colors.");
            Model model = new Model(difficulty);
            model.gameboard.giveCoordinates(model.allSquaresReadyToPlace);
            new View(model);
        });
    }

    public static Difficulty chooseDifficulty(String title, String message){

        String[] options = {"Easy", "Normal", "Difficult", "How to play?"};
        int result = JOptionPane.showOptionDialog(
                null,
                message,
                title,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        switch (result){
            case 0: return Difficulty.EASY;
            case 1: return Difficulty.NORMAL;
            case 2: return Difficulty.DIFFICULT;
            case 3: JOptionPane.showMessageDialog(null, Constants.HOW_TO_PLAY);
            default: return Difficulty.EASY;
        }
    }
}