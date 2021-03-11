package com.example.battleshipv7.GUI;

import com.example.battleshipv7.entity.Credits;
import com.example.battleshipv7.entity.Instructions;
import com.example.battleshipv7.entity.Message;
import com.example.battleshipv7.entity.Message;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Update_view extends JFrame implements ActionListener {

    public Update_view() {
    }

    public void displayBoard() {
        //open main board
        BoardGUI board = new BoardGUI();
        board.createMainBoard();
    }

    public void displayMessage(String message) {
        Message message1 = new Message(message);

    }

    public void displayHit() {

        Message message1 = new Message("Hit !!");

    }

    public void displayMiss() {
        Message message1 = new Message("Miss !!");
    }

    public void displayBattleshipGUI() {
        //open main board
        BattleshipGUI play = new BattleshipGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BoardGUI.frame) {
            displayBoard();
        }
        if (e.getSource() == BoardGUI.playBtn) {
            displayBattleshipGUI();
            BoardGUI.frame.setVisible(false);
        }

        if (e.getSource() == BoardGUI.instructionBtn) {
            Instructions rules = new Instructions();
        }

        if (e.getSource()== Message.closeBtn)
        {
            Message.frame.setVisible(false);
        }
        if (e.getSource()==BattleshipGUI.backToMain)
        {
            BattleshipGUI.frame.setVisible(false);
            BoardGUI.frame.setVisible(true);
        }
        if (e.getSource()==BoardGUI.creditBtn)
        {
            Credits.frame.setVisible(true);
        }
    }
}

