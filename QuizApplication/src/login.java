import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {
    JButton rules,back;  //Declearig functions
    JTextField tfname;
    login(){

        getContentPane().setBackground(Color.white); //for changing color
        setLayout(null);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i);
        image.setBounds(0, 0 ,600,500); // set image
        add(image);



        JLabel heading = new JLabel("Simple Minds"); //text insert
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Vinor Hand ITC",Font.BOLD,40) ); //styling font
        heading.setForeground(new Color(30,144,254)); //changing the color of font  Color.BLUE
        add(heading);



        JLabel name = new JLabel("Enter Your name"); //text insert
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian baiti",Font.BOLD,18) ); //styling font
        name.setForeground(Color.BLACK); //changing the color of font  Color.BLUE
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times new Roman", Font.BOLD,20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);   //for event
        add(rules);

        back = new JButton("Back");
        back.setBounds(900,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);



        setVisible(true); //by Defult It's hidden
        setLocation(50,50); //Set location
        setSize(1200,500); //set size of Box

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            setVisible(false);
            String name = tfname.getText();
            new rules(name);
        }
        else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
        public static void main(String[] args) {
        new login(); //annonimus object
    }
}
