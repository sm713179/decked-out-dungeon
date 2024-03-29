/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sm713179.deckedoutdungeon.ui;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Samuel McClatchey
 */
public class Frame {
    JFrame frame = new JFrame("Decked Out Dungeon");
    JPanel mainPnl = new JPanel();
    GridBagConstraints gbc = new GridBagConstraints();
    
    
    //Frame
    public void display() {
        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        mainPnl.setPreferredSize(resolution); //reduces flicker
        frame.add(mainPnl, BorderLayout.CENTER);
        frame.requestFocus();
        frame.setFocusable(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(resolution);
        frame.setVisible(true);
    }
    
    public void reset() {
        mainPnl.removeAll();
        mainPnl.revalidate();
        mainPnl.repaint();
    }
    
    public void addKeyListener(KeyListener keyListener) {
        frame.addKeyListener(keyListener);
    }

    //Panels
    public void setMainPnlLayout(LayoutManager layout) {
        mainPnl.setLayout(layout);
    }
    
    public void addPnl(JPanel pnl) {
        mainPnl.add(pnl);
    }
    
    public void addPnl(JPanel childPnl, JPanel parentPnl) {
        parentPnl.add(childPnl);
    }
    
    public void addPnl(JPanel pnl, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        mainPnl.add(pnl, gbc);
    }
    
    public void addPnl(JPanel childPnl, JPanel parentPnl, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        parentPnl.add(childPnl, gbc);
    }
    
    //Labels
    public void addLbl(String txt) {
        JLabel lbl = new JLabel(txt);
        mainPnl.add(lbl);
    }
    
    public void addLbl(String txt, JPanel pnl) {
        JLabel lbl = new JLabel(txt);
        pnl.add(lbl);
    }
    
    public void addLbl(String txt, int x, int y) {
        JLabel lbl = new JLabel(txt);
        gbc.gridx = x;
        gbc.gridy = y;
        mainPnl.add(lbl, gbc);
    }
    
    public void addLbl(String txt, JPanel pnl, int x, int y) {
        JLabel lbl = new JLabel(txt);
        gbc.gridx = x;
        gbc.gridy = y;
        pnl.add(lbl, gbc);
    }
    
    /*
    Buttons 
    Action is always at end to make writing ActionListener easier
    */
    public void addBtn(String txt, String tip, ActionListener action) {
        JButton btn = new JButton(txt);
        btn.setToolTipText(tip);
        btn.addActionListener(action);
        mainPnl.add(btn);
    }
    
    public void addBtn(String txt, String tip, JPanel pnl, ActionListener action) {
        JButton btn = new JButton(txt);
        btn.setToolTipText(tip);
        btn.addActionListener(action);
        pnl.add(btn);
    }
    
    public void addBtn(String txt, String tip, int x, int y, ActionListener action) {
        JButton btn = new JButton(txt);
        btn.setToolTipText(tip);
        btn.addActionListener(action);
        gbc.gridx = x;
        gbc.gridy = y;
        mainPnl.add(btn, gbc);
    }
    
    public void addBtn(String txt, String tip, JPanel pnl, int x, int y, ActionListener action) {
        JButton btn = new JButton(txt);
        btn.setToolTipText(tip);
        btn.addActionListener(action);
        gbc.gridx = x;
        gbc.gridy = y;
        pnl.add(btn, gbc);
    }
}