import java.util.Scanner;

public class palindromeNumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number to reverse it: ");
    int number = in.nextInt();
    int originalNumber = number;
    int reverseNumber = 0;
    for (int i = 0; number != 0; i++) {
      int lastDigit = number % 10;
      reverseNumber = reverseNumber * 10 + lastDigit;
      number = number / 10;
    } 
    if (originalNumber == reverseNumber) {
      System.out.println("The given number is Palindrome");
    } else {
      System.out.println("The given number is not a Palindrome");
    }
  }
}
