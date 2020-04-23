import CheckedException.CheckedException;

public class Main
{
    public static void main(String[] args)
    {
//        try{
//            int[] numbers = new int[]{1,2,3};
//
//            System.out.println(numbers[5]);
//        }catch (StringIndexOutOfBoundsException exception){
//            System.out.println("StringIndexOutOfBoundsException : " + exception);
//        } catch (ArrayIndexOutOfBoundsException exception){
//            System.out.println("ArrayIndexOutOfBoundsException : " + exception);
//        }catch (Exception exception){
//            System.out.println("Exception Log : " + exception);
//        }finally {
//            System.out.println("Done");
//        }

        try{
            CheckedException.readFile();
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}
