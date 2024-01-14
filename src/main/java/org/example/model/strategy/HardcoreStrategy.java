package org.example.model.strategy;

import org.example.model.Square;
import org.example.model.SquareFactory;
import org.example.model.constants.Constants;
import org.example.model.constants.SquareColor;
import org.example.model.constants.SquaresAmount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HardcoreStrategy implements Strategy{
    @SquaresAmount(value = Constants.TOTAL_SQUARES_AMOUNT, description = "The total number of created squares must equal the value.")
    @Override
    public List<Square> getSquares() {

        List<Square> hardcoreList = new ArrayList<>();

        hardcoreList.addAll(SquareFactory.createColoredSquares(36, SquareColor.BLUE));
        hardcoreList.addAll(SquareFactory.createColoredSquares(36, SquareColor.YELLOW));
        hardcoreList.addAll(SquareFactory.createColoredSquares(36, SquareColor.ORANGE));
        hardcoreList.addAll(SquareFactory.createColoredSquares(36, SquareColor.RED));
        hardcoreList.addAll(SquareFactory.createColoredSquares(36, SquareColor.GREEN));
        hardcoreList.addAll(SquareFactory.createColoredSquares(30, SquareColor.BROWN));
        hardcoreList.addAll(SquareFactory.createColoredSquares(30, SquareColor.BEIGE));
        hardcoreList.addAll(SquareFactory.createColoredSquares(30, SquareColor.PINK));
        hardcoreList.addAll(SquareFactory.createColoredSquares(18, SquareColor.PURPLE));
        hardcoreList.addAll(SquareFactory.createColoredSquares(18, SquareColor.TAN));
        hardcoreList.addAll(SquareFactory.createColoredSquares(12, SquareColor.AQUA));
        hardcoreList.addAll(SquareFactory.createColoredSquares(12, SquareColor.CRIMSON));
        hardcoreList.addAll(SquareFactory.createColoredSquares(9, SquareColor.CANARY));
        hardcoreList.addAll(SquareFactory.createColoredSquares(9, SquareColor.TEAL));
        hardcoreList.addAll(SquareFactory.createColoredSquares(6, SquareColor.MAGENTA));
        hardcoreList.addAll(SquareFactory.createColoredSquares(6, SquareColor.GOLD));

        Collections.shuffle(hardcoreList);

        return hardcoreList;
    }
}
