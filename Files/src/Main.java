import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        File file = new File("C:\\java-concepts\\Files\\src\\student.txt");

        try {
            if(file.createNewFile()){
                System.out.println("Created");
            }else{
                System.out.println("Already Exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
