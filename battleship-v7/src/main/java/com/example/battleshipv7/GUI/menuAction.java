package com.example.battleshipv7.GUI;

import com.example.battleshipv7.entity.Message;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== Message.closeBtn)
        {
            Message.frame.setVisible(false);
        }
        if (e.getSource()==BattleshipGUI.backToMain)
        {
            BattleshipGUI.frame.setVisible(false);
            BoardGUI.frame.setVisible(true);
        }

    }
}
