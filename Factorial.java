// 8)print the factorial of number.
import java.util.*;
public class Factorial{
    public static void main(String args[]){
        int fact=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextInt();
        for(int i=n;i>1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of Given number is :"+fact);
    }
}