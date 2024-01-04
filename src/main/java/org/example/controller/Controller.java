package org.example.controller;

import org.example.model.Model;
import org.example.model.Pocket;
import org.example.model.Square;
import org.example.view.GameboardView;
import org.example.view.PocketSlots;
import org.example.view.SquareView;

import java.util.ArrayList;
import java.util.List;

public class Controller implements EventListener{

    private static Controller controller;
    private Model model;
    private List<Square> squaresForRemoval;

    @Override
    public void moveToPocket(SquareView squareView, GameboardView gameboardView) {

        Square square = squareView.getSquare();
        squaresForRemoval = square.onClick();

        PocketSlots freeSlot = square.getPocketSlot();
        gameboardView.addSquareToPocket(squareView, freeSlot);
        if (!squaresForRemoval.isEmpty()) {
            gameboardView.removeTriples(squaresForRemoval);
        }

    }

    private Controller(Model model) {
        this.model = model;
    }

    public static Controller getInstance(Model model){
        if (controller == null) controller = new Controller(model);
        return controller;
    }
}
