package org.example;

import org.example.model.Model;
import org.example.model.Square;
import org.example.model.strategy.DifficultStrategy;
import org.example.model.strategy.Difficulty;
import org.example.view.View;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            Model model = new Model();
//            View view = new View(model);
//            view.init();
//        });

        Model model = new Model(Difficulty.EASY);
        model.gameboard.giveCoordinates(model.allSquaresReadyToPlace);
        for (Square square : model.gameboard.squaresOnTheBoard) {
            System.out.println(square.toString());
        }

    }

}