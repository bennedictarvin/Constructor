/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Arvin Situmorang
 */
public class Register implements ActionListener {

    static DatabaseHandler conn = new DatabaseHandler();
    User name;

    JFrame frame;
    JTextField textFieldEmail;
    JTextField textFieldName;
    JPasswordField textFieldPassword;
    JFileChooser photo;
    JComboBox category;
    JButton button1;
    JButton button2;

    public Register() {
        frame = new JFrame();
        frame.setSize(500, 500);

        JLabel labelEmail = new JLabel();
        labelEmail.setText("Enter your email address:");
        labelEmail.setBounds(10, 30, 200, 100);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(10, 100, 200, 30);

        JLabel labelName = new JLabel();
        labelName.setText("Enter your name:");
        labelName.setBounds(10, 120, 200, 100);

        textFieldName = new JTextField();
        textFieldName.setBounds(10, 190, 200, 30);

        JLabel labelPassword = new JLabel("Enter your password:");
        labelPassword.setBounds(10, 200, 200, 100);

        textFieldPassword = new JPasswordField();
        textFieldPassword.setBounds(10, 270, 200, 30);

        photo = new JFileChooser("C:\\Users\\Arvin Situmorang\\Downloads\\");
        //photo.showSaveDialog(null);

        String[] account = {"Private Account", "Creator Account", "Business Account"};
        category = new JComboBox(account);
        category.setBounds(10, 310, 100, 30);

        button1 = new JButton();
        button1.setText("Register");
        button1.setBounds(10, 350, 100, 50);
        button1.addActionListener(this);
        button1.setVerticalAlignment(JButton.CENTER);
        button1.setHorizontalAlignment(JButton.CENTER);

        button2 = new JButton();
        button2.setText("Back");
        button2.setBounds(120, 350, 100, 50);
        button2.addActionListener(this);
        button2.setVerticalAlignment(JButton.CENTER);
        button2.setHorizontalAlignment(JButton.CENTER);

        frame.setLayout(null);
        frame.add(labelEmail);
        frame.add(textFieldEmail);
        frame.add(labelName);
        frame.add(textFieldName);
        frame.add(labelPassword);
        frame.add(textFieldPassword);
        frame.add(photo);
        frame.add(category);
        frame.add(button1);
        frame.add(button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Register();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button2) {
            new Main();
        } else if (ae.getSource() == button1) {
            insertNewUser(name);
        }
    }

    public static boolean insertNewUser(User user) {
        conn.connect();
        String query = "INSERT INTO users VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPassword());
            stmt.setInt(5, user.getIdCategory());
            stmt.setString(6, user.getPhoto());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            conn.disconnect();
            return (false);
        }
    }
}
