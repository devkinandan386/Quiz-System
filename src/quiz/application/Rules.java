package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;


    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel heading  = new JLabel("Welcome " + name  + " into Quicky Quiz");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Vinor Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules  = new JLabel();
        rules.setBounds(40,0,500,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText (
            "<html>"+
            "1.Read The question carefully and give the answer."+"<br><br>"+
            "2.Choose only one option from the given option."+"<br><br>"+
            "3.You have only 15 second to give the answer."+"<br><br>"+
            "4.There is a 50-50 lifeline,But you can only use it for one time."+"<br><br>"+
            "5.After all questions attempt then submit your quiz."+"<br><br>"+
            "6.After that check your score."+"<br><br>"+
            
            "<html>"
        );
        add(rules);


        back = new JButton("Back");
        back.setBounds(200,400,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,400,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800,650);
        setLocation(300,150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== start) {
            setVisible(false);
            new Quiz(name);

        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }

}
