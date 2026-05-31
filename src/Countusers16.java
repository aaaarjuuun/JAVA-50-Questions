import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Countusers16 {
    public static void main(String[] args){
        try{
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root";
            String dbpassword = "password";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,dbpassword);

            String query = "Select COUNT(*) as total_users FROM users";
            PreparedStatement pstmt = con.prepareStatement(query);

            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                int totalCount = rs.getInt("total_users");
                System.out.println("Total number of users in the database: "+ totalCount);
            }
        }catch (Exception exception){
            System.out.println("databaseError: " + exception.getMessage());
            exception.printStackTrace();
        }

    }
}
