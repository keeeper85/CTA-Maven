package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class SquareFactory {

    public static List<Square> createYellowSquares(int amount){
        List<Square> yellowSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            yellowSquares.add(new Square(SquareColor.YELLOW));
        }
        return yellowSquares;
    }

    public static List<Square> createGoldSquares(int amount){
        List<Square> goldSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            goldSquares.add(new Square(SquareColor.GOLD));
        }
        return goldSquares;
    }

    public static List<Square> createBeigeSquares(int amount){
        List<Square> beigeSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            beigeSquares.add(new Square(SquareColor.BEIGE));
        }
        return beigeSquares;
    }

    public static List<Square> createOrangeSquares(int amount){
        List<Square> orangeSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            orangeSquares.add(new Square(SquareColor.ORANGE));
        }
        return orangeSquares;
    }

    public static List<Square> createPinkSquares(int amount){
        List<Square> pinkSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            pinkSquares.add(new Square(SquareColor.PINK));
        }
        return pinkSquares;
    }

    public static List<Square> createMagentaSquares(int amount){
        List<Square> magentaSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            magentaSquares.add(new Square(SquareColor.MAGENTA));
        }
        return magentaSquares;
    }

    public static List<Square> createRedSquares(int amount){
        List<Square> redSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            redSquares.add(new Square(SquareColor.RED));
        }
        return redSquares;
    }

    public static List<Square> createCrimsonSquares(int amount){
        List<Square> crimsonSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            crimsonSquares.add(new Square(SquareColor.CRIMSON));
        }
        return crimsonSquares;
    }

    public static List<Square> createCanarySquares(int amount){
        List<Square> canarySquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            canarySquares.add(new Square(SquareColor.CANARY));
        }
        return canarySquares;
    }

    public static List<Square> createGreenSquares(int amount){
        List<Square> greenSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            greenSquares.add(new Square(SquareColor.GREEN));
        }
        return greenSquares;
    }

    public static List<Square> createTealSquares(int amount){
        List<Square> tealSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            tealSquares.add(new Square(SquareColor.TEAL));
        }
        return tealSquares;
    }

    public static List<Square> createBlueSquares(int amount){
        List<Square> blueSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            blueSquares.add(new Square(SquareColor.BLUE));
        }
        return blueSquares;
    }

    public static List<Square> createPurpleSquares(int amount){
        List<Square> purpleSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            purpleSquares.add(new Square(SquareColor.PURPLE));
        }
        return purpleSquares;
    }

    public static List<Square> createTanSquares(int amount){
        List<Square> tanSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            tanSquares.add(new Square(SquareColor.TAN));
        }
        return tanSquares;
    }

    public static List<Square> createBrownSquares(int amount){
        List<Square> brownSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            brownSquares.add(new Square(SquareColor.BROWN));
        }
        return brownSquares;
    }

    public static List<Square> createAquaSquares(int amount){
        List<Square> aquaSquares = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            aquaSquares.add(new Square(SquareColor.AQUA));
        }
        return aquaSquares;
    }
}
