package org.example.view;

public enum PocketSlots {

    SLOT_1 (274, 804),
    SLOT_2 (336, 804),
    SLOT_3 (398, 804),
    SLOT_4 (460, 804),
    SLOT_5 (522, 804),
    SLOT_6 (584, 804),
    SLOT_7 (646, 804);

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
