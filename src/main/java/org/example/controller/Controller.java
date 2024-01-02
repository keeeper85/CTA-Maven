package org.example.controller;

import org.example.view.GameboardView;
import org.example.view.Square;

public class Controller implements EventListener{

    private static Controller controller;

    @Override
    public void moveToPocket(Square square, GameboardView gameboardView) {

        System.out.println("test");
        gameboardView.addSquareToPocket(square);
    }

    private Controller() {
    }

    public static Controller getInstance(){
        if (controller == null) controller = new Controller();
        return controller;
    }
}
