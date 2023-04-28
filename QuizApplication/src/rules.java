import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    rules(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading = new JLabel("Welcome " + name + " to Quiz Game"); //text insert
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Vinor Hand ITC",Font.BOLD,28) ); //styling font
        heading.setForeground(new Color(30,144,254)); //changing the color of font  Color.BLUE
        add(heading);

        JLabel rules = new JLabel(); //text insert
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16) ); //styling font

        rules.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );
//        rules.setForeground(new Color(30,144,254)); //changing the color of font  Color.BLUE
        add(rules);


        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);   //for event
        add(back);

        start = new JButton("Start Quiz");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        setVisible(true); //by Defult It's hidden
        setLocation(350,50); //Set location
        setSize(700,700); //set size of Box

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == start)
        {
        setVisible(false);
        new Quiz();
        }
        else {
            setVisible(false);
            new login();
        }
    }
    public static void main(String[] args) {


        new rules("user");
    }
}
