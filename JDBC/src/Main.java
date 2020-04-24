import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
            resultSet = statement.executeQuery("select code,name,continent,region from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()){
                String code = resultSet.getString("code");
                String name = resultSet.getString("name");
                String continent = resultSet.getString("continent");
                String region = resultSet.getString("region");
                countries.add(new Country(code,name,continent,region));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            databaseHelper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}