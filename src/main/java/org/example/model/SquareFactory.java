package org.example.model;

import org.example.model.constants.SquareColor;

import java.util.ArrayList;
import java.util.List;

public class SquareFactory {

    public static List<Square> createColoredSquares(int amount, SquareColor color) {
        List<Square> coloredSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            String name = color.name().toLowerCase() + i;
            Square square = new Square(color, name);
            coloredSquares.add(square);
        }
        return coloredSquares;
    }

    public static List<Square> createYellowSquares(int amount) {
        List<Square> yellowSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            String name = "yellow" + i;
            Square square = new Square(SquareColor.YELLOW, name);
            yellowSquares.add(square);
        }
        return yellowSquares;
    }

    public static List<Square> createGoldSquares(int amount){
        List<Square> goldSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "gold" + i;
            Square square = new Square(SquareColor.GOLD, name);
            goldSquares.add(square);
        }
        return goldSquares;
    }

    public static List<Square> createBeigeSquares(int amount){
        List<Square> beigeSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "beige" + i;
            Square square = new Square(SquareColor.BEIGE, name);
            beigeSquares.add(square);
        }
        return beigeSquares;
    }

    public static List<Square> createOrangeSquares(int amount){
        List<Square> orangeSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "orange" + i;
            Square square = new Square(SquareColor.ORANGE, name);
            orangeSquares.add(square);
        }
        return orangeSquares;
    }

    public static List<Square> createPinkSquares(int amount){
        List<Square> pinkSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "pink" + i;
            Square square = new Square(SquareColor.PINK, name);
            pinkSquares.add(square);
        }
        return pinkSquares;
    }

    public static List<Square> createMagentaSquares(int amount){
        List<Square> magentaSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "magenta" + i;
            Square square = new Square(SquareColor.MAGENTA, name);
            magentaSquares.add(square);
        }
        return magentaSquares;
    }

    public static List<Square> createRedSquares(int amount){
        List<Square> redSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "red" + i;
            Square square = new Square(SquareColor.RED, name);
            redSquares.add(square);
        }
        return redSquares;
    }

    public static List<Square> createCrimsonSquares(int amount){
        List<Square> crimsonSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "crimson" + i;
            Square square = new Square(SquareColor.CRIMSON, name);
            crimsonSquares.add(square);
        }
        return crimsonSquares;
    }

    public static List<Square> createCanarySquares(int amount){
        List<Square> canarySquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "canary" + i;
            Square square = new Square(SquareColor.CANARY, name);
            canarySquares.add(square);
        }
        return canarySquares;
    }

    public static List<Square> createGreenSquares(int amount){
        List<Square> greenSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "green" + i;
            Square square = new Square(SquareColor.GREEN, name);
            greenSquares.add(square);
        }
        return greenSquares;
    }

    public static List<Square> createTealSquares(int amount){
        List<Square> tealSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "teal" + i;
            Square square = new Square(SquareColor.TEAL, name);
            tealSquares.add(square);
        }
        return tealSquares;
    }

    public static List<Square> createBlueSquares(int amount){
        List<Square> blueSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "blue" + i;
            Square square = new Square(SquareColor.BLUE, name);
            blueSquares.add(square);
        }
        return blueSquares;
    }

    public static List<Square> createPurpleSquares(int amount){
        List<Square> purpleSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "purple" + i;
            Square square = new Square(SquareColor.PURPLE, name);
            purpleSquares.add(square);
        }
        return purpleSquares;
    }

    public static List<Square> createTanSquares(int amount){
        List<Square> tanSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "tan" + i;
            Square square = new Square(SquareColor.TAN, name);
            tanSquares.add(square);
        }
        return tanSquares;
    }

    public static List<Square> createBrownSquares(int amount){
        List<Square> brownSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "brown" + i;
            Square square = new Square(SquareColor.BROWN, name);
            brownSquares.add(square);
        }
        return brownSquares;
    }

    public static List<Square> createAquaSquares(int amount){
        List<Square> aquaSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String name = "aqua" + i;
            Square square = new Square(SquareColor.AQUA, name);
            aquaSquares.add(square);
        }
        return aquaSquares;
    }
}
