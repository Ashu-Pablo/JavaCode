package com.practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;


public class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("", Font.BOLD, 35);

    MyWindow() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());

        super.setTitle("My Clock");
        super.setSize(400, 400);
        super.setLocation(200, 50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);

    }


    public void createGUI() {
        //gui
        heading = new JLabel("Digital Clock");

        clockLabel = new JLabel("Clock");

        heading.setFont(font);
        clockLabel.setFont(new Font("", Font.PLAIN,35));

        this.setLayout(new GridLayout(2, 2));

        this.add(heading);

        this.add(clockLabel);

    }

    public void startClock() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String dateTime=new Date().toString();

                String dateTime = new Date().toLocaleString();

                clockLabel.setText(dateTime);
            }
        });
        timer.start();

    }
}

