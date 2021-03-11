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
    public BattleshipGUIController(int x,int y) {
        row = 0;
        col = 0;
        distanceLeft = 9;
        distanceTop = 31;
        cellWidth = 50;
        cellHeight = 50;
        numbersOfUserGuess = 0;
        this.xShip1Position=x;
        this.yShip1Position=y;
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
        ValueRange rangeX = ValueRange.of(xShip1Position-1, xShip1Position+1);
        ValueRange rangeY = ValueRange.of(yShip1Position-1, yShip1Position+1);
        if (rangeX.isValidIntValue(row) && rangeY.isValidIntValue(col))
            return true;
        else
            return false;
    }

}// End MouseClick class

