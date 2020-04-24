public class Main
{
    public static void main(String[] args)
    {
        int number = 1;
        int remainder = number % 2;
        boolean isPrime = true;
//        System.out.println(remainder);

        if(number == 1){
            System.out.println("Number is not prime number");
            return;
        }

        if(number < 1){
            System.out.println("Number is invalid");
            return;
        }

        for(int i=2;i<number;i++) {
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Number is prime number");
        }else{
            System.out.println("Number is not prime number");
        }
    }
}
