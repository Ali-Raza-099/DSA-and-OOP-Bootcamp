public class overloading {

  public static void main(String[] args) {
    int sum = demo(8, 9);
    int sum3 = demo(1, 2, 3);
    System.out.println(sum + " " + sum3);
  }

  static int demo(int a, int b) {
    return a + b;
  }

  static int demo(int a, int b, int c) {
    return a + b + c;
  }
}
