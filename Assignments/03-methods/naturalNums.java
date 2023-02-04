import java.util.Scanner;

public class naturalNums {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter starting and ending point: ");
    int start = sc.nextInt();
    int end = sc.nextInt();
    int result = allNatsum(start, end);
    System.out.println(result);
  }

  static int allNatsum(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
      result += i;
    }
    return result;
  }
}
