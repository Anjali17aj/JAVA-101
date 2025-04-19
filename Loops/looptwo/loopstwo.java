import java.util.Scanner;

public class loopstwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.out.println("Hey! Welcome to the space.");
            counter++;
        }
        System.out.println("Done.");
    }
}
