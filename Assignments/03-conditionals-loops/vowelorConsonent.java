import java.util.Scanner;

public class vowelorConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if(ch == 'a' || ch == 'i'|| ch == 'o' || ch == 'u' || ch == 'e'){
            System.out.println("The entered character is vowel");
        }else{
            System.out.println("The entered character is consonant");
        }
    }
}
