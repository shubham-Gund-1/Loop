// 21)write a java program to display fibonacci series.
import java.util.*;
public class Fibonacci{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a=0,b=1,c,n;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
           System.out.println(a);
           c=a+b;
           a=b;
           b=c;
        }
    }
}