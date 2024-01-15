package org.example.model;

import org.example.model.constants.SquareColor;

import java.util.ArrayList;
import java.util.List;

public class SquareFactory {

    public static List<Square> createColoredSquares(int amount, SquareColor color) {
        List<Square> coloredSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            String name = color.name().toLowerCase() + i;
            Square square = new Square(color, name);
            coloredSquares.add(square);
        }
        return coloredSquares;
    }
}
