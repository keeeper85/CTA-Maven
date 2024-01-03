package org.example.view;

public enum PocketSlots {

    SLOT_1 (224, 804),
    SLOT_2 (286, 804),
    SLOT_3 (348, 804),
    SLOT_4 (410, 804),
    SLOT_5 (472, 804),
    SLOT_6 (534, 804),
    SLOT_7 (596, 804);

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
