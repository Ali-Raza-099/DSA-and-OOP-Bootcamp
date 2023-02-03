public class evenDaysInMonth {

  public static void main(String[] args) {
    int monthDays = 31;
    int count = 0;
    for (int i = 1; i <= monthDays; i++) {
      if (i % 2 == 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}
