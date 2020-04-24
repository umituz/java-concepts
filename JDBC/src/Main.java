import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = databaseHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select name,population from city");
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException exception) {
            databaseHelper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}