// 15)write a java program to sum the numbers x to y
import java.util.*;
public class SumXY{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,x,y,sum=0;
        System.out.println("Enter the value of x and y :");
        x=input.nextInt();
        y=input.nextInt();
        if(x<y){
            for(i=x;i<=y;i++){
                sum=sum+i;
            }
        }
        else{
            for(i=x;i>=y;i--){
                sum=sum+i;
            }
        }
        System.out.println("Sum is : "+sum);
    }
}