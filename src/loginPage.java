import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class loginPage implements ActionListener {

    JFrame frame;

    JPanel panel1, panel2, panel3, panel4;
    JLabel label1;
    Font myfont = new Font("INK FREE", Font.ITALIC, 30);
    Font myfont1 = new Font("INK FREE", Font.PLAIN, 20);
    static TextField text1, text2, text3;
    JButton logButton, signButton;

    loginPage() {
        frame = new JFrame("WELCOME TO CAFETERIA ");
        frame.setBounds(450, 180, 420, 380);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(null);
        ImageIcon icon = new ImageIcon("./images//fruitscake.jpg");
        frame.setIconImage(icon.getImage());
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 420, 50);
        panel1.setBackground(Color.black);
        panel1.setLayout(new FlowLayout());
        label1 = new JLabel("ROYAL CAFE ");
        label1.setForeground(Color.green);
        label1.setFont(myfont);

        // panel1
        panel1.add(label1);

        // panel2
        panel2 = new JPanel();
        panel2.setBounds(50, 80, 300, 120);

        panel2.setLayout(new GridLayout(2, 2, 20, 20));
        panel2.setBackground(Color.gray);
        JLabel labela = new JLabel("USERNAME");
        labela.setForeground(Color.black);
        text1 = new TextField();
        text1.setForeground(Color.green);
        text1.setBackground(Color.black);
        text1.setFont(myfont1);
        labela.setFont(myfont1);
        JLabel labelb = new JLabel("PASSWORD");
        text2 = new TextField();
        text2.setBackground(Color.black);
        text2.setForeground(Color.green);
        text2.setFont(myfont1);
        labelb.setFont(myfont1);
        labelb.setForeground(Color.black);
        panel2.add(labela);
        panel2.add(text1);
        panel2.add(labelb);
        panel2.add(text2);
        // last panel
        panel3 = new JPanel();
        panel3.setBounds(40, 250, 350, 60);
        panel3.setLayout(new FlowLayout());
        logButton = new JButton("LOGIN");
        logButton.setBounds(40, 250, 100, 200);
        logButton.setForeground(Color.white);
        logButton.setBackground(Color.red);
        logButton.addActionListener(this);
        signButton = new JButton("SIGNUP");
        signButton.setBounds(150, 250, 100, 200);
        signButton.setForeground(Color.white);
        signButton.setBackground(Color.green);
        signButton.addActionListener(this);
        panel3.add(logButton);
        panel3.add(signButton);
        panel3.setBackground(Color.gray);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logButton) {
            // login logic
            if (database.matchData(text2.getText())) {
                frame.dispose();
                new coffeShop();
            } else {
                JOptionPane.showMessageDialog(null, "WRONG PASSWORD ", "WRONG PASSWORD ",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } else if (e.getSource() == signButton) {
            // sign up logic
            frame.dispose();
            new signUp();
        }

    }
}
