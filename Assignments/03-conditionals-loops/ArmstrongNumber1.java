import java.util.Scanner;

public class ArmstrongNumber1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int originalNum = num;
    int digits = 0;
    int result = 0;

    // Find the number of digits in the number
    while (originalNum != 0) {
      originalNum /= 10;
      ++digits;
    }

    // For each digit in the number, raise it to the power of the number of digits and add the result to a running total
    originalNum = num;
    while (originalNum != 0) {
      int remainder = originalNum % 10;
      result += Math.pow(remainder, digits);
      originalNum /= 10;
    }
    System.out.println(result);
    // Compare the running total to the original number
    if (result == num) {
      System.out.println(num + " is an Armstrong number");
    } else {
      System.out.println(num + " is not an Armstrong number");
    }
  }
}
