package com.example.battleshipv7.entity;

public class Battleship {
    public static final int VERTICAL = 0;
    public static final int HORIZONTAL = 1;
    private final int x;
    private final int y;
    private final int orientation;
    private final boolean[] sections;

    //constructor
    public Battleship(int length, int x, int y, int orientation) {
        sections = new boolean[length];
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getOrientation() {
        return orientation;
    }

    public boolean[] getSections() {
        return sections;
    }

    public boolean alive() {
        for (boolean section : sections)
            if (!section)
                return true;
        return false;
    }
}
