
package db;
import java.sql.*;
import javax.sql.rowset.*;

public class Rowset {
    
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
            Statement st =con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            RowSetFactory rsf = RowSetProvider.newFactory();
            CachedRowSet crs = rsf.createCachedRowSet();
            crs.populate(rs);
            con.close();
//            rs.next();
            crs.next();
            System.out.println(crs.getInt(1) + crs.getString(2) + crs.getString(3));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
