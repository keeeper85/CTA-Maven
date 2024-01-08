package org.example.model.buttonlogic;

import org.example.Main;
import org.example.model.Gameboard;
import org.example.model.Model;
import org.example.model.Square;
import org.example.model.strategy.Difficulty;
import org.example.view.GameboardView;
import org.example.view.TopPanel;
import org.example.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Restart implements ActionListener {

//    private Model model;
    private View view;
    private static Restart restart;
    private Difficulty difficulty;

    private Restart() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Model model = new Model(difficulty);
        model.gameboard.giveCoordinates(model.allSquaresReadyToPlace);
        model.resetCurrentScore();
        view.remove(view.gameboardView);
        view.remove(view.topPanel);
        view.init(new GameboardView(model));
        view.revalidate();
        view.repaint();
    }

//    public void setModel(Model model) {
//        this.model = model;
//    }

    public void setView(View view) {
        this.view = view;
    }

    public static Restart getInstance(){
        if (restart == null) restart = new Restart();
        return restart;
    }
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
