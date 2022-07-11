/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Arvin Situmorang
 */
public class ViewData {

    static DatabaseHandler conn = new DatabaseHandler();
    User user;
    
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM users";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("Name"));
                user.setAddress(rs.getString("Address"));
                user.setPhone(rs.getString("Phone"));
                user.setAge(rs.getInt("Age"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        return (users);
    }

    JFrame frame;
    JComboBox user, button;
    JTable table;

    public ViewData() {

        frame = new JFrame();
        frame.setSize(400, 400);

        String data[][] = {{"101", "Amit", "When", "Okay"}};
        String kolom[] = {"Email", "Name", "Password", "Photo"};

        table = new JTable(data, kolom);
        table.setBounds(100, 150, 150, 200);

        JScrollPane scroll = new JScrollPane(table);

        frame.add(scroll);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ViewData();
    }

    
}
