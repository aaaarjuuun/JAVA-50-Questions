import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class Registration {
    public static void main(String[] args){

        JFrame f = new JFrame("REGISTRATION WINDOW");
        f.setLayout(new GridLayout(4,2,10,10));

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton regbtn = new JButton("REGISTER");

        f.add(new JLabel("Full Name: "));
        f.add(nameField);
        f.add(new JLabel("Email: "));
        f.add(emailField);
        f.add(new JLabel("Password: "));
        f.add(passField);
        f.add(new JLabel(" "));
        f.add(regbtn);

        regbtn.addActionListener(e->{
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passField.getPassword());

            if(name.isEmpty() || email.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog(f,"Please fill all fields!","Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try{
                String url = "jdbc:mysql://localhost:3306/testdb";
                String user = "root" ;
                String dbPassword = "password";

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,user,dbPassword);

                String query = "Insert into users(full_Name,email,password) Values(?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(query);

                pstmt.setString(1,name);
                pstmt.setString(2,email);
                pstmt.setString(3,password);

                int rowAffected = pstmt.executeUpdate();

                if(rowAffected>0){
                    JOptionPane.showMessageDialog(f,"Registration Successful!","Sucess",JOptionPane.INFORMATION_MESSAGE);
                }
                pstmt.close();
                con.close();
            }catch (Exception exception){
                JOptionPane.showMessageDialog(f,"Database Error: " + exception.getMessage(), "Critical Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        f.setSize(350,200);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
