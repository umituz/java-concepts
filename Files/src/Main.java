import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        String fileName = "C:\\java-concepts\\Files\\src\\student.txt";
//        createFile(fileName);
        getFileInfo(fileName);
    }

    public static void createFile(String fileName)
    {
        File file = new File(fileName);

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

    public static void getFileInfo(String fileName)
    {
        File file = new File(fileName);

        if(file.exists()){
            System.out.println("File name : " + file.getName());
            System.out.println("File path : " + file.getAbsolutePath());
            System.out.println("File executable : " + file.canExecute());
            System.out.println("File writable : " + file.canWrite());
            System.out.println("File readable : " + file.canRead());
            System.out.println("File size : " + file.length());
        }
    }
}
