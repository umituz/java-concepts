import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper
{
    private String username = "root";
    private String password = "159538";
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(dbUrl, username, password);
    }

    public void showErrorMessage(SQLException sqlException)
    {
        System.out.println("Error exception : " + sqlException.getMessage());
        System.out.println("Error code : " + sqlException.getErrorCode());
    }
}
