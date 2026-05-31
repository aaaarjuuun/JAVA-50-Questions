import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Displayusers14 {
    public static void main(String[] args){
        try{
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root";
            String dbPassword = "password";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,dbPassword);
            System.out.println("---User Details from Database---");

            String query = "SELECT full_Name,email FROM users";
            PreparedStatement pstmt = con.prepareStatement(query);

            ResultSet rs = pstmt.executeQuery();

            int count = 1;

            while (rs.next()) {
                String name = rs.getString("full_name");
                String email = rs.getString("email");

                System.out.println(count + ". Name: "+ name + "Email: " + email);
                count++;
            }
            if(count ==1){
                System.out.println("No users found in the database.");
            }
            rs.close();
            pstmt.close();
            con.close();
        }catch(Exception exception){
            System.out.println("Database Error: " + exception.getMessage());
            exception.printStackTrace();

        }
    }
}
