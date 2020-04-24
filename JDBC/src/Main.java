import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            getConnection();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void getConnection() throws SQLException {
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();
        try {
            connection = databaseHelper.getConnection();
            System.out.println("Connected...");
        } catch (SQLException exception) {
            databaseHelper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}