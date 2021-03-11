package com.example.battleshipv7.controller;

import com.example.battleshipv7.GUI.Update_view;
import org.w3c.dom.ranges.Range;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.temporal.ValueRange;

public class BattleshipGUIController implements MouseListener {
    int row;
    int col;
    int distanceLeft;
    int distanceTop;
    int cellWidth;
    int cellHeight;
    int numbersOfUserGuess;
    boolean isShip;

    int xShip1Position;
    int yShip1Position;
    int xShip2Position;
    int yShip2Position;
    int xShip3Position;
    int yShip3Position;

    //setters
    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }


    public void setCellWidth(int cellWidth) {
        this.cellWidth = cellWidth;
    }

    public void setCellHeight(int cellHeight) {
        this.cellHeight = cellHeight;
    }

    //getters
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


    public int getCellWidth() {
        return cellWidth;
    }

    public int getCellHeight() {
        return cellHeight;
    }

    //constructor
    public BattleshipGUIController(int x1,int y1,int x2,int y2,int x3,int y3) {
        row = 0;
        col = 0;
        distanceLeft = 9;
        distanceTop = 31;
        cellWidth = 50;
        cellHeight = 50;
        numbersOfUserGuess = 0;
        this.xShip1Position=x1;
        this.yShip1Position=y1;
        this.xShip2Position=x2;
        this.yShip2Position=y2;
        this.xShip3Position=x3;
        this.yShip3Position=y3;

    }

    public BattleshipGUIController() {

        distanceLeft = 9;
        distanceTop = 31;
        cellWidth = 50;
        cellHeight = 50;
        numbersOfUserGuess=0;

    }

    //userGuess
    @Override
    public void mouseClicked(MouseEvent e) {
        numbersOfUserGuess++;
        Update_view update_view = new Update_view();

        if(numbersOfUserGuess<=3) {
//            JFrame frame = new JFrame("Show Message Dialog");
        this.setRow(Math.abs((e.getX() - distanceLeft) / cellWidth));
        this.setCol(Math.abs((e.getY() - distanceTop) / cellHeight));
//            update_view.displayMessage(row, col, "Your guess is " + " x " + col + " y" + row);
            isShip=comparePosition();
            if (isShip)
                update_view.displayHit();
            else
                update_view.displayMiss();

                }
        else{
            update_view.displayMessage("Game over");
        }
    }// End mouseClicked method

    @Override
    public void mousePressed(MouseEvent e) {
    }// End mousePressed method

    @Override
    public void mouseReleased(MouseEvent e) {

    }// End mouseReleased method

    @Override
    public void mouseEntered(MouseEvent e) {

    }// End mouseEntered method

    @Override
    public void mouseExited(MouseEvent e) {

    }// End mouseExited method

    public boolean comparePosition()
    {
        ValueRange rangeX1 = ValueRange.of(xShip1Position-1, xShip1Position+1);
        ValueRange rangeY1 = ValueRange.of(yShip1Position-1, yShip1Position+1);
        ValueRange rangeX2 = ValueRange.of(xShip2Position-1, xShip2Position+1);
        ValueRange rangeY2 = ValueRange.of(yShip2Position-1, yShip2Position+1);
        ValueRange rangeX3 = ValueRange.of(xShip3Position-1, xShip3Position+1);
        ValueRange rangeY3 = ValueRange.of(yShip3Position-1, yShip3Position+1);
        if (rangeX1.isValidIntValue(row) && rangeY1.isValidIntValue(col))
            return true;
        else if (rangeX2.isValidIntValue(row) && rangeY2.isValidIntValue(col))
            return true;
        else if (rangeX3.isValidIntValue(row) && rangeY3.isValidIntValue(col))
            return true;
        else
            return false;
    }

}// End MouseClick class

