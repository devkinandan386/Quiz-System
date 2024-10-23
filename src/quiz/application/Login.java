package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends  JFrame implements ActionListener{

    JButton rules, back;
    JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);    //This is for your own layout

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel Image = new JLabel(i1);
        Image.setBounds(0, 0, 600,500);
        add(Image);

        JLabel heading  = new JLabel("Quicky Quiz");
        heading.setBounds(650,60,300,45);
        heading.setFont(new Font("Vinor Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel name  = new JLabel("Enter your Name");
        name.setBounds(660,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(new Color(30,144,254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(660,200,300,25);
        tfname.setFont(new Font("Times new Roman",Font.BOLD,20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(660,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);


        back = new JButton("Back");
        back.setBounds(840,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1000,500);
        setLocation(200, 150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        } else if (ae.getSource()==back) {
            setVisible(false);
        }

    }
    
    public static void main(String[] args) {
        new Login();
    }
}