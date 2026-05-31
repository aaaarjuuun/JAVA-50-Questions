import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Login {
    public static void main(String[] args){
        JFrame f = new JFrame("Login Window");
        f.setLayout(new GridLayout(3,2,10,10));

        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginBtn = new JButton("Login");

        f.add(new JLabel("Email: "));
        f.add(emailField);
        f.add(new JLabel("Password"));
        f.add(passwordField);
        f.add(new JLabel(""));
        f.add(loginBtn);

        loginBtn.addActionListener(e->{
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            if(email.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog(f,"Please Enter Email and Password","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }

            try{
                String url = "jdbc:mysql://localhost:3306/testdb";
                String user = "root";
                String dbPassword = "password";


                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,user,dbPassword);

                String query = "SELECT full_name FROM users WHERE email = ? AND password = ?";
                PreparedStatement pstmt = con.prepareStatement(query);

                pstmt.setString(1,email);
                pstmt.setString(2, password);

                ResultSet rs = pstmt.executeQuery();

                if(rs.next()){
                    String fullName = rs.getString("full_name");
                    JOptionPane.showMessageDialog(f,"Welcome, " + fullName , "Login Success",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(f,"Invalid Email or Password!","Critical ERROR", JOptionPane.ERROR_MESSAGE);
                }

                rs.close();
                pstmt.close();
                con.close();

            }catch(Exception exception){

                JOptionPane.showMessageDialog(f,"Database ERROR: " + exception.getMessage(),"Critical Error", JOptionPane.ERROR_MESSAGE);

            }

        });

        f.setSize(350,180);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
