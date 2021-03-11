package com.example.battleshipv7.entity;

import javax.swing.*;
import java.awt.*;

public class Credits extends JFrame {

    public static JFrame frame;
    JLabel creditlabel;

    public Credits()
    {
        frame=new JFrame("Group 5 - CSIS 3275");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        creditlabel = new JLabel("Group Members: \n Soheila Hoseini\n Golazin Abolfathi \n Jacky Lam \n Bosco Li");
        creditlabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
        frame.add(creditlabel);

        frame.setVisible(true);
        frame.setSize(200,200);
    }


}
