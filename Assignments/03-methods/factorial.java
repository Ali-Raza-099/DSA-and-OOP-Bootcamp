public class factorial {

  public static void main(String[] args) {
    int fact = fact(0);
    System.out.println(fact);
  }

  static int fact(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }
}
