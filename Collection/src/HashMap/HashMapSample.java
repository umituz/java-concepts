package HashMap;

import java.util.HashMap;

public class HashMapSample
{
    public static void dictionary()
    {
        HashMap<String,String> dictionary = new HashMap<String,String>();

        dictionary.put("table","tablo");
        dictionary.put("book","kitap");

//        dictionary.remove("book");
//        System.out.println(dictionary.size());
//        System.out.println(dictionary);
//        System.out.println(dictionary.get("table"));

        for(String item:dictionary.keySet()){
            System.out.println("Key : " + item + " Value : " + dictionary.get(item));
        }

//        dictionary.clear();
//        System.out.println(dictionary.size());

    }
}
