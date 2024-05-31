
package db;
import java.sql.*;

public class DeleteDemo {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root","");
            Statement st = con.createStatement();
            int result = st.executeUpdate("delete from student where id=1");
            System.out.println(result + " row affected");
            st.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
