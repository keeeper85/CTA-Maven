package org.example.model;

import org.example.model.constants.Constants;
import org.example.model.constants.PocketSlots;
import org.example.model.constants.SquareColor;

import java.util.*;

public class Pocket {

    private TreeMap<PocketSlots, Square> squaresInPocket;
    private Model model;

    public Pocket(Model model) {
        this.model = model;
        initPocket();
    }

    private void initPocket(){
        squaresInPocket = new TreeMap<>();
        squaresInPocket.put(PocketSlots.SLOT_1, null);
        squaresInPocket.put(PocketSlots.SLOT_2, null);
        squaresInPocket.put(PocketSlots.SLOT_3, null);
        squaresInPocket.put(PocketSlots.SLOT_4, null);
        squaresInPocket.put(PocketSlots.SLOT_5, null);
        squaresInPocket.put(PocketSlots.SLOT_6, null);
        squaresInPocket.put(PocketSlots.SLOT_7, null);
    }

    public void addSquareToPocket(Square square){

        if (noFreeSlots()) model.gameLost();

        for (Map.Entry<PocketSlots, Square> slot : squaresInPocket.entrySet()) {
            square.setPocketSlot(slot.getKey());
            if (slot.getValue() == null) {
                slot.setValue(square);
                break;
            }
        }
        removeSquareFromGameBoard(square);
    }

    private void removeSquareFromGameBoard(Square square) {
        model.gameboard.removeSquare(square);
    }

    private boolean noFreeSlots() {
        int i = 0;
        for (Square slot : squaresInPocket.values()) {
            if (slot != null) i++;
        }
        return i >= Constants.POCKET_SIZE;
    }

    public void deleteTripleFromPocket(Square square){

        SquareColor color = square.getSquareColor();
        ArrayList<PocketSlots> toDeleteFromPocket = new ArrayList<>();

        for (Map.Entry<PocketSlots, Square> entry : squaresInPocket.entrySet()) {
            if (entry.getValue() != null && entry.getValue().getSquareColor() == color) {
                toDeleteFromPocket.add(entry.getKey());
            }
        }

        if (toDeleteFromPocket.size() == Constants.SQUARES_FOR_REMOVAL){
            for (PocketSlots slot : toDeleteFromPocket) {
                squaresInPocket.put(slot, null);
            }
        }
    }

    public TreeMap<PocketSlots, Square> getSquaresInPocket() {
        return squaresInPocket;
    }
}
