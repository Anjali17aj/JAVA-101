public class factorial {
    // Function to calculate factorial of a number
    public static int factorials(int n) {
       int f=1;
            for (int i = 1; i <= n; i++) {
                f *= i; // Multiply f by i for each iteration
            }
        return f;
    }

public static void main(String[] args) {
    System.out.println("Factorial of 5 is: " + factorials(5));
}
}