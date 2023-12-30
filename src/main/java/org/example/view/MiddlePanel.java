package org.example.view;

import org.example.controller.EventListener;

import javax.swing.*;
import java.awt.*;

public class MiddlePanel extends JPanel {

    private View view;
    private EventListener eventListener;

    public MiddlePanel() {
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);
    }
}
