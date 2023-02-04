public class palindrome {

  public static void main(String[] args) {
    boolean check = isPalindrome(1111);
    System.out.println(check);
  }

  static boolean isPalindrome(int n) {
    int original = n;
    int revNum = 0;
    while (n > 0) {
      revNum = revNum * 10 + n % 10;
      n /= 10;
    }
    return original == revNum;
  }
}
