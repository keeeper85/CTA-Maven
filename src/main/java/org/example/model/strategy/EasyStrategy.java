package org.example.model.strategy;

import org.example.model.Square;
import org.example.model.SquareFactory;
import org.example.model.constants.Constants;
import org.example.model.constants.SquareColor;
import org.example.model.constants.SquaresAmount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EasyStrategy implements Strategy {
    @SquaresAmount(value = Constants.TOTAL_SQUARES_AMOUNT, description = "The total number of created squares must equal the value.")
    @Override
    public List<Square> getSquares() {

        List<Square> easyList = new ArrayList<>();

        easyList.addAll(SquareFactory.createColoredSquares(30, SquareColor.BLUE));
        easyList.addAll(SquareFactory.createColoredSquares(30, SquareColor.YELLOW));
        easyList.addAll(SquareFactory.createColoredSquares(30, SquareColor.ORANGE));
        easyList.addAll(SquareFactory.createColoredSquares(30, SquareColor.RED));
        easyList.addAll(SquareFactory.createColoredSquares(30, SquareColor.GREEN));
        easyList.addAll(SquareFactory.createColoredSquares(30, SquareColor.BROWN));
        easyList.addAll(SquareFactory.createColoredSquares(24, SquareColor.BEIGE));
        easyList.addAll(SquareFactory.createColoredSquares(24, SquareColor.PINK));
        easyList.addAll(SquareFactory.createColoredSquares(24, SquareColor.PURPLE));
        easyList.addAll(SquareFactory.createColoredSquares(24, SquareColor.TAN));
        easyList.addAll(SquareFactory.createColoredSquares(24, SquareColor.AQUA));
        easyList.addAll(SquareFactory.createColoredSquares(18, SquareColor.CRIMSON));
        easyList.addAll(SquareFactory.createColoredSquares(18, SquareColor.CANARY));
        easyList.addAll(SquareFactory.createColoredSquares(18, SquareColor.TEAL));
        easyList.addAll(SquareFactory.createColoredSquares(6, SquareColor.GOLD));

        Collections.shuffle(easyList);

        return easyList;
    }
}
