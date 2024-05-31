// 18)write a java program to display number is pronic or not
import java.util.*;
public class Pronic{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,n,flag=0;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(i=1;i<=(n/2);i++){
            if(n==(i*(i+1))){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Pronic number");
        }
        else {
            System.out.println("Not pronic number");
        }
    }
}