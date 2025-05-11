
import java.util.Scanner;

public class rev {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to reverse.");
        int n = sc.nextInt();

       
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
            System.out.print(n);
        }
    }
