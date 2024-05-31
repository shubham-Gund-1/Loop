// 17)write a java program to Accept number and print its factor
import java.util.*;
public class Factor{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,n;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(i=n;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}