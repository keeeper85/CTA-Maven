package org.example.controller;

import org.example.view.MiddlePanel;
import org.example.view.Square;

public interface EventListener {

    void moveToPocket(Square square, MiddlePanel middlePanel);
}
