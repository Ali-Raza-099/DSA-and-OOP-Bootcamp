import java.util.Scanner;

public class calculator {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int result = 0;
    while (true) {
      System.out.print("Enter the operator: ");
      char op = in.next().trim().charAt(0);
      if (op == '-' || op == '+' || op == '/' || op == '%') {
        System.out.print("Enter the two number: ");
        int numberOne = in.nextInt();
        int numberTwo = in.nextInt();
        if (op == '-') {
          result = numberOne - numberTwo;
        }
        if (op == '+') {
          result = numberOne + numberTwo;
        }
        if (op == '%') {
          result = numberOne % numberTwo;
        }
        if (op == '/') {
          result = numberOne / numberTwo;
        }
      } else if (op == 'c' || op == 'C') {
        break;
      } else {
        System.out.println("Invalid Operator");
      }
      System.out.println(result);
    }
  }
}
