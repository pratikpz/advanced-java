package db;
import java.sql.*;
public class ScrollableDb {
 public static void main(String args[]) {
  try {
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcajava","root", "");
   Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
   ResultSet rs = st.executeQuery("select * from student");
   rs.absolute(2);
   System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
   rs.relative(-1);
   System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
   rs.last();
   System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));

   st.close(); con.close();
  } catch(Exception e) {
    e.printStackTrace();
  }
 }
}