import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class database {

    public static void createDb() {
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String passowrd = "root";
        String dbname = "coffee";
        try {
            Connection con = DriverManager.getConnection(url, username, passowrd);
            String query = "CREATE DATABASE " + dbname;
            Statement s = con.createStatement();
            s.execute(query);
            s.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createTable() {
        String url = "jdbc:mysql://localhost:3306/coffee";
        String username = "root";
        String passowrd = "root";

        try {
            Connection con = DriverManager.getConnection(url, username, passowrd);
            String query = "CREATE TABLE items (username varchar(20),password varchar(20) primary key,contact_no varchar(10),address varchar(30))";
            Statement s = con.createStatement();
            s.execute(query);
            s.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void UpdateData() {

    }

    public static void ReadData() {

    }

    public static void DeleteData() {

    }

    public static void InsertData(String name, String pass, String contact, String address) {
        String url = "jdbc:mysql://localhost:3306/coffee";
        String username = "root";
        String passowrd = "root";

        try {
            Connection con = DriverManager.getConnection(url, username, passowrd);
            String query = "INSERT INTO items (username,password,contact_no,address) VALUES( ?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, contact);
            ps.setString(4, address);
            ps.execute();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean matchData(String password1) {
        String url = "jdbc:mysql://localhost:3306/coffee";
        String username = "root";
        String passowrd = "root";

        try {
            Connection con = DriverManager.getConnection(url, username, passowrd);
            String query = "SELECT password FROM items WHERE password=" + password1;
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                if (rs.getString(1).equals(password1)) {
                    JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFULL", "LOGIN SUCCESSFULL",
                            JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else if (!rs.getString(1).equals(password1)) {
                    JOptionPane.showMessageDialog(null, "WRONG PASSWORD ", "WRONG PASSWORD ",
                            JOptionPane.INFORMATION_MESSAGE);
                    return false;
                }
            }
            s.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
}
