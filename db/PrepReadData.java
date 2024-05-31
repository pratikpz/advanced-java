
package db;
import java.sql.*;
public class PrepReadData {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
            PreparedStatement pst = con.prepareStatement("select * from student where id = ?");
            
            pst.setInt(1,10);
            
             ResultSet rs= pst.executeQuery();
            
             while(rs.next()){
            System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
        }
            
            pst.close();
            con.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
