
package db;
import java.sql.*;
public class PrepDelete {
   public static void  main(String[] args)
   {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
           PreparedStatement pst = con.prepareStatement("delete from student where id = ?");
           
           pst.setInt(1,10);
           
           int result = pst.executeUpdate();
           
           System.out.println(result + " row deleted");
           
           pst.close();
           con.close();
       }
       catch(Exception e){
           System.out.println(e);
       }
   } 
}
