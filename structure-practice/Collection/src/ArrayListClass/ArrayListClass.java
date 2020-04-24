package ArrayListClass;

import java.util.ArrayList;

public class ArrayListClass
{
    public static void arrayListClass()
    {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Ümit UZ"));
        customers.add(new Customer(2,"Umut UZ"));

        Customer willBeRemoved = new Customer(3,"Ümit Umut UZ");
        customers.add(willBeRemoved);
        customers.remove(willBeRemoved);

        for(Customer customer:customers){
            System.out.println(customer.id + " : " + customer.name);
        }
    }
}
