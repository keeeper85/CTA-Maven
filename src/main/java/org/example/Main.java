package org.example;
import org.example.controller.Controller;
import org.example.view.*;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Controller controller = new Controller();
            View view = new View(controller);
            view.init();

            TopPanel topPanel = new TopPanel();
            MiddlePanel midPanel = new MiddlePanel(controller);
            BottomPanel botPanel = new BottomPanel();

            BoxLayout boxLayout = new BoxLayout(view.getContentPane(), BoxLayout.Y_AXIS);

            view.setLayout(boxLayout);
            view.add(topPanel);
            view.add(midPanel);
            view.add(botPanel);

            topPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, (int) (view.getHeight() * 0.05)));
            midPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, (int) (view.getHeight() * 0.75)));
            botPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, (int) (view.getHeight() * 0.2)));


        });
    }

}