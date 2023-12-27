package org.example.view;

import org.example.controller.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Board extends JPanel {

    private View view;
    private EventListener eventListener;

    public Board() {

        ClickHandler clickHandler = new ClickHandler();
        addMouseListener(clickHandler);
        setFocusable(true);
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(80, 80, 20, 20);
    }

    public void setEventListener(EventListener eventListener){
        this.eventListener = eventListener;
    }

    class ClickHandler extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            eventListener.moveToPocket();
        }
    }
}
