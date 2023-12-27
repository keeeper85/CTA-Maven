package org.example.view;

import org.example.controller.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Board extends JPanel {

    private View view;
    private EventListener eventListener;

    public Board(View view) {
        this.view = view;
        ClickHandler clickHandler = new ClickHandler();
        addMouseListener(clickHandler);
        setFocusable(true);
    }

    class ClickHandler extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);

        }
    }
}
