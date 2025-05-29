package FunctionsAndMethods.swap;

public class swap {
    public static void swap(int a, int b){
 // Swap the values of a and b
 
        int temp=a;
        a=b;
        b=temp;
        
        System.out.println("After swap: a=" + a + ",b=" + b);

    }
    public static void main(String[] args){
        int a = 5;
        int b= 10;
        System.out.println("Before swap: a=" + a + ",b=" + b);
       swap(a,b); // Call the swap function
    }
    
}
