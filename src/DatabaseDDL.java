import java.sql.*;
import java.util.Scanner;

public class DatabaseDDL {
    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");

        Scanner sc = new Scanner(System.in);

        System.out.println("1.rollno \n2.name \n3.city \n4.deptno \n5.dname \nEnter your choice:");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        String field = "";

        switch (choice) {
            case 1:
                field = "rollno";
                break;
            case 2:
                field = "name";
                break;
            case 3:
                field = "city";
                break;
            case 4:
                field = "deptno";
                break;
            case 5:
                field = "dname";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.print("Enter value for " + field + ":");
        String value = sc.nextLine();

        String sql = "select * from students S JOIN dept D ON S.deptno = D.dname WHERE " + field + " = ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, value);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            System.out.println(
                    rs.getInt(1) + " " +
                            rs.getString(2) + " " +
                            rs.getString(3) + " " +
                            rs.getString(4)
            );
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}