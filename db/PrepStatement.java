
package db;

import java.sql.*;
public class PrepStatement {
    public static void main(String[] args){
        try{
            
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
        PreparedStatement pst = con.prepareStatement("insert into student value(? , ? , ?)");
        pst.setInt(1,10);      
        pst.setString(2,"Ram");
        pst.setString(3,"Gaindakot");
        
        int result = pst.executeUpdate();
        System.out.println(result + " row inserted");
        pst.close();
        con.close();
        }
        catch(Exception e){
             System.out.println(e);
        }
    }
}
