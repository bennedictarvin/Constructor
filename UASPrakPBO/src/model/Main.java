/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Arvin Situmorang
 */
public class Main implements ActionListener{
    
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton button3;

    public Main() {
        frame = new JFrame("Main Menu");
        
        
        button1 = new JButton();
        button1.setText("Login Pengguna");
        button1.setBounds(20, 20, 150, 50);
        button1.addActionListener(this);
        button1.setVerticalAlignment(JButton.CENTER);
        button1.setHorizontalAlignment(JButton.CENTER);
        
        button2 = new JButton();
        button2.setText("Registrasi Pengguna Baru");
        button2.setBounds(20, 100, 190, 50);
        button2.addActionListener(this);
        button2.setVerticalAlignment(JButton.CENTER);
        button2.setHorizontalAlignment(JButton.LEFT);
        
        button3 = new JButton();
        button3.setText("Lihat Data Pengguna Berdasarkan Kategori Dipilih");
        button3.setBounds(20, 180, 320, 50);
        button3.addActionListener(this);
        button3.setVerticalAlignment(JButton.CENTER);
        button3.setHorizontalAlignment(JButton.LEFT);
        
        frame.setLayout(null);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {            
            new Login();
        } else if (e.getSource() == button2) {
            new Register();
        } else {
            new ViewData();
        }
    }
}
