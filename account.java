import java.sql.Connection;
import java.sql.DriverManager;

public class account {
    public static void main(String args[]) {
        Connection c1 = null;
        try {
           Class.forName("org.postgresql.Driver");
           c1 = DriverManager
              .getConnection("jdbc:postgresql://localhost:5432/testdb",
              "postgres", "123");
        } catch (Exception e) {
           e.printStackTrace();
           System.err.println(e.getClass().getName()+": "+e.getMessage());
           System.exit(0);
        }
        System.out.println("Opened database successfully");
     }
}




