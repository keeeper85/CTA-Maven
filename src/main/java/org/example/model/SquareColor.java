package org.example.model;

import java.awt.*;

public enum SquareColor {

    YELLOW (new Color(240, 240, 120)),
    GOLD (new Color(255, 215, 0)),
    BEIGE (new Color(245, 225, 220)),
    ORANGE (new Color(255, 100, 0)),
    PINK (new Color(255, 150, 180)),
    MAGENTA (new Color(255, 0, 255)),
    RED (new Color(255, 0, 0)),
    CRIMSON (new Color(150, 0, 0)),
    CANARY (new Color(150, 255, 0)),
    GREEN (new Color(0, 100, 0)),
    TEAL (new Color(0, 120, 120)),
    BLUE (new Color(0, 100, 255)),
    PURPLE (new Color(120, 0, 120)),
    TAN (new Color(220, 170, 100)),
    BROWN (new Color(150, 75, 0)),
    AQUA (new Color(0, 255, 255));

    private final Color color;

    SquareColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
