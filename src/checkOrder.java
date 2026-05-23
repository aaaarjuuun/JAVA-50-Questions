import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class checkOrder {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root" ;
        String password = "password";


        int searchOrderNum = 544879;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Database connection Successful! ");

            String query = "Select * From customer_orders Where order_num = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, searchOrderNum);

            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                System.out.println("Order number " + searchOrderNum + "exists in the database.");
            }else{
                System.out.println("Order number " + searchOrderNum + "Does NOT exist.");
            }
        }catch(Exception exception){
            System.out.println("Database ERROR: " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
