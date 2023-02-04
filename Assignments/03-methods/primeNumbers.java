import java.util.Scanner;

public class primeNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter starting and ending point: ");
    int start = sc.nextInt();
    int end = sc.nextInt();
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
