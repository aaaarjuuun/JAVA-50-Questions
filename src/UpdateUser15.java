import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateUser15 {
    public static void main(String[] args){
        try{
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root";
            String dbPassword = "password";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,dbPassword);

            String query = "Update users SET full_name = ? Where user_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1,"Dhemaji Engineering College");
            pstmt.setInt(2,5);

            int rowsAffected = pstmt.executeUpdate();

            if(rowsAffected > 0){
                System.out.println("Success : User name update to 'Dhemaji Engineering College'!");
            }else{
                System.out.println("Failed: No user found with user_id = 5.");
            }

            pstmt.close();
            con.close();
        }catch(Exception exception){
            System.out.println("database Error:  "+ exception.getMessage());
            exception.printStackTrace();

        }
    }
}
