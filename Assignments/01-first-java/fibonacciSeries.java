import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int firstNumber = 0;
        int secondNumber = 0;
        int nextNumber = 1;

        while (nextNumber <= n) {
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
            System.out.print(firstNumber + " ");
        }
    }
}