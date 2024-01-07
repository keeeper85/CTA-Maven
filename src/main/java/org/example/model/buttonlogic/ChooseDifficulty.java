package org.example.model.buttonlogic;

import org.example.model.Model;
import org.example.model.strategy.Difficulty;
import org.example.view.GameboardView;
import org.example.view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseDifficulty implements ActionListener {

    private View view;
    private static ChooseDifficulty chooseDifficulty;

    private ChooseDifficulty() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] options = {"Easy", "Normal", "Difficult"};
        int result = JOptionPane.showOptionDialog(
                null,
                "Higher difficulty brings more rare squares.",
                "Choose difficulty:",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        switch (result){
            case 0: restartAtChosenDifficulty(Difficulty.EASY);
            break;
            case 1: restartAtChosenDifficulty(Difficulty.NORMAL);
            break;
            case 2: restartAtChosenDifficulty(Difficulty.DIFFICULT);
            break;
        }
    }

    public void restartAtChosenDifficulty(Difficulty difficulty){
        Model model = new Model(difficulty);
        model.gameboard.giveCoordinates(model.allSquaresReadyToPlace);
        view.remove(view.gameboardView);
        view.remove(view.topPanel);
        view.init(new GameboardView(model));
        view.revalidate();
        view.repaint();
    }

    public void setView(View view) {
        this.view = view;
    }

    public static ChooseDifficulty getInstance(){
        if (chooseDifficulty == null) chooseDifficulty = new ChooseDifficulty();
        return chooseDifficulty;
    }
}
