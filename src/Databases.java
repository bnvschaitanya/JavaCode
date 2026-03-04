import java.sql.*;
import java.util.*;

public class Databases {
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");
        PreparedStatement stmt = conn.prepareStatement("select * from students where name=?");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scan.nextLine();
        stmt.setString(1, name);
        ResultSet rs = stmt.executeQuery();

//        PreparedStatement prs = stmt.executeUpdate("insert into students values(")");
        while(rs.next()){
            System.out.print(rs.getInt("rollno")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString(3)+" ");
            System.out.print(rs.getString(4)+" ");
            System.out.println();
        }
        stmt.close();
        conn.close();
    }
}
