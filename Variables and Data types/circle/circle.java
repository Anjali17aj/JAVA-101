import java.util.*;


public class circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.println("The area of the circle is:" + area);
    }
}
