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
        creditlabel = new JLabel("<html> &nbsp;&nbsp;&nbsp;&nbsp;Group Members:<br><br><br> &nbsp;&nbsp;&nbsp;&nbsp;Soheila Hoseini<br> &nbsp;&nbsp;&nbsp;&nbsp;Golazin Abolfathi <br> &nbsp;&nbsp;&nbsp;&nbsp;Jacky Lam <br> &nbsp;&nbsp;&nbsp;&nbsp;Bosco Li</html>");
        creditlabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
        frame.add(creditlabel);

        frame.setVisible(true);
        frame.setSize(400,600);
    }


}
