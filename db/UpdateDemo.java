
package db;
import java.sql.*;
public class UpdateDemo {
    
    public static void main(String[] args){
        try{
            
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
        Statement st = con.createStatement();
        
        int result = st.executeUpdate("update student set name='Pratik' where id=2");
        
        System.out.println(result + " row updated");
        
    }catch(Exception e){
        System.out.println(e);
    }
    }
    
}
