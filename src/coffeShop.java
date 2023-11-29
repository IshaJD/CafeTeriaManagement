
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class coffeShop implements ActionListener {
    static JFrame frame, frame1, frame2, frame3;
    static JTable table;
    static DefaultTableModel tablemodel;
    JProgressBar bar;
    JPanel leftconPanel, rightconPanel, lowerPanel, leftupperPanel, leftmiddlePanel, rightupperPanel, rightlowerPanel,
            panelc;
    Font myfont = new Font("Arial", Font.BOLD, 15);
    Font myfont1 = new Font("Arial", Font.BOLD, 10);
    JButton resetbutton, totalbutton, reciptbutton, exitbutton, add1, add2, add3, add4, add5, add6, add7, add8, add9,
            done,
            paybutton,
            add10,
            add11, add12;
    JComboBox<Integer> box1a, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12;
    static TextField f1, f2, f3;
    JPanel midlabel;
    ArrayList<Object> quanityList = new ArrayList<>();
    ArrayList<String> itemList = new ArrayList<>();
    Font myfont2 = new Font("Arial", Font.PLAIN, 10);
    JLabel mlabel1, mlabel2, mlabel3, totallabel, labelc, labeld, labele;
    JTextArea textArea;
    static int flag = 0;
    TextField field1, field2;
    JRadioButton but1, but2, but3;
    ButtonGroup group;

    coffeShop() {
        // *****************frame declaration ******************************
        frame = new JFrame("WELCOME TO CAFETERIA ");
        frame.setBounds(200, 30, 920, 700);
        frame.setLayout(null);

        // leftpanel outer ****************************
        leftconPanel = new JPanel();
        leftconPanel.setBounds(10, 5, 620, 580);
        leftconPanel.setBorder(BorderFactory.createLineBorder(Color.orange, 2));
        leftconPanel.setLayout(null);
        // subpanels in leftconPanel********
        // subpanel 1
        leftupperPanel = new JPanel();
        leftupperPanel.setBounds(5, 5, 610, 50);
        leftupperPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        leftupperPanel.setLayout(new GridLayout(1, 4, 10, 10));

        // label for upper
        JLabel labelupper = new JLabel();
        labelupper.setText("ROYAL CAFE ");
        labelupper.setFont(new Font("INK FREE", Font.BOLD, 25));
        labelupper.setForeground(Color.ORANGE);

        JLabel labelicon = new JLabel();
        labelicon.setBounds(5, 5, 40, 50);

        labelicon.setIcon(new ImageIcon("./cappuccinocoffee.jpg"));
        leftupperPanel.add(labelupper);
        leftupperPanel.add(labelicon);

        // subpanel2
        leftmiddlePanel = new JPanel();
        leftmiddlePanel.setBounds(5, 60, 610, 510);
        leftmiddlePanel.setBorder(BorderFactory.createLineBorder(Color.gray));
        leftmiddlePanel.setLayout(new GridLayout(3, 4, 5, 5));
        // ************** subpaanels in each row */
        JPanel subPanel1 = new JPanel();
        subPanel1.setSize(80, 70);
        subPanel1.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
        subPanel1.setLayout(new GridLayout(2, 1, 0, 0));

        // subpanel part 1
        JPanel part1a = new JPanel();
        part1a.setPreferredSize(new Dimension(80, 40));

        part1a.add(new JLabel(new ImageIcon("./coldcoffe.png")));
        // subpanel part 2
        JPanel part2a = new JPanel();
        part2a.setPreferredSize(new Dimension(80, 30));
        part2a.setLayout(new FlowLayout(1));
        JLabel textlabel1a = new JLabel("COLD COFFEE");
        textlabel1a.setFont(myfont1);
        JLabel textlabel2a = new JLabel("Price : 53.0");
        textlabel2a.setFont(myfont1);
        JPanel conpanela = new JPanel();
        conpanela.setPreferredSize(new Dimension(80, 20));
        conpanela.setLayout(new GridLayout(1, 2));

        JLabel textlabel3a = new JLabel("Quantity");
        textlabel3a.setFont(myfont1);
        Integer stepsa[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box1a = new JComboBox<Integer>(stepsa);
        box1a.setPreferredSize(new Dimension(20, 10));
        box1a.addActionListener(this);
        conpanela.add(textlabel3a);
        conpanela.add(box1a);
        add1 = new JButton("ADD");
        add1.setForeground(Color.white);
        add1.setBackground(Color.GREEN);
        add1.addActionListener(this);
        part2a.add(textlabel1a);
        part2a.add(textlabel2a);
        part2a.add(conpanela);
        part2a.add(add1);

        subPanel1.add(part1a);
        subPanel1.add(part2a);
        // **************************************************************************************
        // *************subpanel 2********************
        JPanel subPanel2 = new JPanel();
        subPanel2.setSize(80, 70);
        subPanel2.setBorder(BorderFactory.createLineBorder(Color.gray));
        subPanel2.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1b = new JPanel();
        part1b.setPreferredSize(new Dimension(80, 40));

        part1b.add(new JLabel(new ImageIcon("./burger1.png")));
        // subpanel part 2
        JPanel part2b = new JPanel();
        part2b.setPreferredSize(new Dimension(80, 30));

        part2b.setLayout(new FlowLayout(1));
        JLabel textlabel1b = new JLabel("BURGER");
        textlabel1b.setFont(myfont1);
        JLabel textlabel2b = new JLabel("Price : 80.0");
        textlabel2b.setFont(myfont1);
        JPanel conpanelb = new JPanel();
        conpanelb.setPreferredSize(new Dimension(80, 20));
        conpanelb.setLayout(new GridLayout(1, 2));

        JLabel textlabel3b = new JLabel("Quantity");
        textlabel3b.setFont(myfont1);
        Integer stepsb[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box2 = new JComboBox<Integer>(stepsb);
        box2.setPreferredSize(new Dimension(20, 10));
        box2.addActionListener(this);
        conpanelb.add(textlabel3b);
        conpanelb.add(box2);
        add2 = new JButton("ADD");
        add2.setForeground(Color.white);
        add2.setBackground(Color.GREEN);
        add2.addActionListener(this);
        part2b.add(textlabel1b);
        part2b.add(textlabel2b);
        part2b.add(conpanelb);
        part2b.add(add2);
        subPanel2.add(part1b);
        subPanel2.add(part2b);
        // **************************************************************************************
        // ****************** subpanel 3*****************************
        JPanel subPanel3 = new JPanel();
        subPanel3.setSize(80, 70);
        subPanel3.setBorder(BorderFactory.createLineBorder(Color.gray));
        subPanel3.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1c = new JPanel();
        part1c.setPreferredSize(new Dimension(80, 40));

        part1c.add(new JLabel(new ImageIcon("./cake1.png")));
        JPanel part2c = new JPanel();
        part2c.setPreferredSize(new Dimension(80, 30));

        part2c.setLayout(new FlowLayout(1));
        JLabel textlabel1c = new JLabel("CAKE");
        textlabel1c.setFont(myfont1);
        JLabel textlabel2c = new JLabel("Price : 500.0");
        textlabel2c.setFont(myfont1);
        JPanel conpanelc = new JPanel();
        conpanelc.setPreferredSize(new Dimension(80, 20));
        conpanelc.setLayout(new GridLayout(1, 2));

        JLabel textlabel3c = new JLabel("Quantity");
        textlabel3c.setFont(myfont1);
        Integer stepsc[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box3 = new JComboBox<Integer>(stepsc);
        box3.setPreferredSize(new Dimension(20, 10));
        box3.addActionListener(this);
        conpanelc.add(textlabel3c);
        conpanelc.add(box3);
        add3 = new JButton("ADD");
        add3.setForeground(Color.white);
        add3.setBackground(Color.GREEN);
        add3.addActionListener(this);
        part2c.add(textlabel1c);
        part2c.add(textlabel2c);
        part2c.add(conpanelc);
        part2c.add(add3);
        subPanel3.add(part1c);
        subPanel3.add(part2c);
        // **************************************************************************************
        JPanel subPanel4 = new JPanel();
        subPanel4.setSize(80, 70);
        subPanel4.setBorder(BorderFactory.createLineBorder(Color.gray));
        subPanel4.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1d = new JPanel();
        part1d.setPreferredSize(new Dimension(80, 40));

        part1d.add(new JLabel(new ImageIcon("./chococof1.png")));
        JPanel part2d = new JPanel();
        part2d.setPreferredSize(new Dimension(80, 30));

        part2d.setLayout(new FlowLayout(1));
        JLabel textlabel1d = new JLabel("CHOCO COFFEE");
        textlabel1d.setFont(myfont1);
        JLabel textlabel2d = new JLabel("Price : 50.0");
        textlabel2d.setFont(myfont1);
        JPanel conpaneld = new JPanel();
        conpaneld.setPreferredSize(new Dimension(80, 20));
        conpaneld.setLayout(new GridLayout(1, 2));

        JLabel textlabel3d = new JLabel("Quantity");
        textlabel3d.setFont(myfont1);
        Integer stepsd[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box4 = new JComboBox<Integer>(stepsd);
        box4.setPreferredSize(new Dimension(20, 10));
        box4.addActionListener(this);
        conpaneld.add(textlabel3d);
        conpaneld.add(box4);
        add4 = new JButton("ADD");
        add4.setForeground(Color.white);
        add4.setBackground(Color.GREEN);
        add4.addActionListener(this);
        part2d.add(textlabel1d);
        part2d.add(textlabel2d);
        part2d.add(conpaneld);
        part2d.add(add4);
        subPanel4.add(part1d);
        subPanel4.add(part2d);

        // **************************************************************************************
        JPanel subPanel5 = new JPanel();
        subPanel5.setSize(80, 70);
        subPanel5.setBorder(BorderFactory.createLineBorder(Color.gray));
        subPanel5.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1e = new JPanel();
        part1e.setPreferredSize(new Dimension(80, 40));

        part1e.add(new JLabel(new ImageIcon("./coke1.png")));
        JPanel part2e = new JPanel();
        part2e.setPreferredSize(new Dimension(80, 30));

        part2e.setLayout(new FlowLayout(1));
        JLabel textlabel1e = new JLabel("COKE");
        textlabel1e.setFont(myfont1);
        JLabel textlabel2e = new JLabel("Price : 60.0");
        textlabel2e.setFont(myfont1);
        JPanel conpanele = new JPanel();
        conpanele.setPreferredSize(new Dimension(80, 20));
        conpanele.setLayout(new GridLayout(1, 2));

        JLabel textlabel3e = new JLabel("Quantity");
        textlabel3e.setFont(myfont1);
        Integer stepse[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box5 = new JComboBox<Integer>(stepse);
        box5.setPreferredSize(new Dimension(20, 10));
        box5.addActionListener(this);
        conpanele.add(textlabel3e);
        conpanele.add(box5);
        add5 = new JButton("ADD");
        add5.setForeground(Color.white);
        add5.setBackground(Color.GREEN);
        add5.addActionListener(this);
        part2e.add(textlabel1e);
        part2e.add(textlabel2e);
        part2e.add(conpanele);
        part2e.add(add5);
        subPanel5.add(part1e);
        subPanel5.add(part2e);
        // *************************************************************************************

        JPanel subPanel6 = new JPanel();
        subPanel6.setSize(80, 70);
        subPanel6.setBorder(BorderFactory.createLineBorder(Color.gray));
        subPanel6.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1f = new JPanel();
        part1f.setPreferredSize(new Dimension(80, 40));

        part1f.add(new JLabel(new ImageIcon("./greentea1.png")));
        JPanel part2f = new JPanel();
        part2f.setPreferredSize(new Dimension(80, 30));

        part2f.setLayout(new FlowLayout(1));
        JLabel textlabel1f = new JLabel("GREEN TEA");
        textlabel1f.setFont(myfont1);
        JLabel textlabel2f = new JLabel("Price : 50.0");
        textlabel2f.setFont(myfont1);
        JPanel conpanelf = new JPanel();
        conpanelf.setPreferredSize(new Dimension(80, 20));
        conpanelf.setLayout(new GridLayout(1, 2));

        JLabel textlabel3f = new JLabel("Quantity");
        textlabel3f.setFont(myfont1);
        Integer stepsf[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box6 = new JComboBox<Integer>(stepsf);
        box6.setPreferredSize(new Dimension(20, 10));
        box6.addActionListener(this);
        conpanelf.add(textlabel3f);
        conpanelf.add(box6);
        add6 = new JButton("ADD");
        add6.setForeground(Color.white);
        add6.setBackground(Color.GREEN);
        add6.addActionListener(this);
        part2f.add(textlabel1f);
        part2f.add(textlabel2f);
        part2f.add(conpanelf);
        part2f.add(add6);
        subPanel6.add(part1f);
        subPanel6.add(part2f);

        // *************************************************************************************
        JPanel subPanel7 = new JPanel();
        subPanel7.setSize(80, 70);
        subPanel7.setBorder(BorderFactory.createLineBorder(Color.gray));
        subPanel7.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1g = new JPanel();
        part1g.setPreferredSize(new Dimension(80, 40));

        part1g.add(new JLabel(new ImageIcon("./orange1.png")));
        JPanel part2g = new JPanel();
        part2g.setPreferredSize(new Dimension(80, 30));

        part2g.setLayout(new FlowLayout(1));
        JLabel textlabel1g = new JLabel("JUICE");
        textlabel1g.setFont(myfont1);
        JLabel textlabel2g = new JLabel("Price : 50.0");
        textlabel2g.setFont(myfont1);
        JPanel conpanelg = new JPanel();
        conpanelg.setPreferredSize(new Dimension(80, 20));
        conpanelg.setLayout(new GridLayout(1, 2));

        JLabel textlabel3g = new JLabel("Quantity");
        textlabel3g.setFont(myfont1);
        Integer stepsg[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box7 = new JComboBox<Integer>(stepsg);
        box7.setPreferredSize(new Dimension(20, 10));
        box7.addActionListener(this);
        conpanelg.add(textlabel3g);
        conpanelg.add(box7);
        add7 = new JButton("ADD");
        add7.setForeground(Color.white);
        add7.setBackground(Color.GREEN);
        add7.addActionListener(this);
        part2g.add(textlabel1g);
        part2g.add(textlabel2g);
        part2g.add(conpanelg);
        part2g.add(add7);
        subPanel7.add(part1g);
        subPanel7.add(part2g);
        // *************************************************************************************
        JPanel subPanel8 = new JPanel();
        subPanel8.setSize(80, 70);
        subPanel8.setBorder(BorderFactory.createLineBorder(Color.gray));

        subPanel8.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1h = new JPanel();
        part1h.setPreferredSize(new Dimension(80, 40));

        part1h.add(new JLabel(new ImageIcon("./pizza1.png")));
        JPanel part2h = new JPanel();
        part2h.setPreferredSize(new Dimension(80, 30));

        part2h.setLayout(new FlowLayout(1));
        JLabel textlabel1h = new JLabel("PIZZA");
        textlabel1h.setFont(myfont1);
        JLabel textlabel2h = new JLabel("Price : 399.0");
        textlabel2h.setFont(myfont1);
        JPanel conpanelh = new JPanel();
        conpanelh.setPreferredSize(new Dimension(80, 20));
        conpanelh.setLayout(new GridLayout(1, 2));

        JLabel textlabel3h = new JLabel("Quantity");
        textlabel3h.setFont(myfont1);
        Integer stepsh[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box8 = new JComboBox<Integer>(stepsh);
        box8.setPreferredSize(new Dimension(20, 10));
        box8.addActionListener(this);
        conpanelh.add(textlabel3h);
        conpanelh.add(box8);
        add8 = new JButton("ADD");
        add8.setForeground(Color.white);
        add8.setBackground(Color.GREEN);
        add8.addActionListener(this);
        part2h.add(textlabel1h);
        part2h.add(textlabel2h);
        part2h.add(conpanelh);
        part2h.add(add8);
        subPanel8.add(part1h);
        subPanel8.add(part2h);

        // ****************************************************************
        JPanel subPanel9 = new JPanel();
        subPanel9.setSize(80, 70);
        subPanel9.setBorder(BorderFactory.createLineBorder(Color.gray));

        subPanel9.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1i = new JPanel();
        part1i.setPreferredSize(new Dimension(80, 40));

        part1i.add(new JLabel(new ImageIcon("./fruitcake1.png")));
        JPanel part2i = new JPanel();
        part2i.setPreferredSize(new Dimension(80, 30));

        part2i.setLayout(new FlowLayout(1));
        JLabel textlabel1i = new JLabel("FRUIT CAKE ");
        textlabel1i.setFont(myfont1);
        JLabel textlabel2i = new JLabel("Price : 500");
        textlabel2i.setFont(myfont1);
        JPanel conpaneli = new JPanel();
        conpaneli.setPreferredSize(new Dimension(80, 20));
        conpaneli.setLayout(new GridLayout(1, 2));

        JLabel textlabel3i = new JLabel("Quantity");
        textlabel3i.setFont(myfont1);
        Integer stepsi[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box9 = new JComboBox<Integer>(stepsi);
        box9.setPreferredSize(new Dimension(20, 10));
        box9.addActionListener(this);
        conpaneli.add(textlabel3i);
        conpaneli.add(box9);
        add9 = new JButton("ADD");
        add9.setForeground(Color.white);
        add9.setBackground(Color.GREEN);
        add9.addActionListener(this);
        part2i.add(textlabel1i);
        part2i.add(textlabel2i);
        part2i.add(conpaneli);
        part2i.add(add9);
        subPanel9.add(part1i);
        subPanel9.add(part2i);

        // ****************************************************************
        JPanel subPanel10 = new JPanel();
        subPanel10.setSize(80, 70);
        subPanel10.setBorder(BorderFactory.createLineBorder(Color.gray));

        subPanel10.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1j = new JPanel();
        part1j.setPreferredSize(new Dimension(80, 40));

        part1j.add(new JLabel(new ImageIcon("./rainbowpastry1.png")));
        JPanel part2j = new JPanel();
        part2j.setPreferredSize(new Dimension(80, 30));

        part2j.setLayout(new FlowLayout(1));
        JLabel textlabel1j = new JLabel("RAINBOW PASTRY");
        textlabel1j.setFont(myfont1);
        JLabel textlabel2j = new JLabel("Price : 99.0");
        textlabel2j.setFont(myfont1);
        JPanel conpanelj = new JPanel();
        conpanelj.setPreferredSize(new Dimension(80, 20));
        conpanelj.setLayout(new GridLayout(1, 2));

        JLabel textlabel3j = new JLabel("Quantity");
        textlabel3j.setFont(myfont1);
        Integer stepsj[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box10 = new JComboBox<Integer>(stepsj);
        box10.setPreferredSize(new Dimension(20, 10));
        box10.addActionListener(this);
        conpanelj.add(textlabel3j);
        conpanelj.add(box10);
        add10 = new JButton("ADD");
        add10.setForeground(Color.white);
        add10.setBackground(Color.GREEN);
        add10.addActionListener(this);
        part2j.add(textlabel1j);
        part2j.add(textlabel2j);
        part2j.add(conpanelj);
        part2j.add(add10);
        subPanel10.add(part1j);
        subPanel10.add(part2j);

        // ****************************************************************
        JPanel subPanel11 = new JPanel();
        subPanel11.setSize(80, 70);
        subPanel11.setBorder(BorderFactory.createLineBorder(Color.gray));

        subPanel11.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1k = new JPanel();
        part1k.setPreferredSize(new Dimension(80, 40));

        part1k.add(new JLabel(new ImageIcon("./7up1.png")));
        JPanel part2k = new JPanel();
        part2k.setPreferredSize(new Dimension(80, 30));

        part2k.setLayout(new FlowLayout(1));
        JLabel textlabel1k = new JLabel("7UP DRINK");
        textlabel1k.setFont(myfont1);
        JLabel textlabel2k = new JLabel("Price : 99.0");
        textlabel2k.setFont(myfont1);
        JPanel conpanelk = new JPanel();
        conpanelk.setPreferredSize(new Dimension(80, 20));
        conpanelk.setLayout(new GridLayout(1, 2));

        JLabel textlabel3k = new JLabel("Quantity");
        textlabel3k.setFont(myfont1);
        Integer stepsk[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box11 = new JComboBox<Integer>(stepsk);
        box11.setPreferredSize(new Dimension(20, 10));
        box11.addActionListener(this);
        conpanelk.add(textlabel3k);
        conpanelk.add(box11);
        add11 = new JButton("ADD");
        add11.setForeground(Color.white);
        add11.setBackground(Color.GREEN);
        add11.addActionListener(this);
        part2k.add(textlabel1k);
        part2k.add(textlabel2k);
        part2k.add(conpanelk);
        part2k.add(add11);
        subPanel11.add(part1k);
        subPanel11.add(part2k);

        // ****************************************************************
        JPanel subPanel12 = new JPanel();
        subPanel12.setSize(80, 70);
        subPanel12.setBorder(BorderFactory.createLineBorder(Color.gray));
        subPanel12.setLayout(new GridLayout(2, 1, 0, 0));
        JPanel part1l = new JPanel();
        part1l.setPreferredSize(new Dimension(80, 40));

        part1l.add(new JLabel(new ImageIcon("./stabery1cake.png")));
        JPanel part2l = new JPanel();
        part2l.setPreferredSize(new Dimension(80, 30));

        part2l.setLayout(new FlowLayout(1));
        JLabel textlabel1l = new JLabel("BERRY CAKE");
        textlabel1l.setFont(myfont1);
        JLabel textlabel2l = new JLabel("Price : 399.0");
        textlabel2l.setFont(myfont1);
        JPanel conpanell = new JPanel();
        conpanell.setPreferredSize(new Dimension(80, 20));
        conpanell.setLayout(new GridLayout(1, 2));

        JLabel textlabel3l = new JLabel("Quantity");
        textlabel3l.setFont(myfont1);
        Integer stepsl[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        box12 = new JComboBox<Integer>(stepsl);
        box12.setPreferredSize(new Dimension(20, 10));
        box12.addActionListener(this);
        conpanell.add(textlabel3l);
        conpanell.add(box12);
        add12 = new JButton("ADD");
        add12.setForeground(Color.white);
        add12.setBackground(Color.GREEN);
        add12.addActionListener(this);
        part2l.add(textlabel1l);
        part2l.add(textlabel2l);
        part2l.add(conpanell);
        part2l.add(add12);
        subPanel12.add(part1l);
        subPanel12.add(part2l);

        // ****************************************************************
        leftconPanel.add(leftupperPanel);
        leftconPanel.add(leftmiddlePanel);
        leftmiddlePanel.add(subPanel1);
        leftmiddlePanel.add(subPanel2);
        leftmiddlePanel.add(subPanel3);
        leftmiddlePanel.add(subPanel4);
        leftmiddlePanel.add(subPanel5);
        leftmiddlePanel.add(subPanel6);
        leftmiddlePanel.add(subPanel7);
        leftmiddlePanel.add(subPanel8);
        leftmiddlePanel.add(subPanel9);
        leftmiddlePanel.add(subPanel10);
        leftmiddlePanel.add(subPanel11);
        leftmiddlePanel.add(subPanel12);
        // // rightconPanel outer *******************
        // rightconPanel = new JPanel();
        // rightconPanel.setBounds(640, 5, 250, 650);
        // rightconPanel.setBorder(BorderFactory.createLineBorder(Color.red));
        // rightconPanel.setLayout(null);
        // subpanel1
        rightupperPanel = new JPanel();
        rightupperPanel.setBounds(640, 5, 260, 440);
        rightupperPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        java.util.Date date = new java.util.Date();
        JLabel navbar = new JLabel(formatter.format(date));
        navbar.setBounds(640, 5, 300, 50);
        JLabel tagbar = new JLabel("ORDER SUMMARY");
        tagbar.setBounds(640, 5, 300, 50);
        tagbar.setForeground(Color.black);
        tagbar.setFont(myfont);
        JLabel tagbar1 = new JLabel("*******DETAILS ********");
        tagbar1.setBounds(640, 10, 300, 50);
        tagbar1.setForeground(Color.black);
        tagbar1.setFont(myfont);
        midlabel = new JPanel();
        midlabel.setPreferredSize(new Dimension(300, 300));
        midlabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        midlabel.setForeground(Color.black);

        midlabel.setFont(myfont);

        mlabel1 = new JLabel();
        table = new JTable();

        tablemodel = new DefaultTableModel(1, 3);
        table = new JTable(tablemodel);
        tablemodel.addRow(new Object[] { "ITEM ", "QUANTITY", "PRICE" });
        table.setBorder(BorderFactory.createLineBorder(Color.gray));
        table.setPreferredScrollableViewportSize(new Dimension(300, 400));
        // midlabel.add(textArea);
        table.setFont(myfont2);

        rightupperPanel.add(navbar);
        rightupperPanel.add(tagbar);
        rightupperPanel.add(tagbar1);
        rightupperPanel.add(table);

        // subpanel2
        rightlowerPanel = new JPanel();
        rightlowerPanel.setBounds(640, 440, 260, 200);
        rightlowerPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
        rightlowerPanel.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel labela = new JLabel("Tax($)");
        labela.setSize(100, 50);
        labela.setForeground(Color.black);
        labela.setFont(new Font("Arial", Font.BOLD, 15));
        f1 = new TextField();
        f1.setFont(myfont);
        f1.setSize(100, 50);

        JLabel labelb = new JLabel("SubTotal($)");
        labelb.setSize(100, 50);
        labelb.setForeground(Color.black);
        labelb.setFont(new Font("Arial", Font.BOLD, 15));
        f2 = new TextField();
        f2.setSize(100, 50);
        f2.setFont(myfont);
        JLabel labelc = new JLabel("Total($)");
        labelc.setSize(100, 50);
        labelc.setForeground(Color.black);
        labelc.setFont(new Font("Arial", Font.BOLD, 15));
        f3 = new TextField();
        f3.setSize(100, 50);
        f3.setFont(myfont);
        rightlowerPanel.add(labela);
        rightlowerPanel.add(f1);
        rightlowerPanel.add(labelb);
        rightlowerPanel.add(f2);
        rightlowerPanel.add(labelc);
        rightlowerPanel.add(f3);
        // lowerpanel ****************************
        lowerPanel = new JPanel();
        lowerPanel.setBounds(10, 590, 620, 60);
        // lowerPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        lowerPanel.setLayout(new FlowLayout());

        // buttons
        resetbutton = new JButton("Reset");
        resetbutton.setSize(100, 80);
        resetbutton.setBackground(Color.red);
        resetbutton.setForeground(Color.white);
        resetbutton.addActionListener(this);
        reciptbutton = new JButton("Receipt");
        reciptbutton.setSize(100, 60);
        reciptbutton.setBackground(Color.green);
        reciptbutton.setForeground(Color.white);
        reciptbutton.addActionListener(this);
        totalbutton = new JButton("Total");
        totalbutton.setSize(100, 60);
        totalbutton.setBackground(Color.blue);
        totalbutton.setForeground(Color.white);
        totalbutton.addActionListener(this);
        exitbutton = new JButton("Exit");
        exitbutton.setSize(100, 60);
        exitbutton.setBackground(Color.CYAN);
        exitbutton.setForeground(Color.white);
        exitbutton.addActionListener(this);
        lowerPanel.add(resetbutton);
        lowerPanel.add(reciptbutton);
        lowerPanel.add(totalbutton);
        lowerPanel.add(exitbutton);
        frame.add(leftconPanel);
        // frame.add(rightconPanel);
        frame.add(lowerPanel);
        frame.add(rightupperPanel);
        frame.add(rightlowerPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new coffeShop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int index = 0;
        if (e.getSource() == add1) {
            int p = Integer.parseInt(box1a.getSelectedItem().toString());
            royalCafe("COLD COFFEE", box1a.getSelectedItem(), p * 53);

        } else if (e.getSource() == add2) {
            int q = Integer.parseInt(box2.getSelectedItem().toString());
            royalCafe("BURGER", box2.getSelectedItem(), q * 80);
        } else if (e.getSource() == add3) {
            int r = Integer.parseInt(box3.getSelectedItem().toString());
            royalCafe("CHOCO CAKE", box3.getSelectedItem(), r * 500);
        } else if (e.getSource() == add4) {
            int s = Integer.parseInt(box4.getSelectedItem().toString());
            royalCafe("CHOCO COFFEE", box4.getSelectedItem(), s * 50);
        } else if (e.getSource() == add5) {
            int t = Integer.parseInt(box5.getSelectedItem().toString());
            royalCafe("COKE", box5.getSelectedItem(), t * 60);
        } else if (e.getSource() == add6) {
            int u = Integer.parseInt(box6.getSelectedItem().toString());
            royalCafe("GREEN TEA", box6.getSelectedItem(), u * 50);
        } else if (e.getSource() == add7) {
            int v = Integer.parseInt(box7.getSelectedItem().toString());
            royalCafe("JUICE", box7.getSelectedItem(), v * 50);
        } else if (e.getSource() == add8) {
            int w = Integer.parseInt(box8.getSelectedItem().toString());
            royalCafe("PIZZA", box8.getSelectedItem(), w * 399);
        } else if (e.getSource() == add9) {
            int x = Integer.parseInt(box9.getSelectedItem().toString());
            royalCafe("FRUIT CAKE", box9.getSelectedItem(), x * 500);
        } else if (e.getSource() == add10) {
            int y = Integer.parseInt(box10.getSelectedItem().toString());
            royalCafe("PASTRY", box10.getSelectedItem(), y * 99);
        } else if (e.getSource() == add11) {
            int z = Integer.parseInt(box11.getSelectedItem().toString());
            royalCafe("7UP", box11.getSelectedItem(), z * 99);
        } else if (e.getSource() == add12) {
            int z1 = Integer.parseInt(box12.getSelectedItem().toString());
            royalCafe("BERRY CAKE", box12.getSelectedItem(), z1 * 399);
        }

        // if button is reset
        if (e.getSource() == resetbutton) {
            box1a.setSelectedIndex(0);
            box2.setSelectedIndex(0);
            box3.setSelectedIndex(0);
            box4.setSelectedIndex(0);
            box5.setSelectedIndex(0);
            box6.setSelectedIndex(0);
            box7.setSelectedIndex(0);
            box8.setSelectedIndex(0);
            box9.setSelectedIndex(0);
            box10.setSelectedIndex(0);
            box11.setSelectedIndex(0);
            box12.setSelectedIndex(0);

            f1.setText(" ");
            f2.setText(" ");
            f3.setText(" ");

            int rowcount = table.getRowCount();

            for (int i = 2; i < rowcount; i++) {
                tablemodel.removeRow(i);

            }

        } else if (e.getSource() == totalbutton) {
            JOptionPane.showMessageDialog(null, "TOTALING YOUR BILL", "MAKING YOUR BILL",
                    JOptionPane.INFORMATION_MESSAGE, null);
            // total logic
            int rowcount = table.getRowCount();
            double tot = 0;
            for (int i = 2; i < rowcount; i++) {
                double val = Double.valueOf(table.getValueAt(i, 2).toString());
                tot += val;
            }
            f1.setText("10");
            double subtotal = 10 + tot;
            f2.setText(String.valueOf(subtotal));
            f3.setText(String.valueOf((int) subtotal));
        } else if (e.getSource() == reciptbutton) {
            newWindow();
        }

        else if (e.getSource() == exitbutton) {
            frame.dispose();
            System.exit(0);
        } else if (e.getSource() == paybutton) {
            if (but1.isSelected())
                cashwindow(1);
            if (but2.isSelected())
                cashwindow(2);
            if (but3.isSelected())
                cashwindow(3);

        } else if (e.getSource() == done) {
            JOptionPane.showMessageDialog(null, "PAYMENT DONE SUCCESSFULLY", "PAYMENT STATUS ",
                    JOptionPane.YES_NO_CANCEL_OPTION, null);
        }
    }

    public void royalCafe(String name, Object quantity, float price) {
        tablemodel.addRow(new Object[] { name, quantity, price });
    }

    public void newWindow() {

        frame1 = new JFrame("WELCOME TO CAFETERIA ");
        frame1.setBounds(450, 150, 420, 450);
        frame1.setLayout(null);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 420, 70);
        panel1.setBackground(Color.red);
        JLabel label1 = new JLabel("YOUR RECEIPT");
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        label1.setForeground(Color.white);
        panel1.add(label1);
        JPanel panel2 = new JPanel();
        panel2.setBounds(20, 100, 350, 240);

        // add table
        int row = table.getRowCount();
        int col = table.getColumnCount();
        System.out.println(row);
        System.out.println(col);
        DefaultTableModel model2 = new DefaultTableModel(1, 3);
        JTable table2 = new JTable(model2);
        table2.setBorder(BorderFactory.createLineBorder(Color.gray));
        table2.setPreferredScrollableViewportSize(new Dimension(300, 220));

        for (int i = 1; i < row; i++) {
            model2.addRow(new Object[] { tablemodel.getValueAt(i, 0), tablemodel.getValueAt(i, 1),
                    tablemodel.getValueAt(i, 2) });

        }
        //
        JPanel spanel = new JPanel();
        spanel.setPreferredSize(new Dimension(400, 200));
        spanel.setLayout(null);
        JLabel slabel = new JLabel("PAYMENT OPTIONS");
        slabel.setFont(new Font("Arail", Font.BOLD, 25));
        slabel.setPreferredSize(new Dimension(300, 70));
        slabel.setForeground(Color.red);

        group = new ButtonGroup();

        but1 = new JRadioButton("CASH");
        but1.setForeground(Color.blue);
        but1.setFont(myfont);
        but2 = new JRadioButton("QR SCAN");
        but2.setForeground(Color.blue);
        but2.setFont(myfont);
        but3 = new JRadioButton("UPI");
        but3.setForeground(Color.blue);
        but3.setFont(myfont);
        group.add(but1);
        group.add(but2);
        group.add(but3);
        panel2.add(table2);
        panel2.add(slabel);
        panel2.add(but1);
        panel2.add(but2);
        panel2.add(but3);
        paybutton = new JButton("PAY");
        paybutton.setFont(myfont);
        paybutton.setSize(100, 100);
        paybutton.setBackground(Color.red);
        paybutton.setForeground(Color.white);
        paybutton.addActionListener(this);
        panel2.add(paybutton);
        JPanel panel3 = new JPanel();
        panel3.setBounds(20, 330, 300, 50);
        JLabel label = new JLabel("TOTAL ");
        label.setFont(new Font("Arail", Font.BOLD, 25));
        TextField field = new TextField();
        field.setFont(myfont);
        field.setPreferredSize(new Dimension(100, 50));
        field.setText(coffeShop.f3.getText());
        panel3.add(label);
        panel3.add(field);
        bar = new JProgressBar(0, 100);
        bar.setBounds(0, 400, 420, 10);
        bar.setForeground(Color.blue);
        bar.setBackground(Color.GRAY);
        bar.setStringPainted(true);
        frame1.add(panel1);
        frame1.add(panel2);
        frame1.add(panel3);
        frame1.add(bar);
        frame1.setVisible(true);

    }

    public void cashwindow(int flag) {
        frame3 = new JFrame("WELCOME TO CAFETERIA ");
        frame3.setBounds(450, 200, 420, 250);
        frame3.setLayout(null);
        frame3.setBackground(Color.gray);

        panelc = new JPanel();
        panelc.setBounds(40, 30, 300, 80);
        panelc.setLayout(new GridLayout(1, 2, 10, 10));
        done = new JButton("DONE");
        done.setFont(myfont);
        done.setSize(100, 100);
        done.setBackground(Color.red);
        done.setForeground(Color.white);
        done.addActionListener(this);
        if (flag == 1) {
            // cash
            frame3.setLayout(new FlowLayout());
            panelc.setLayout(new GridLayout(1, 2, 10, 10));
            System.out.println("flag1" + flag);
            labelc = new JLabel("AMOUNT");
            labelc.setForeground(Color.blue);
            labelc.setFont(myfont);
            labelc.setSize(100, 80);
            TextField field1 = new TextField();
            field1.setBackground(Color.white);
            field1.setSize(100, 80);
            field1.setText(f3.getText());
            panelc.add(labelc);
            panelc.add(field1);
            frame3.add(panelc);
            frame3.add(paybutton);
            frame3.add(done);
            frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame3.setVisible(true);
        }
        if (flag == 2) {
            frame3.setLayout(new FlowLayout());
            frame3.setSize(420, 300);
            panelc.setLayout(new GridLayout(2, 2, 10, 10));
            labelc = new JLabel("AMOUNT");
            labelc.setForeground(Color.blue);
            labelc.setFont(myfont);
            field1 = new TextField();
            field1.setBackground(Color.white);
            field1.setSize(100, 50);
            field1.setText(f3.getText());

            labele = new JLabel();
            labele.setIcon(new ImageIcon("./Screenshot (174).png"));
            labele.setSize(200, 200);
            panelc.add(labelc);
            panelc.add(field1);
            frame3.add(panelc);
            frame3.add(labele);
            frame3.add(done);
            frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame3.setVisible(true);
        }
        if (flag == 3) {
            System.out.println("flag3" + flag);
            frame3.setLayout(new FlowLayout());
            frame3.setSize(420, 300);
            panelc.setLayout(new GridLayout(2, 2, 10, 10));
            labelc = new JLabel("AMOUNT");
            labelc.setForeground(Color.blue);
            labelc.setFont(myfont);
            field1 = new TextField();
            field1.setBackground(Color.white);
            field1.setSize(100, 50);
            field1.setText(f3.getText());
            JLabel labeld = new JLabel("ENTER ID NUMBER ");
            labeld.setForeground(Color.blue);
            labeld.setFont(myfont);
            field2 = new TextField();
            field2.setBackground(Color.white);
            field2.setSize(100, 50);
            labele = new JLabel();
            labele.setIcon(new ImageIcon("./Screenshot (175).png"));
            labele.setSize(200, 200);
            panelc.add(labelc);
            panelc.add(field1);
            panelc.add(labeld);
            panelc.add(field2);
            frame3.add(panelc);
            frame3.add(labele);
            frame3.add(done);
            frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame3.setVisible(true);
        }

    }

}