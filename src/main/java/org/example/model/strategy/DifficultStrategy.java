package org.example.model.strategy;

import org.example.model.Square;
import org.example.model.SquareFactory;
import org.example.model.constants.Constants;
import org.example.model.constants.SquaresAmount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DifficultStrategy implements Strategy {
    @SquaresAmount(value = Constants.TOTAL_SQUARES_AMOUNT, description = "The total number of created squares must equal the value.")
    @Override
    public List<Square> getSquares() {
        List<Square> difficultList = new ArrayList<>();

        difficultList.addAll(SquareFactory.createBlueSquares(36));
        difficultList.addAll(SquareFactory.createYellowSquares(36));
        difficultList.addAll(SquareFactory.createOrangeSquares(30));
        difficultList.addAll(SquareFactory.createRedSquares(30));
        difficultList.addAll(SquareFactory.createGreenSquares(30));
        difficultList.addAll(SquareFactory.createBrownSquares(30));
        difficultList.addAll(SquareFactory.createBeigeSquares(24));
        difficultList.addAll(SquareFactory.createPinkSquares(24));
        difficultList.addAll(SquareFactory.createPurpleSquares(24));
        difficultList.addAll(SquareFactory.createTanSquares(24));
        difficultList.addAll(SquareFactory.createAquaSquares(24));
        difficultList.addAll(SquareFactory.createCrimsonSquares(12));
        difficultList.addAll(SquareFactory.createCanarySquares(12));
        difficultList.addAll(SquareFactory.createTealSquares(9));
        difficultList.addAll(SquareFactory.createMagentaSquares(9));
        difficultList.addAll(SquareFactory.createGoldSquares(6));

        Collections.shuffle(difficultList);

        return difficultList;
    }
}
