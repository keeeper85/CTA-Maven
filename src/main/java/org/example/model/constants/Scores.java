package org.example.model.constants;

import java.awt.*;

public enum Scores {

    YELLOW ("yellow", 1),
    GOLD ("gold", 24),
    BEIGE ("beige", 3),
    ORANGE ("orange", 2),
    PINK ("pink", 3),
    MAGENTA ("magenta", 12),
    RED ("red", 2),
    CRIMSON ("crimson", 6),
    CANARY ("canary", 6),
    GREEN ("green", 2),
    TEAL ("teal", 12),
    BLUE ("blue", 1),
    PURPLE ("purple", 3),
    TAN ("tan", 3),
    BROWN ("brown", 2),
    AQUA ("aqua", 3);

    private String color;
    private int points;

    Scores(String color, int points) {
        this.color = color;
        this.points = points;
    }

    public String getColor() {
        return color;
    }

    public int getPoints() {
        return points;
    }
}
