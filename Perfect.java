// 20)write a java program to accept number from user and print the number is perfect or not
import java.util.*;
public class Perfect{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,sum=0,i;
        System.out.println("Enter a number");
        n=input.nextInt();
        for(i=1;i<=(n/2);i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("Perfect number");
        }
        else System.out.println("Not perfect number");
    }
}