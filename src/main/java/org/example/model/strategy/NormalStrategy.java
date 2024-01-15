package org.example.model.strategy;

import org.example.model.Square;
import org.example.model.SquareFactory;
import org.example.model.constants.Constants;
import org.example.model.constants.SquareColor;
import org.example.model.constants.SquaresAmount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NormalStrategy implements Strategy {
    @SquaresAmount(value = Constants.TOTAL_SQUARES_AMOUNT, description = "The total number of created squares must equal the value.")
    @Override
    public List<Square> getSquares() {
        List<Square> normalList = new ArrayList<>();

        normalList.addAll(SquareFactory.createColoredSquares(36, SquareColor.BLUE));
        normalList.addAll(SquareFactory.createColoredSquares(36, SquareColor.YELLOW));
        normalList.addAll(SquareFactory.createColoredSquares(30, SquareColor.ORANGE));
        normalList.addAll(SquareFactory.createColoredSquares(30, SquareColor.RED));
        normalList.addAll(SquareFactory.createColoredSquares(30, SquareColor.GREEN));
        normalList.addAll(SquareFactory.createColoredSquares(30, SquareColor.BROWN));
        normalList.addAll(SquareFactory.createColoredSquares(24, SquareColor.BEIGE));
        normalList.addAll(SquareFactory.createColoredSquares(24, SquareColor.PINK));
        normalList.addAll(SquareFactory.createColoredSquares(24, SquareColor.PURPLE));
        normalList.addAll(SquareFactory.createColoredSquares(24, SquareColor.TAN));
        normalList.addAll(SquareFactory.createColoredSquares(24, SquareColor.AQUA));
        normalList.addAll(SquareFactory.createColoredSquares(15, SquareColor.CRIMSON));
        normalList.addAll(SquareFactory.createColoredSquares(15, SquareColor.CANARY));
        normalList.addAll(SquareFactory.createColoredSquares(12, SquareColor.TEAL));
        normalList.addAll(SquareFactory.createColoredSquares(6, SquareColor.GOLD));

        Collections.shuffle(normalList);

        return normalList;
    }
}
