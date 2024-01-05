package org.example.model;

public enum PocketSlots {

    SLOT_1 (220, 804),
    SLOT_2 (304, 804),
    SLOT_3 (388, 804),
    SLOT_4 (472, 804),
    SLOT_5 (556, 804),
    SLOT_6 (640, 804),
    SLOT_7 (724, 804);

    private final int x, y;

    PocketSlots(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
