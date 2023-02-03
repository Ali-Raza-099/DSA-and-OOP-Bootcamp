import java.util.Scanner;

public class AverageOfNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers, enter 0 to exit:");
    int number;
    int sum = 0;
    int count = 0;
    while (true) {
      number = sc.nextInt();
      if (number == 0) {
        break;
      }
      sum += number;
      count++;
    }
    if (count == 0) {
      System.out.println("No numbers were entered");
    } else {
      double average = (double) sum / count;
      System.out.println("The average of the numbers is: " + average);
    }
  }
}
