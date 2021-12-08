// Program that prints out the powers of two up to 694
public class activity1 {
    public static void main(String[] args) {
        printPower();
    }

    public static void printPower() {
        int result = 1;
        while (result <= 694) {
            System.out.println(result);
            result *= 2;
        }
    }

    
}