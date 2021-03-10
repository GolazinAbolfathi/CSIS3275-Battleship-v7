package com.example.battleshipv7.entity;

import javax.swing.*;
import java.awt.*;

public class Message extends JFrame {
    public static JFrame frame;
    public static JPanel buttonPanel;
    public static JButton backToBoardBtn;
    public static JTextField txtBox;
    public static JPanel panel;

    public Message() {
    }

    public Message(int height, int width, String message) {

        panel = new JPanel();
        frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setTitle("Message");
        frame.setResizable(false); //change parameter to true to allow user to resize window

        //button panel
        buttonPanel = new JPanel();
//        panel.add(buttonPanel);
        buttonPanel.setLayout(new GridLayout(1, 5));

        GridBagConstraints c = new GridBagConstraints();
//        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.weighty = 0.65;

        panel.add(buttonPanel, c);

        //back to main window (Board Button)
        backToBoardBtn = new JButton(message);
//        backToBoardBtn.addActionListener(new MenuListener());
        c.gridx = 0;
        c.gridy = 4;
        panel.add(backToBoardBtn, c);

        //results Textbox
        txtBox = new JTextField(20);
        c.gridx = 0;
        c.gridy = 5;
        panel.add(txtBox, c);

        frame.setContentPane(panel);
        frame.pack();

    }//end of constructor
}
