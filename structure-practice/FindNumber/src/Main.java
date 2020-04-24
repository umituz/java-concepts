public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        int willBeFounded = 5;
        boolean isExists = false;

        for(int number:numbers){
            if(number == willBeFounded){
                isExists = true;
                break;
            }
        }

        if(isExists){
            System.out.println("It is exists");
        }else{
            System.out.println("It is not exists");
        }
    }
}
