package org.example.view;

import org.example.controller.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Square extends JComponent {

    EventListener eventListener;
    Square square;
    boolean isClickable = true;

    public Square() {
        square = this;
        square.setVisible(true);
        square.setFocusable(true);
        square.addMouseListener(new ClickHandler());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(50,50,100,100);
    }

    public void setEventListener(EventListener eventListener){
        this.eventListener = eventListener;
    }

    class ClickHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            System.out.println(e.getPoint());
        }
    }
}
