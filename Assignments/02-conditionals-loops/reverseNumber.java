import java.util.Scanner;

public class reverseNumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number to reverse it: ");
    int number = in.nextInt();
    int reverseNumber = 0;
    for (int i = 0; number != 0; i++) {
      int lastDigit = number % 10;
      reverseNumber = reverseNumber * 10 + lastDigit;
      number = number / 10;
    }
    System.out.print("The reverse of this number is " + reverseNumber);
  }
}
