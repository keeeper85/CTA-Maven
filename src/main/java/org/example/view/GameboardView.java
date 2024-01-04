package org.example.view;

import org.example.model.Model;
import org.example.model.Square;
import org.example.model.SquareColor;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class GameboardView extends JPanel {
    public List<SquareView> squareViews = new ArrayList<>();
    private PocketView pocketView;
    private Model model;
    private TreeMap<PocketSlots, SquareView> squareViewsInPocket;
    private GameboardView gameboardView;

    public GameboardView(Model model) {
        gameboardView = this;
        this.model = model;
        setVisible(true);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        drawSquares();
        drawPocket();
        initiateMap();
        repaint();
    }

    public void drawSquares(){

        for (Square square : model.gameboard.squaresOnTheBoard) {
            SquareView squareView = new SquareView(model, square);
            squareView.gameboardView = this;
            squareView.setBounds(square.getTopLeftPoint().x, square.getTopLeftPoint().y, square.getSQUARE_SIZE(), square.getSQUARE_SIZE());
            squareViews.add(squareView);
            add(squareView);
        }
    }

    public void drawPocket(){
        pocketView = new PocketView();
        pocketView.setBounds(pocketView.X, pocketView.Y, pocketView.WIDTH, pocketView.HEIGHT);
        pocketView.setVisible(true);
        add(pocketView);
    }

    private void initiateMap(){
        squareViewsInPocket = new TreeMap<>();

        squareViewsInPocket.put(PocketSlots.SLOT_1, null);
        squareViewsInPocket.put(PocketSlots.SLOT_2, null);
        squareViewsInPocket.put(PocketSlots.SLOT_3, null);
        squareViewsInPocket.put(PocketSlots.SLOT_4, null);
        squareViewsInPocket.put(PocketSlots.SLOT_5, null);
        squareViewsInPocket.put(PocketSlots.SLOT_6, null);
        squareViewsInPocket.put(PocketSlots.SLOT_7, null);
    }

    public void addSquareToPocket(SquareView squareView, PocketSlots pocketSlots){
        squareView.setLocation(pocketSlots.getX(), pocketSlots.getY());
        squareViewsInPocket.put(pocketSlots, squareView);
        if (haveTriples(squareView)) removeTriples(squareView);
//        sortPocket();
        revalidate();
        repaint();
    }

    public void removeTriples(SquareView squareView){

        List<PocketSlots> freedSlots = new ArrayList<>();

        SquareColor color = squareView.getSquare().getSquareColor();
        for (Map.Entry<PocketSlots, SquareView> squareViewEntry : squareViewsInPocket.entrySet()) {
            if (squareViewEntry.getValue() == null) continue;
            SquareColor valueColor = squareViewEntry.getValue().getSquare().getSquareColor();
            if (color.equals(valueColor)){
                freedSlots.add(squareViewEntry.getKey());
                remove(squareViewEntry.getValue());
                squareViews.remove(squareViewEntry.getValue());
            }
        }

        for (PocketSlots freedSlot : freedSlots) {
            squareViewsInPocket.put(freedSlot, null);
        }
    }

    private boolean haveTriples(SquareView squareView){
        int amount = 0;
        SquareColor color = squareView.getSquare().getSquareColor();

        for (SquareView value : squareViewsInPocket.values()) {
            if (value == null) continue;
            SquareColor valueColor = value.getSquare().getSquareColor();
            if (color.equals(valueColor)){
                amount++;
            }
        }

        return amount >= 3;
    }

    private void sortPocket(){
        List<SquareView> sortedSquares = new ArrayList<>();

        for (SquareView value : squareViewsInPocket.values()) {
            sortedSquares.add(value);
        }

        Collections.sort(sortedSquares, new Comparator<SquareView>() {
            @Override
            public int compare(SquareView o1, SquareView o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                } else if (o1 == null) {
                    return 1;
                } else if (o2 == null) {
                    return -1;
                }

                return o1.id.compareTo(o2.id);
            }
        });

        squareViewsInPocket.put(PocketSlots.SLOT_1, sortedSquares.get(0));
        squareViewsInPocket.put(PocketSlots.SLOT_2, sortedSquares.get(1));
        squareViewsInPocket.put(PocketSlots.SLOT_3, sortedSquares.get(2));
        squareViewsInPocket.put(PocketSlots.SLOT_4, sortedSquares.get(3));
        squareViewsInPocket.put(PocketSlots.SLOT_5, sortedSquares.get(4));
        squareViewsInPocket.put(PocketSlots.SLOT_6, sortedSquares.get(5));
        squareViewsInPocket.put(PocketSlots.SLOT_7, sortedSquares.get(6));

        swapSquareViews();
    }

    private void swapSquareViews() {
        for (Map.Entry<PocketSlots, SquareView> entry : squareViewsInPocket.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().setLocation(entry.getKey().getX(), entry.getKey().getY());
                revalidate();
                repaint();
            }
        }
    }
}
