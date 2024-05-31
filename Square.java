//12)Write a program to find ‘n’ power ‘n’ (n^n)
import java.util.*;
public class Square{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,f1=1;
        System.out.println("Enter a number :");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            f1=n*i;
            
        }
        System.out.println("n*n="+f1);
    }
}