package com.example.battleshipv7.GUI;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class BoardPaint extends JPanel {
    ImageIcon img;
    String path;
    int x;
    int y;

    //default GameBoard constructor
    public BoardPaint(String path,int x,int y) {
//        img = null;
        this.path = path;
        this.x = x;
        this.y = y;
    }// End default constructor


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try{
            img=new ImageIcon(read(getClass().getResource(path)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        g.drawImage(img.getImage(), x, y, this.getWidth(), this.getHeight(), null);
        setVisible(true);

    }// End paintComponent method
}
