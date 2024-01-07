package org.example;

import org.example.model.Gameboard;
import org.example.model.Model;
import org.example.model.Square;
import org.example.model.layers.Layers;
import org.example.model.strategy.Difficulty;
import org.example.view.GameboardView;
import org.example.view.View;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model = new Model(Difficulty.EASY);
            model.gameboard.giveCoordinates(model.allSquaresReadyToPlace);
            View view = new View(model);
            view.init(new GameboardView(model));
        });
//        Model model = new Model(Difficulty.NORMAL);
//        model.gameboard.giveCoordinates(model.allSquaresReadyToPlace);
//        System.out.println(model.maxScore);



//        int total = 0;
//
//        for (Layers value : Layers.values()) {
//            int count = 0;
//            int[][] layer = value.getLayer();
//
//            for (int i = 0; i < layer.length; i++) {
//                for (int j = 0; j < layer[0].length; j++) {
//                    if (layer[i][j] == 1) count++;
//                }
//            }
//            total += count;
//            System.out.println(value.name() + " " + count);
//        }
//        System.out.println("-----------------");
//        System.out.println("Total " + total);

    }

}