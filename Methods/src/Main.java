public class Main {
    public static void main(String[] args) {
        findNumber();
        String message = manipulateMessage(" I AM AWESOME");
        showMessage(message);
        int total = addNumbers(1,1);
        System.out.println(total);
    }

    public static void findNumber() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int willBeFounded = 5;
        boolean isExists = false;

        for (int number : numbers) {
            if (number == willBeFounded) {
                isExists = true;
                break;
            }
        }

        isExists(isExists);
    }

    public static void isExists(boolean isExists) {
        if (isExists) {
            showMessage("It is exists");
        } else {
            showMessage("It is not exists");
        }
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }

    public static String manipulateMessage(String message) {
        return message.substring(0, 10);
    }

    public static int addNumbers(int number1, int number2) {
        return number1 + number2;
    }
}
