package org.example;
import org.example.controller.Controller;
import org.example.view.*;
import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            View view = new View();
            view.init();
        });
    }

}