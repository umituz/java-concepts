public class Main
{
    public static void main(String[] args)
    {
        String message = "MY NAME IS UMIT UZ";

        System.out.println(message);
        System.out.println("-------------");
        System.out.println("Element count : " + message.length());
        System.out.println("5. element : " + message.charAt(4));
        System.out.println(message.concat(" AND I AM AWESOME"));
        System.out.println(message.startsWith("M"));
        System.out.println(message.endsWith("Z"));
        System.out.println("-------------");
        char[] characters = new char[7];
        message.getChars(0,7,characters,0);
        System.out.println(characters);
        System.out.println("-------------");
        System.out.println(message.indexOf('Y'));
        System.out.println(message.lastIndexOf('U'));

    }
}
