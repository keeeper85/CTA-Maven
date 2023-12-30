package org.example.view;

import org.example.controller.Controller;
import org.example.controller.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View extends JFrame {

    private Controller controller;
    private Square square;
    private EventListener eventListener;

    private MiddlePanel board;

    public View(Controller controller) throws HeadlessException {
        this.controller = controller;

//        addMouseListener(new ClickHandler());
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setTitle("Clean Them All!");
        setVisible(true);
    }

    public void setEventListener(EventListener eventListener){

    }

    public void update(){
        board.repaint();
    }

    class ClickHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            System.out.println(e.getPoint());
        }
    }
}
