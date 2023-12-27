package org.example;

import org.example.controller.Controller;
import org.example.controller.EventListener;
import org.example.model.Model;
import org.example.view.Board;
import org.example.view.View;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {

        Main main = new Main();
        main.setVisible(true);

        main.setSize(500, 500);
        main.setTitle("Clean Them All");
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Board board = new Board();
        EventListener eventListener = new Controller();
        board.setEventListener(eventListener);
        main.add(board);




    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(10,10, 10, 10);
    }
}