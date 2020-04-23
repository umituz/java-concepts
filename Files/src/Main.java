import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String fileName = "C:\\java-concepts\\Files\\src\\student.txt";
//        createFile(fileName);
//        getFileInfo(fileName);
        readFile(fileName);
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

    public static void readFile(String fileName)
    {
        File file = new File(fileName);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
