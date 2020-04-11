public class Main {
    public static void main(String[] args) {
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
    }
}
