package org.example;

import org.example.controller.Controller;
import org.example.model.Model;
import org.example.view.View;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        View view = new View(controller);
        Model model = new Model();
        view.init();


    }
}