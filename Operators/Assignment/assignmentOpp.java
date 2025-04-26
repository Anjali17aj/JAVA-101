public class assignmentOpp {
    public static void main(String[] args) {
        // Assignment operator
        int a = 10;
        int b = 20;

        // Using assignment operator
        a = b; // Assigning value of b to a
        System.out.println("Value of a after assignment: " + a); // Output: 20

        // Compound assignment operators
        int c = 5;
        c += 3; // Equivalent to c = c + 3
        System.out.println("Value of c after +=: " + c); // Output: 8

        c -= 2; // Equivalent to c = c - 2
        System.out.println("Value of c after -=: " + c); // Output: 6

        c *= 4; // Equivalent to c = c * 4
        System.out.println("Value of c after *=: " + c); // Output: 24

        c /= 6; // Equivalent to c = c / 6
        System.out.println("Value of c after /=: " + c); // Output: 4

        c %= 3; // Equivalent to c = c % 3
        System.out.println("Value of c after %=: " + c); // Output: 1
    }
}