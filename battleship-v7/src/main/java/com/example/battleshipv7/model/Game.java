package com.example.battleshipv7.model;

public class Game {
    boolean aliveShip;
    boolean hitShip;

    public int xShipPosition;
    public int yShipPosition;
    public int xClickPosition;
    public int yClickPosition;

    public Game(int xShipPosition, int yShipPosition, int xClickPosition, int yClickPosition) {
        this.xShipPosition = xShipPosition;
        this.yShipPosition = yShipPosition;
        this.xClickPosition = xClickPosition;
        this.yClickPosition = yClickPosition;
    }
}
