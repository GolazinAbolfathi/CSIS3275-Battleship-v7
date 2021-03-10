package com.example.battleshipv7.controller;

import com.example.battleshipv7.GUI.Update_view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BattleshipGUIController implements MouseListener {
    int row;
    int col;
    int distanceLeft;
    int distanceTop;
    int cellWidth;
    int cellHeight;
    int numbersOfUserGuess;

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
    public BattleshipGUIController() {
        row = 0;
        col = 0;
        distanceLeft = 9;
        distanceTop = 31;
        cellWidth = 50;
        cellHeight = 50;
        numbersOfUserGuess = 0;
    }

    //userGuess
    @Override
    public void mouseClicked(MouseEvent e) {
        numbersOfUserGuess++;
        Update_view update_view = new Update_view();

//        if(numbersOfUserGuess<=3) {
//            JFrame frame = new JFrame("Show Message Dialog");
        this.setRow(Math.abs((e.getX() - distanceLeft) / cellWidth));
        this.setCol(Math.abs((e.getY() - distanceTop) / cellHeight));
//            update_view.displayMessage(row, col, "Your guess is " + " x " + col + " y" + row);
        update_view.displayMessage(row, col, "Your guess is " + " x " + col + " y" + row);

        //        }
//        else{
//            update_view.displayMessage(row, col, "Game over");
//        }
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
}// End MouseClick class

