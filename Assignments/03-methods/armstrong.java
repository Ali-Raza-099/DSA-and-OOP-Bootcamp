import java.util.Scanner;

public class armstrong {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = sc.nextInt();
    boolean check = isArmstrong(number);
    System.out.println(check);
  }

  static boolean isArmstrong(int n) {
    int original = n;
    int digitsNumber = 0;
    int result = 0;
    while (n > 0) {
      n /= 10;
      digitsNumber++;
    }
    n = original;
    while (n > 0) {
      int lastDigit = n % 10;
      result += Math.pow(lastDigit, digitsNumber);
      n /= 10;
    }
    return result == original;
  }
}
