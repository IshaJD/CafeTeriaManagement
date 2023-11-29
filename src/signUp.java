import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class signUp implements ActionListener {
    JFrame frame;
    JPanel panel1, panel2, panel3;
    JLabel label1, label2, labela, labelb, labelc, labeld;
    Font myfont = new Font("INK FREE", Font.PLAIN, 25);
    Font myfont1 = new Font("INK FREE", Font.BOLD, 25);
    TextField text1, text2, text3, text4, text5;
    JButton resetButton, checkButton;

    signUp() {
        frame = new JFrame("SIGNUP");
        frame.setBounds(450, 180, 420, 420);
        frame.getContentPane().setBackground(Color.green);
        frame.setLayout(null);

        // panel1
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 420, 50);
        panel1.setBackground(Color.green);
        label1 = new JLabel("WELCOME NEW USER  ");
        label1.setForeground(Color.black);
        label1.setFont(myfont1);

        // panel1
        panel1.add(label1);
        // panel2
        panel2 = new JPanel();
        panel2.setBounds(20, 70, 350, 200);
        panel2.setLayout(new GridLayout(4, 2, 20, 20));
        panel2.setBackground(Color.green);
        JLabel labela = new JLabel("USERNAME");
        labela.setForeground(Color.black);
        text1 = new TextField();
        text1.setForeground(Color.black);
        text1.setBackground(Color.white);
        text1.setFont(myfont);
        labela.setFont(myfont);
        JLabel labelb = new JLabel("PASSWORD");
        text2 = new TextField();
        text2.setBackground(Color.white);
        text2.setForeground(Color.black);
        text2.setFont(myfont);
        labelb.setFont(myfont);
        labelb.setForeground(Color.black);
        JLabel labelc = new JLabel("CONTACT NO");
        text3 = new TextField();
        text3.setBackground(Color.white);
        text3.setForeground(Color.black);
        text3.setFont(myfont);
        labelc.setFont(myfont);
        labelc.setForeground(Color.black);
        JLabel labeld = new JLabel("ADDRESS");
        text4 = new TextField();
        text4.setBackground(Color.white);
        text4.setForeground(Color.black);
        text4.setFont(myfont);
        labeld.setFont(myfont);
        labeld.setForeground(Color.black);
        panel2.add(labela);
        panel2.add(text1);
        panel2.add(labelb);
        panel2.add(text2);
        panel2.add(labelc);
        panel2.add(text3);
        panel2.add(labeld);
        panel2.add(text4);
        // panel 3
        panel3 = new JPanel();
        panel3.setBounds(40, 290, 300, 40);
        panel3.setLayout(new GridLayout(1, 2, 30, 20));
        checkButton = new JButton("SUBMIT");
        // checkButton.setBounds(40, 300, 100, 200);
        checkButton.setForeground(Color.white);
        checkButton.setBackground(Color.red);
        checkButton.setFont(myfont);
        checkButton.addActionListener(this);
        resetButton = new JButton("RESET");
        // resetButton.setBounds(150, 300, 100, 200);
        resetButton.setForeground(Color.white);
        resetButton.setBackground(Color.red);
        resetButton.setFont(myfont);
        resetButton.addActionListener(this);
        panel3.setBackground(Color.green);
        panel3.add(checkButton);
        panel3.add(resetButton);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkButton) {
            // submit logic
            database.InsertData(text1.getText(), text2.getText(), text3.getText(), text4.getText());
            JOptionPane.showMessageDialog(null, "SUBMITTED SUCCESSFULLY ", "SUBMITTED SUCCESSFULLY ",
                    JOptionPane.INFORMATION_MESSAGE);
            frame.dispose();
            new coffeShop();

        } else if (e.getSource() == resetButton) {
            text1.setText(" ");
            text2.setText(" ");
            text3.setText(" ");
            text4.setText(" ");
        }

    }

}
