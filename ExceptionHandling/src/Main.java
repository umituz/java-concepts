//import CheckedException.CheckedException;
import CustomException.BalanceInsufficientException;
import Throw.AccountManager;

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

//        try{
//            CheckedException.readFile();
//        }catch (Exception exception){
//            System.out.println(exception);
//        }

        AccountManager accountManager = new AccountManager();

        System.out.println("Balance : " + accountManager.getBalance());

        accountManager.deposit(100);

        System.out.println("Balance : " + accountManager.getBalance());

        try {
            accountManager.withDraw(90);
        } catch (BalanceInsufficientException exception) {
           System.out.println(exception.getMessage());
        }

        System.out.println("Balance : " + accountManager.getBalance());

        try {
            accountManager.withDraw(20);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Balance : " + accountManager.getBalance());

    }
}
