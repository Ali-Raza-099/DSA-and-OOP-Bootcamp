import java.util.Scanner;

public class sumPositiveNegativeEvenOdd {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int nSum = 0, eSum = 0, oSum = 0;
    while (true) {
      int n = in.nextInt();
      if (n == 0) {
        break;
      }
      if (n < 0) {
        nSum += n;
      } else if (n % 2 == 0) {
        eSum += n;
      } else {
        oSum += n;
      }
    }
    System.out.println("The sum of negative numbers is: "+nSum);
    System.out.println("The sum of positive even numbers is: "+eSum);
    System.out.println("The sum of negative even numbers is: "+oSum);
  }
}
