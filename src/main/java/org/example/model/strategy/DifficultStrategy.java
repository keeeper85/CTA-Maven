package org.example.model.strategy;

import org.example.model.Square;
import org.example.model.SquareFactory;
import org.example.model.constants.Constants;
import org.example.model.constants.SquareColor;
import org.example.model.constants.SquaresAmount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DifficultStrategy implements Strategy {
    @SquaresAmount(value = Constants.TOTAL_SQUARES_AMOUNT, description = "The total number of created squares must equal the value.")
    @Override
    public List<Square> getSquares() {
        List<Square> difficultList = new ArrayList<>();

        difficultList.addAll(SquareFactory.createColoredSquares(36, SquareColor.BLUE));
        difficultList.addAll(SquareFactory.createColoredSquares(36, SquareColor.YELLOW));
        difficultList.addAll(SquareFactory.createColoredSquares(30, SquareColor.ORANGE));
        difficultList.addAll(SquareFactory.createColoredSquares(30, SquareColor.RED));
        difficultList.addAll(SquareFactory.createColoredSquares(30, SquareColor.GREEN));
        difficultList.addAll(SquareFactory.createColoredSquares(30, SquareColor.BROWN));
        difficultList.addAll(SquareFactory.createColoredSquares(24, SquareColor.BEIGE));
        difficultList.addAll(SquareFactory.createColoredSquares(24, SquareColor.PINK));
        difficultList.addAll(SquareFactory.createColoredSquares(24, SquareColor.PURPLE));
        difficultList.addAll(SquareFactory.createColoredSquares(24, SquareColor.TAN));
        difficultList.addAll(SquareFactory.createColoredSquares(24, SquareColor.AQUA));
        difficultList.addAll(SquareFactory.createColoredSquares(12, SquareColor.CRIMSON));
        difficultList.addAll(SquareFactory.createColoredSquares(12, SquareColor.CANARY));
        difficultList.addAll(SquareFactory.createColoredSquares(9, SquareColor.TEAL));
        difficultList.addAll(SquareFactory.createColoredSquares(9, SquareColor.MAGENTA));
        difficultList.addAll(SquareFactory.createColoredSquares(6, SquareColor.GOLD));

        Collections.shuffle(difficultList);

        return difficultList;
    }
}
