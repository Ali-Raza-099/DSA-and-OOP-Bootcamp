import java.util.Scanner;

public class weekddaysInSwitch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of any weekday: ");
    int day = sc.nextInt();
    switch (day) {
      case 1, 2, 3, 4, 5 -> System.out.print("Weekday");
      case 6, 7 -> System.out.print("Weekend");
    }
  }
}
