package org.example.model;

import org.example.view.PocketSlots;

import java.util.*;

public class Pocket {

    private static TreeMap<PocketSlots, Square> squaresInPocket = new TreeMap<>();

    static {
        squaresInPocket.put(PocketSlots.SLOT_1, null);
        squaresInPocket.put(PocketSlots.SLOT_2, null);
        squaresInPocket.put(PocketSlots.SLOT_3, null);
        squaresInPocket.put(PocketSlots.SLOT_4, null);
        squaresInPocket.put(PocketSlots.SLOT_5, null);
        squaresInPocket.put(PocketSlots.SLOT_6, null);
        squaresInPocket.put(PocketSlots.SLOT_7, null);
    }
    private Model model;
    private final int POCKET_SIZE = 7;
    private static Pocket pocket;

    public Pocket(Model model) {
        this.model = model;
        pocket = this;
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
        sortPocket();
    }

    private void removeSquareFromGameBoard(Square square) {
        model.gameboard.removeSquare(square);
    }

    private boolean noFreeSlots() {

        int i = 0;

        for (Square slot : squaresInPocket.values()) {
            if (slot != null) i++;
        }

        return i >= POCKET_SIZE;
    }

    public ArrayList<Square> getTriplesListForRemoval(Square square){

        SquareColor color = square.getSquareColor();
        ArrayList<PocketSlots> toDeleteFromPocket = new ArrayList<>();
        ArrayList<Square> toRemoveFromView = new ArrayList<>();

        for (Map.Entry<PocketSlots, Square> entry : squaresInPocket.entrySet()) {
            if (entry.getValue() != null && entry.getValue().getSquareColor() == color) {
                toDeleteFromPocket.add(entry.getKey());
                toRemoveFromView.add(entry.getValue());
            }
        }

        if (toDeleteFromPocket.size() == 3){
            for (PocketSlots slot : toDeleteFromPocket) {
                squaresInPocket.put(slot, null);
            }
        }

        sortPocket();

        return toRemoveFromView;
    }

    private void sortPocket(){

    }

    public static Pocket getInstance(Model model){
        if (pocket == null) pocket = new Pocket(model);
        return pocket;
    }
}
