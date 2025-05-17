
import java.util.Scanner;

public class brkout {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("enter the number is not a multiple of 10");
        int n = sc.nextInt();
        if(n%10==0){
            break;
        }
        
        }while(true);

    }
}
