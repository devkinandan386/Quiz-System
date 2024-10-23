package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    
    Score(String name,int score) {
        setBounds(0, 0, 1280, 910);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(20, 200, 300,250);
        add(Image);
        
        JLabel heading=new JLabel("Thankyou " + name + " For Simple minds");
        heading.setBounds(200,50,500,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,30));
        heading.setForeground(Color.red);
        add(heading);
        
        JLabel lblscore=new JLabel(" Your score is " + score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(360, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        
        setVisible(true);
    }
  
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();    
    }
    
    public static void main(String[] args){
        new Score("User", 0); 
    }
}
