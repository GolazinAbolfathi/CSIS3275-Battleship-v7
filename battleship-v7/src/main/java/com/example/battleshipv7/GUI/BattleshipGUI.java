package com.example.battleshipv7.GUI;

import com.example.battleshipv7.controller.BattleshipGUIController;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class BattleshipGUI extends JFrame {

    public int row;
    public int col;
    public static JFrame frame;
    public static JButton backToMain;


    public BattleshipGUI() {
        frame=new JFrame();
        frame.setTitle("Battleship");
        frame.setSize(510, 510);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        this.row = 0;
        this.col = 0;
        String path = "src/main/resources/static/radar.jpg";
        GameBoard gameBoard = new GameBoard();
        gameBoard.setPath(path);
        gameBoard.setX(0);
        gameBoard.setY(0);
        frame.setContentPane(gameBoard);

        BattleshipGUIController mouseClick = new BattleshipGUIController();
        frame.addMouseListener(mouseClick);

        //******************************************************
        backToMain=new JButton("Back to Main Menu");
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 10;
        c.gridy = 0;
        // backToMain.setLocation(10,500);
        backToMain.setBounds(100,500,500,10);
        backToMain.addActionListener(new menuAction());
        frame.add(backToMain,c);


        //******************************************************

    } // End BattleshipGUI constructor

    public class GameBoard extends JPanel {
        //GameBoard parameters
        ImageIcon img;
        String path;
        int x;
        int y;

        public void setImg(ImageIcon img) {
            this.img = img;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        //default GameBoard constructor
        public GameBoard() {
            img = null;
            path = "";
            x = 0;
            y = 0;
        }// End default constructor

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

//             img = new ImageIcon(path);
            try{
            img=new ImageIcon(read(getClass().getResource("/static/radar.jpg")));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

//            img = new ImageIcon(path);
            g.drawImage(img.getImage(), x, y, this.getWidth(), this.getHeight(), null);
            setVisible(true);

        }// End paintComponent method

    }// End GameBoard class

}// End BattleshipGUI class
