public class Main
{
    public static void main(String[] args)
    {
        String[] names = new String[3];
        names[0] = "Ümit";
        names[1] = "UZ";
        names[2] = "Ümit UZ";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("----------------");

        for(String name:names){
            System.out.println(name);
        }

        System.out.println("----------------");

        double[] prices = {1.1,2.2,3.3,4.4,5.5};

        double total = 0;

        for(double price:prices){
            total += price;
            System.out.println(price);
        }

        System.out.println(total);

    }
}
