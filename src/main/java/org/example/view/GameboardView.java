package org.example.view;

import org.example.model.Model;
import org.example.model.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GameboardView extends JPanel {
    public List<SquareView> squareViews = new ArrayList<>();
    private PocketView pocketView;
    private Model model;

    private GameboardView gameboardView;

    public GameboardView(Model model) {
        gameboardView = this;
        this.model = model;
        setVisible(true);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        drawSquares();
        drawPocket();

        JButton button = new JButton("repaint");
        button.setVisible(true);
        button.setBounds(100,100, 100, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameboardView.revalidate();
                gameboardView.repaint();
//                System.out.println("test");
            }
        });
        add(button);

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

    public void addSquareToPocket(SquareView squareView, PocketSlots pocketSlots){
        squareView.setLocation(pocketSlots.getX(), pocketSlots.getY());
        repaint();
    }

    public void removeTriples(List<Square> squaresForRemoval){
        if (!squaresForRemoval.isEmpty()){
            for (Square square : squaresForRemoval) {
                for (SquareView squareView : squareViews) {
                    if (squareView.getSquare().id == square.id){
                        remove(squareView);
                        break;
                    }
                }
            }
            revalidate();
            repaint();
        }
    }
}
