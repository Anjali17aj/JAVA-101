
public class reverseori {
    public static void main(String args[]){
        int n=12345;
        int rev=0; 
    while(n>0){
        int lastDig= n%10;
        rev = (rev * 10)+lastDig;
        n=n/10;
    }   
        System.out.print(rev);
    }
}
