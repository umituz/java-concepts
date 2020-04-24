import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String username = "root";
    static String password = "";
    static String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static void main(String[] args) {
        try {
            getConnection();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Connected...");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            connection.close();
        }
    }
}