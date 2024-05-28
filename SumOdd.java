// 11)sum of first n even numbers
import java.util.*;
public class SumOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter a number :");
        n=sc.nextInt();
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
        }
        System.out.println("The sum of first "+n+" odd numbers is "+sum);
    }
}