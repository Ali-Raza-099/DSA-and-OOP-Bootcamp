import java.util.Scanner;

public class countOccurrence {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = in.nextInt();
    System.out.print("Enter the Occurrence number: ");
    int occurrenceNum = in.nextInt();
    int count = 0;

    for (int i = 0; i <= number; i++) {
      int rem = number % 10;
      if (rem == occurrenceNum) {
        count++;
      }
      number = number / 10;
    }
    System.out.println(
      "Number of " + occurrenceNum + " occurrences in this integer is " + count
    );
  }
}
