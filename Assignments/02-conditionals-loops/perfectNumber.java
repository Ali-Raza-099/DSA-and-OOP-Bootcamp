import java.util.Scanner;

public class perfectNumber {

  public static void main(String[] args) {
    // A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
    // For example, 6 is a perfect number because its divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.

    // Divisors are the positive integers that divide a given number evenly, i.e., without leaving a remainder.
    // For example, the divisors of 6 are 1, 2, 3, and 6.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int n = sc.nextInt();
    int devisorSum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        devisorSum += i;
      }
    }
    if (n == devisorSum) {
      System.out.println("Perfect Number");
    } else {
      System.out.println("Not a perfect number");
    }
  }
}
