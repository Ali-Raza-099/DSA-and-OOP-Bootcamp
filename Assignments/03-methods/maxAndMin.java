import java.util.Scanner;

public class maxAndMin {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    int numOne = sc.nextInt();
    // int numTwo = sc.nextInt();
    // int numThree = sc.nextInt();

    String evenOrOdd = isEvenOrOdd(numOne);
    System.out.print(evenOrOdd);
    // int max = maxNumber(numOne, numTwo, numThree);
    // int min = minNumber(numOne, numTwo, numThree);
    // System.out.print("Maximum is " + max + ", Minimum is: " + min);
  }

  static int maxNumber(int a, int b, int c) {
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    return max;
  }

  static int minNumber(int a, int b, int c) {
    int min = a;
    if (b < min) {
      min = b;
    }
    if (c < min) {
      min = c;
    }
    return min;
  }

  static String isEvenOrOdd(int n) {
    if (n < 0) {
      return "Please enter a positive number";
    }
    if (n % 2 == 0) {
      return "Even";
    }
    return "Odd";
  }
}
