package CheckedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException
{
    public static void readFile() throws IOException {
        BufferedReader reader = null;
        int total = 0;
        try {
           FileReader file = new FileReader("C:\\java-concepts\\ExceptionHandling\\src\\CheckedException\\number.txt");
           reader = new BufferedReader(file);
           String line = null;
           while((line = reader.readLine()) != null){
               total += Integer.valueOf(line);
           }
           System.out.println("Total : " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           reader.close();
        }

    }
}
