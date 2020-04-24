import java.sql.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
//        create();
//        read();
        update();
    }

    public static void read() throws SQLException
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

    public static void create() throws SQLException
    {
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();
        PreparedStatement statement = null;
        try {
            connection = databaseHelper.getConnection();
            String sqlQuery = "insert into city (name,countryCode,district,population) values(?,?,?,?)";
            statement = connection.prepareStatement(sqlQuery);
            statement.setString(1,"Muha");
            statement.setString(2,"TUR");
            statement.setString(3,"Muha");
            statement.setInt(4,5000);
            int result = statement.executeUpdate();
            System.out.println("Result : " + result);

        } catch (SQLException exception) {
            databaseHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void update() throws SQLException
    {
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();
        PreparedStatement statement = null;
        try {
            connection = databaseHelper.getConnection();
            String sqlQuery = "update city set population = 100000, district = 'Turkey' where id = ?";
            statement = connection.prepareStatement(sqlQuery);
            statement.setInt(1,4081);
            int result = statement.executeUpdate();
            System.out.println("Result : " + result);

        } catch (SQLException exception) {
            databaseHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
}