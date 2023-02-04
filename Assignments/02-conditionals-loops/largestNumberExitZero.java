import java.util.Scanner;

public class largestNumberExitZero {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int max = 0;
    while (true) {
        System.out.println("Enter the number");
        int number = in.nextInt();
        int temp = number;
        if(temp > max){
            max = temp;
        } else if(number == 0){
            break;
        }
        else{
            System.out.println("Invalid Terminator");
        }
        System.out.println(max);
    }
  } 
}
