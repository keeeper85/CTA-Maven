package org.example.controller;

import org.example.view.GameboardView;
import org.example.view.SquareView;

public class Controller implements EventListener{

    private static Controller controller;

    @Override
    public void moveToPocket(SquareView squareView, GameboardView gameboardView) {

        System.out.println("test");
        gameboardView.addSquareToPocket(squareView);
    }

    private Controller() {
    }

    public static Controller getInstance(){
        if (controller == null) controller = new Controller();
        return controller;
    }
}
