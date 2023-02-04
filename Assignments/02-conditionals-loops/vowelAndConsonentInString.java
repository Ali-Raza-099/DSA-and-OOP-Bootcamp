import java.util.Scanner;

public class vowelAndConsonentInString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    str = str.trim();
    str = str.toLowerCase();
    int vowel = 0;
    int consonant = 0;
    for (int i = 0; i < str.length(); i++) {
      if (
        str.charAt(i) == 'a' ||
        str.charAt(i) == 'i' ||
        str.charAt(i) == 'o' ||
        str.charAt(i) == 'u' ||
        str.charAt(i) == 'e'
      ) {
        vowel++;
      } else {
        consonant++;
      }
    }
    System.out.println(vowel + " " + consonant);
  }
}
