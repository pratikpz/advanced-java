
package db;
import java.sql.*;
public class ScrollUpdatable {
    
    public static void main(String[] args){
        try{
            
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        ResultSet rs = st.executeQuery("select * from student");
        rs.absolute(2);
        System.out.println("Recent id is "+ rs.getInt(1));
        int inc = 2;
        
        rs.updateInt(1, inc+rs.getInt(1));
        
        rs.updateRow();
        
        System.out.println("Recent id is "+ rs.getInt(1));
        
        st.close();
        con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
