package org.example.model.strategy;

import org.example.model.Square;
import org.example.model.SquareFactory;
import org.example.model.constants.SquaresAmount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EasyStrategy implements Strategy {
    @SquaresAmount(value = 360, description = "The total number of created squares must equal the value.")
    @Override
    public List<Square> getSquares() {

        List<Square> easyList = new ArrayList<>();

        easyList.addAll(SquareFactory.createBlueSquares(30));
        easyList.addAll(SquareFactory.createYellowSquares(30));
        easyList.addAll(SquareFactory.createOrangeSquares(30));
        easyList.addAll(SquareFactory.createRedSquares(30));
        easyList.addAll(SquareFactory.createGreenSquares(30));
        easyList.addAll(SquareFactory.createBrownSquares(30));
        easyList.addAll(SquareFactory.createBeigeSquares(24));
        easyList.addAll(SquareFactory.createPinkSquares(24));
        easyList.addAll(SquareFactory.createPurpleSquares(24));
        easyList.addAll(SquareFactory.createTanSquares(24));
        easyList.addAll(SquareFactory.createAquaSquares(24));
        easyList.addAll(SquareFactory.createCrimsonSquares(18));
        easyList.addAll(SquareFactory.createCanarySquares(18));
        easyList.addAll(SquareFactory.createTealSquares(18));
        easyList.addAll(SquareFactory.createGoldSquares(6));

        Collections.shuffle(easyList);

        return easyList;
    }
}
