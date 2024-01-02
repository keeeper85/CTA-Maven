package org.example.controller;

import org.example.view.GameboardView;
import org.example.view.SquareView;

public interface EventListener {

    void moveToPocket(SquareView squareView, GameboardView gameboardView);
}
