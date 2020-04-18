public class Main
{
    public static void main(String[] args)
    {
        referenceType();
        customer();
        fourOperations();
    }

    public static void fourOperations(){
        FourOperations fourOperations = new FourOperations();

        int result = fourOperations.plus(1,1);

        System.out.println(result);
    }

    public static void customer(){
        Customer customer = new Customer();
        customer.create();
        customer.store();
        customer.edit();
        customer.update();
        customer.destroy();
    }

    public static void referenceType(){

        int number1 = 10;
        int number2 = 20;

        number2 = number1;
        System.out.println(number2);

        int[] numbers1 = new int[]{1,2,3,4,5};
        int[] numbers2 = new int[]{6,7,8,9,10};

        numbers2 = numbers1;
        numbers1[0] = 10;

        System.out.println(numbers2[0]);

    }

}

