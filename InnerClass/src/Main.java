public class Main
{
    public static void main(String[] args)
    {
        DatabaseHelper.Crud.create();
        DatabaseHelper.Crud.read();
        DatabaseHelper.Crud.update();
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}
