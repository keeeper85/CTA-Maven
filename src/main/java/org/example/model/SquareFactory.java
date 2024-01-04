package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class SquareFactory {

    public static List<Square> createYellowSquares(int amount) {
        List<Square> yellowSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            String id = "yellow" + i;
            Square square = new Square(SquareColor.YELLOW, id);
            yellowSquares.add(square);
        }
        return yellowSquares;
    }

    public static List<Square> createGoldSquares(int amount){
        List<Square> goldSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "gold" + i;
            Square square = new Square(SquareColor.GOLD, id);
            goldSquares.add(square);
        }
        return goldSquares;
    }

    public static List<Square> createBeigeSquares(int amount){
        List<Square> beigeSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "beige" + i;
            Square square = new Square(SquareColor.BEIGE, id);
            beigeSquares.add(square);
        }
        return beigeSquares;
    }

    public static List<Square> createOrangeSquares(int amount){
        List<Square> orangeSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "orange" + i;
            Square square = new Square(SquareColor.ORANGE, id);
            orangeSquares.add(square);
        }
        return orangeSquares;
    }

    public static List<Square> createPinkSquares(int amount){
        List<Square> pinkSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "pink" + i;
            Square square = new Square(SquareColor.PINK, id);
            pinkSquares.add(square);
        }
        return pinkSquares;
    }

    public static List<Square> createMagentaSquares(int amount){
        List<Square> magentaSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "magenta" + i;
            Square square = new Square(SquareColor.MAGENTA, id);
            magentaSquares.add(square);
        }
        return magentaSquares;
    }

    public static List<Square> createRedSquares(int amount){
        List<Square> redSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "red" + i;
            Square square = new Square(SquareColor.RED, id);
            redSquares.add(square);
        }
        return redSquares;
    }

    public static List<Square> createCrimsonSquares(int amount){
        List<Square> crimsonSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "crimson" + i;
            Square square = new Square(SquareColor.CRIMSON, id);
            crimsonSquares.add(square);
        }
        return crimsonSquares;
    }

    public static List<Square> createCanarySquares(int amount){
        List<Square> canarySquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "canary" + i;
            Square square = new Square(SquareColor.CANARY, id);
            canarySquares.add(square);
        }
        return canarySquares;
    }

    public static List<Square> createGreenSquares(int amount){
        List<Square> greenSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "green" + i;
            Square square = new Square(SquareColor.GREEN, id);
            greenSquares.add(square);
        }
        return greenSquares;
    }

    public static List<Square> createTealSquares(int amount){
        List<Square> tealSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "teal" + i;
            Square square = new Square(SquareColor.TEAL, id);
            tealSquares.add(square);
        }
        return tealSquares;
    }

    public static List<Square> createBlueSquares(int amount){
        List<Square> blueSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "blue" + i;
            Square square = new Square(SquareColor.BLUE, id);
            blueSquares.add(square);
        }
        return blueSquares;
    }

    public static List<Square> createPurpleSquares(int amount){
        List<Square> purpleSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "purple" + i;
            Square square = new Square(SquareColor.PURPLE, id);
            purpleSquares.add(square);
        }
        return purpleSquares;
    }

    public static List<Square> createTanSquares(int amount){
        List<Square> tanSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "tan" + i;
            Square square = new Square(SquareColor.TAN, id);
            tanSquares.add(square);
        }
        return tanSquares;
    }

    public static List<Square> createBrownSquares(int amount){
        List<Square> brownSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "brown" + i;
            Square square = new Square(SquareColor.BROWN, id);
            brownSquares.add(square);
        }
        return brownSquares;
    }

    public static List<Square> createAquaSquares(int amount){
        List<Square> aquaSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            String id = "aqua" + i;
            Square square = new Square(SquareColor.AQUA, id);
            aquaSquares.add(square);
        }
        return aquaSquares;
    }
}
