package org.example;

import org.example.model.Model;
import org.example.model.strategy.Difficulty;
import org.example.view.View;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model = new Model(Difficulty.DIFFICULT);
            model.gameboard.giveCoordinates(model.allSquaresReadyToPlace);
            View view = new View(model);
            view.init();
        });
    }

}