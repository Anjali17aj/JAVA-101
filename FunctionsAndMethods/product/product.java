public class product{
    public static int multiply(int a, int b){
        int product = a*b;
        return  product;
    }
public static void main(String args[]){
    int a = 10;
    int b =7;
    int prod = multiply(a, b);
    System.out.println("The product of " + a + " and " + b + " is: " + prod);
}
}
