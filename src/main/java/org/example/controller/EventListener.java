package org.example.controller;

import org.example.view.GameboardView;
import org.example.view.Square;

public interface EventListener {

    void moveToPocket(Square square, GameboardView gameboardView);
}
