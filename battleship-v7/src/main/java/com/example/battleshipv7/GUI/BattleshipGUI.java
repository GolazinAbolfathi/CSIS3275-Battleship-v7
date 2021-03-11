package com.example.battleshipv7.GUI;

import com.example.battleshipv7.controller.BattleshipGUIController;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import static javax.imageio.ImageIO.read;

public class BattleshipGUI extends JFrame {

    public int row;
    public int col;
    public static JFrame frame;
    public static JButton backToMain;

    public static JFrame getFrame() {
        return frame;
    }

    public static void setFrame(JFrame frame) {
        BattleshipGUI.frame = frame;
    }

    public BattleshipGUI() {
        frame=new JFrame();
        frame.setTitle("Battleship");
        frame.setSize(510, 510);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        this.row = 0;
        this.col = 0;
        String path = "/static/radar.jpg";
        BoardPaint boardPaint = new BoardPaint(path,0,0);
        frame.setContentPane(boardPaint);

        BattleshipGUIController mouseClick = new BattleshipGUIController();
        frame.addMouseListener(mouseClick);

        backToMain=new JButton("Back to Main Menu");
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 10;
        c.gridy = 0;
        // backToMain.setLocation(10,500);
        backToMain.setBounds(100,500,500,10);
        backToMain.addActionListener(new Update_view());
        frame.add(backToMain,c);
    } // End BattleshipGUI constructor

}// End BattleshipGUI class
