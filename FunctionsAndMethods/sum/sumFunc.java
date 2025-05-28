import java.util.*;
public class sumFunc {
    public static int add(int num1, int num2){
        int sum= num1 + num2; //this sum is different from the sum in the main function
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = add(a,b);  //this sum is different from the sum in the add function
        System.out.println("The sum of " + a + " + " + b + " is: " + sum);
    }
}
