package ArrayListType;

import java.util.ArrayList;
import java.util.Collections;

public class Type
{
    public static void type()
    {
        ArrayList<String> provinces = new ArrayList<String>();

        provinces.add("Istanbul");
        provinces.add("Ankara");
        provinces.add("İzmir");
        provinces.add("Gaziantep");
        provinces.add("Antalya");

        provinces.remove("Antalya");

        Collections.sort(provinces);

        System.out.println(provinces.size());

        for(String province:provinces){
            System.out.println(province);
        }
    }
}
