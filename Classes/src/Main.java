public class Main
{
    public static void main(String[] args)
    {
        Customer customer = new Customer();
        Customer customer2 = new Customer();

        customer = customer2;

        customer.create();
        customer2.create();
        customer.store();
        customer.edit();
        customer.update();
        customer.destroy();


        referenceType();
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

