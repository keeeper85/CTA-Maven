package org.example.view;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {

    public BottomPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(Box.createVerticalStrut(200));
        setBackground(Color.LIGHT_GRAY);
        addPocketComponent();
    }

    public void addPocketComponent(){
        Pocket pocket = new Pocket();
        pocket.setPreferredSize(new Dimension(700,80));
        add(pocket);
    }
}
