package org.example.view;

import org.example.controller.Controller;
import org.example.controller.EventListener;

import javax.swing.*;
import java.awt.*;

public class View  extends JFrame {

    private Controller controller;
    private Board board;

    public View(Controller controller) throws HeadlessException {
        this.controller = controller;
    }

    public void init() {
        board = new Board();
        add(board);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Clean Them All!");
        setVisible(true);
    }

    public void setEventListener(EventListener eventListener){
        board.setEventListener(eventListener);
    }

    public void update(){
        board.repaint();
    }
}
