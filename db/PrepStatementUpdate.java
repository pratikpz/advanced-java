
package db;
import java.sql.*;

public class PrepStatementUpdate {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
            PreparedStatement pst = con.prepareStatement("update student set name = ? where id = ? ");
            
            pst.setString(1,"Pratik");
            pst.setInt(2,10);
            
            int result = pst.executeUpdate();
            
            System.out.println(result + " row updated");
            pst.close();
            con.close();
            
        
            
                 
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
