import java.util.Scanner;

public class sum {

  public static void main(String[] args) {
    int sum2 = sum1();
    System.out.println(sum2);
  }

  static int sum1() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number 1: ");
    int num1 = sc.nextInt();

    System.out.print("Enter the number 2: ");
    int num2 = sc.nextInt();

    return num1 + num2;
  }
}
