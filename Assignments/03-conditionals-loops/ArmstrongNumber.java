import java.util.Scanner;

public class ArmstrongNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(
      "Enter a number, to check whether its ArmstrongNumber or not: "
    );
    int num = sc.nextInt();
    int originalNumber = num;
    int digits = 0;
    int result = 0;
    while (originalNumber != 0) {
      digits++;
      originalNumber /= 10;
    }
    originalNumber = num;
    while (originalNumber != 0) {
      int lastDigit = originalNumber % 10;
      result += Math.pow(lastDigit, digits);
      originalNumber /= 10;
    }
    if (num == result) {
      System.out.println(num + " Armstrong Number");
    } else {
      System.out.println(num + " Not an Armstrong Number");
    }
  }
}
