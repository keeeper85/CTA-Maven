package org.example;

import org.example.model.Gameboard;
import org.example.model.Model;
import org.example.model.Square;
import org.example.model.layers.Layers;
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
            System.out.println(view.gameboardView.squareViews.size());
        });


//        Model model = new Model(Difficulty.DIFFICULT);
//        Gameboard gameboard = new Gameboard();
//        gameboard.giveCoordinates(model.allSquaresReadyToPlace);
//        for (Square square : gameboard.squaresOnTheBoard) {
//            System.out.println(square.getLayer());
//        }
//        System.out.println(gameboard.squaresOnTheBoard.size());


    }

}