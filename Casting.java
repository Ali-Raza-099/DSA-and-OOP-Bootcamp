import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int number = input.nextInt();
        // int rollNumber = input.nextFloat()
        // System.out.println(number);

        // int typeCasting = (int)(99.9);
        // System.out.println(typeCasting);

        // Automatic type promotion in expressions
        byte a = 80;  // we can store max 256 in the byte type
        byte b = 40;
        byte c = 50;
        int result = a * b / c; // a*b = 80*40 = 3200 which is not possible to store in byte so here java doing automatic promotion
        System.out.println(result);
    }
}
