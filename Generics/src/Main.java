public class Main
{
    public static void main(String[] args)
    {
//        MyList<Customer> myList = new MyList<Customer>();
//
//        myList.add(new Customer());
//        myList.add(new Customer());

        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);
    }
}
