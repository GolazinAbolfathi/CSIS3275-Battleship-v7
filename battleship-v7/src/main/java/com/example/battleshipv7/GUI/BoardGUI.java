package com.example.battleshipv7.GUI;
import com.example.battleshipv7.GUI.Update_view;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BoardGUI extends JFrame {

    public static JFrame frame;
    JPanel mainPanel;
    public static JButton instructionBtn;
    public static JButton playBtn;
    public static JButton creditBtn;
    ImageIcon backgroundButton;
    public BoardGUI() {
    }

    public void createMainBoard()
    {
        frame=new JFrame();
        frame.setTitle("Game Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //background image
        String path = "/static/background-battleship.jpg";
        BoardPaint boardPaint = new BoardPaint(path,0,0);
        frame.setContentPane(boardPaint);

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);

        //Grid JPanel
        mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setSize(120,300);
        mainPanel.setOpaque(false);
        c.fill = GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=2;

        //Label:
        JLabel label = new JLabel("Welcome to Battleship! Let's Play!");
        c.insets = new Insets(20, 2, 70, 2);
        c.gridx = 1;
        c.gridy = 0;
        label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        label.setForeground(Color.white);
        mainPanel.add(label,c);

        //platBtn:
        playBtn=new JButton("New Game");
        playBtn.setPreferredSize(new Dimension(120,80));
        backgroundButton=new ImageIcon(getClass().getResource("/static/start.jpg"));
        backgroundButton.getImage().getScaledInstance(110,70,Image.SCALE_DEFAULT);
        playBtn=new JButton("",backgroundButton);
        playBtn.setBackground(Color.decode("#FFFFFF"));
        c.fill = GridBagConstraints.CENTER;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 5;
        playBtn.addActionListener(new Update_view());
        mainPanel.add(playBtn,c);

        //Instructions Button:
        c.fill = GridBagConstraints.CENTER;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 7;
        backgroundButton=new ImageIcon(getClass().getResource("/static/instructions.jpg"));
        backgroundButton.getImage().getScaledInstance(110,40,Image.SCALE_DEFAULT);
        instructionBtn=new JButton("",backgroundButton);
        instructionBtn.setPreferredSize(new Dimension(120,40));
        instructionBtn.addActionListener(new Update_view());
        instructionBtn.setBackground(Color.decode("#FFFFFF"));
        mainPanel.add(instructionBtn,c);

        //Credit Button:
        backgroundButton=new ImageIcon(getClass().getResource("/static/credits.jpg"));
        backgroundButton.getImage().getScaledInstance(110,70,Image.SCALE_DEFAULT);
//        creditBtn=new JButton("",new ImageIcon(getClass().getResource("/static/credits.jpg")));
        creditBtn=new JButton("",backgroundButton);

        c.fill = GridBagConstraints.CENTER;
        creditBtn.setPreferredSize(new Dimension(120,70));
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 8;
        creditBtn.addActionListener(new Update_view());
        creditBtn.setBackground(Color.decode("#FFFFFF"));
        mainPanel.add(creditBtn,c);

        //Main Frame
        frame.setSize(900,700);
        frame.setResizable(true);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
