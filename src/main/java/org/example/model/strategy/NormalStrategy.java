package org.example.model.strategy;

import org.example.model.Square;
import org.example.model.SquareFactory;
import org.example.model.constants.SquaresAmount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NormalStrategy implements Strategy {
    @SquaresAmount(value = 360, description = "The total number of created squares must equal the value.")
    @Override
    public List<Square> getSquares() {
        List<Square> normalList = new ArrayList<>();

        normalList.addAll(SquareFactory.createBlueSquares(36));
        normalList.addAll(SquareFactory.createYellowSquares(36));
        normalList.addAll(SquareFactory.createOrangeSquares(30));
        normalList.addAll(SquareFactory.createRedSquares(30));
        normalList.addAll(SquareFactory.createGreenSquares(30));
        normalList.addAll(SquareFactory.createBrownSquares(30));
        normalList.addAll(SquareFactory.createBeigeSquares(24));
        normalList.addAll(SquareFactory.createPinkSquares(24));
        normalList.addAll(SquareFactory.createPurpleSquares(24));
        normalList.addAll(SquareFactory.createTanSquares(24));
        normalList.addAll(SquareFactory.createAquaSquares(24));
        normalList.addAll(SquareFactory.createCrimsonSquares(15));
        normalList.addAll(SquareFactory.createCanarySquares(15));
        normalList.addAll(SquareFactory.createTealSquares(12));
        normalList.addAll(SquareFactory.createGoldSquares(6));

        Collections.shuffle(normalList);

        return normalList;
    }
}
