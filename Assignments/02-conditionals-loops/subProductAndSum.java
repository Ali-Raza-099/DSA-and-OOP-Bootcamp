import java.util.Scanner;

public class subProductAndSum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int product = 1;
        int sum = 0;

        while(number > 0){
            int rem = number % 10;
            product *= rem;
            sum += rem;
            number /= 10; 
        }
        System.out.println("Product is: "+product+" "+"Sum is: "+sum);
        System.out.print("subtraction of product and sum: "+ (product-sum));
    }
}