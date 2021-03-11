package com.example.battleshipv7.GUI;
import com.example.battleshipv7.GUI.Update_view;
import javax.swing.*;
import java.awt.*;

public class BoardGUI extends JFrame {

    public static JFrame frame;
    JPanel mainPanel;
    JPanel buttonPanel;
    public static JButton instructionBtn;
    public static JButton playBtn;
    public static JButton creditBtn;

    public BoardGUI() {
    }

    public void createMainBoard()
    {
        frame=new JFrame();
        frame.setTitle("Game Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //background image
        JLabel backgroundLbl=new JLabel(new ImageIcon(getClass().getResource("/static/background-battleship.jpg")));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        frame.add(backgroundLbl);
        //frame.getContentPane().add(BorderLayout.CENTER);

        //Grid JPanel
        mainPanel = new JPanel(new GridBagLayout());
        c.fill = GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=2;

        //Label:
        JLabel label = new JLabel("Welcome to Battleship! Let's Play!");
        c.insets = new Insets(2, 2, 70, 2);
        c.gridx = 1;
        c.gridy = 0;
        label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        label.setForeground(Color.white);
        label.setBackground(Color.white);
        mainPanel.add(label,c);

        //platBtn:
        playBtn=new JButton("New Game");
//        playBtn.addActionListener(new Update_view());
        playBtn.setPreferredSize(new Dimension(120,70));
        playBtn=new JButton("",new ImageIcon(getClass().getResource("/static/start.jpg")));
        playBtn.setBackground(Color.decode("#FFFFFF"));
        c.fill = GridBagConstraints.CENTER;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 5;
        playBtn.addActionListener(new Update_view());
        mainPanel.add(playBtn,c);

        //Instructions Button:
        instructionBtn=new JButton("Instructions");
//        instructionBtn.addActionListener(new Update_view());
        c.fill = GridBagConstraints.CENTER;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 7;
        instructionBtn=new JButton("",new ImageIcon(getClass().getResource("/static/instructions.jpg")));
        instructionBtn.setPreferredSize(new Dimension(190,70));
        instructionBtn.addActionListener(new Update_view());
        instructionBtn.setBackground(Color.decode("#FFFFFF"));
        mainPanel.add(instructionBtn,c);

        //Credit Button:
        creditBtn=new JButton("",new ImageIcon(getClass().getResource("/static/credits.jpg")));
        c.fill = GridBagConstraints.CENTER;
        creditBtn.setPreferredSize(new Dimension(160,70));
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 8;
        creditBtn.addActionListener(new Update_view());
        creditBtn.setBackground(Color.decode("#FFFFFF"));
        mainPanel.add(creditBtn,c);

        //Main Frame
        frame.setSize(900,700);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.add(mainPanel);
    }
}
