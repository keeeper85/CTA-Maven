package org.example.model.strategy;

import org.example.model.Square;
import org.example.model.constants.Constants;
import org.example.model.constants.SquaresAmount;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// TODO RR: Static imports not always are bad. Use it properly to increase readability.
import static org.example.model.SquareFactory.createColoredSquares;
import static org.example.model.constants.SquareColor.*;

public class HardcoreStrategy implements Strategy{
    @SquaresAmount(value = Constants.TOTAL_SQUARES_AMOUNT, description = "The total number of created squares must equal the value.")
    @Override
    public List<Square> getSquares() {
        List<Square> hardcoreList = joinLists(
                createColoredSquares(36, BLUE),
                createColoredSquares(36, YELLOW),
                createColoredSquares(36, BLUE),
                createColoredSquares(36, YELLOW),
                createColoredSquares(36, ORANGE),
                createColoredSquares(36, RED),
                createColoredSquares(36, GREEN),
                createColoredSquares(30, BROWN),
                createColoredSquares(30, BEIGE),
                createColoredSquares(30, PINK),
                createColoredSquares(18, PURPLE),
                createColoredSquares(18, TAN),
                createColoredSquares(12, AQUA),
                createColoredSquares(12, CRIMSON),
                createColoredSquares(9, CANARY),
                createColoredSquares(9, TEAL),
                createColoredSquares(6, MAGENTA),
                createColoredSquares(6, GOLD)
        );
        Collections.shuffle(hardcoreList);
        return hardcoreList;
    }

    // TODO RR: I found this one on some stack. Will help to reduce code amount and also increase readability.
    // The method can be put into some separate class e.g. "Utils" and use in other similar classes from this module. 
    @SafeVarargs
    static <T> List<T> joinLists(List<T>... lists) {
        return Arrays.stream(lists).flatMap(java.util.Collection::stream).collect(Collectors.toList());
    }
}
