/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Arvin Situmorang
 */
public class Login implements ActionListener {
    
    JFrame frame;
    JButton button1;
    JButton button2;
    JTextField textFieldName;
    JPasswordField textFieldPassword;

    public Login() {
        frame = new JFrame();
        
        ImageIcon image = new ImageIcon("google.png");
        frame.setIconImage(image.getImage());
        frame.setSize(500, 500);
        
        JLabel labelName = new JLabel();
        labelName.setText("Enter your email address:");
        labelName.setBounds(10, 30, 200, 100);

        
        textFieldName = new JTextField();
        textFieldName.setBounds(10, 100, 200, 30);
        
        JLabel labelPassword = new JLabel("Enter your password:");
        labelPassword.setBounds(10, 150, 200, 100);
        
        textFieldPassword = new JPasswordField();
        textFieldPassword.setBounds(10, 220, 200, 30);
        
        button1 = new JButton();
        button1.setText("Login");
        button1.setBounds(10, 300, 100, 50);
        button1.addActionListener(this);
        button1.setVerticalAlignment(JButton.CENTER);
        button1.setHorizontalAlignment(JButton.CENTER);
        
        button2 = new JButton();
        button2.setText("Back");
        button2.setBounds(120, 300, 100, 50);
        button2.addActionListener(this);
        button2.setVerticalAlignment(JButton.CENTER);
        button2.setHorizontalAlignment(JButton.CENTER);
        
        frame.setLayout(null);
        frame.add(labelName);
        frame.add(textFieldName);
        frame.add(labelPassword);
        frame.add(textFieldPassword);
        frame.add(button1);
        frame.add(button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            if (textFieldName.getText().isEmpty() || textFieldPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in your email & password first!");
            } else {
                JOptionPane.showMessageDialog(null, "Login sukses!");
                new ViewData();
            }
        } else {
            new Main();
        }
    }
}
