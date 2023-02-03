import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String str = in.nextLine();
        String rev = "";

        str = str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.print("THe string is palindrome string");
        } else
            System.out.print("THe string is not a palindrome string");

    }
}
