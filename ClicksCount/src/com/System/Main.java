package com.System;

import javax.swing.*;
import java.awt.*;

public class Main  {
    JFrame window;
    JPanel panel;
    JButton btnClick;
    JButton btnReset;
    JLabel lblCount;
    int count=0;
    Main() {
        window = new JFrame("Button");

        panel = new JPanel();
        btnClick = new JButton("Click");
        btnClick.addActionListener(e -> {
                count++;
                lblCount.setText("No of Clicks: "+count);
            });
        btnReset = new JButton("Reset");
        btnReset.addActionListener(e -> {
                count=0;
                lblCount.setText("No of Clicks: "+count);
        });
        lblCount=new JLabel("No of Clicks: "+count);
        lblCount.setFont(new Font("sans-serif", Font.PLAIN,24));

        btnClick.setFocusable(false);
        btnReset.setFocusable(false);

        btnClick.setBackground(Color.BLUE);
        btnReset.setBackground(Color.RED);
        lblCount.setForeground(Color.BLACK);
//        window.add(btnReset);
//        window.add(btnClick);
//        window.add(lblCount);
        panel.setBorder(BorderFactory.createEmptyBorder());
        GridBagConstraints gbc=new GridBagConstraints();
        panel.setLayout(new GridBagLayout());
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill=GridBagConstraints.BOTH;
        panel.add(btnClick,gbc);
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill=GridBagConstraints.BOTH;
        panel.add(btnReset,gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.gridwidth=2;
        gbc.gridheight=1;
        gbc.weightx=2;
        gbc.weighty=1;
        gbc.fill=GridBagConstraints.BOTH;
        panel.add(lblCount,gbc);
        window.add(panel, BorderLayout.CENTER);



        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,150);
//        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }


}
