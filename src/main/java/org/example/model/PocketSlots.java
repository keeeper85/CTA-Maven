package org.example.model;

public enum PocketSlots {

    SLOT_1 (304, 804),
    SLOT_2 (366, 804),
    SLOT_3 (428, 804),
    SLOT_4 (490, 804),
    SLOT_5 (552, 804),
    SLOT_6 (614, 804),
    SLOT_7 (676, 804);

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
