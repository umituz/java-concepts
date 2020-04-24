package ArrayList;

import java.util.ArrayList;

public class ArrayListSample
{
    public static void list()
    {
        ArrayList numbers = new ArrayList();

        numbers.add(1);
        numbers.add(2);
        numbers.add("Ümit UZ");
        numbers.add("Just Great");
        numbers.set(2, "Awesome Ümit UZ");

//        System.out.println(numbers.size());
//        numbers.remove(3);
//        System.out.println(numbers.size());
//        System.out.println(numbers.get(2));


        for(Object number:numbers){
            System.out.println(number);
        }

        numbers.clear();
        System.out.println(numbers.size());
    }
}
