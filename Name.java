// 15)Write a program to read your name and print it ‘n’ times
import java.util.*;
public class Name{
    public static void mian(String args[]){
        Scanner input=new Scanner(System.in);
        String n;
        System.out.println("Enter Your Name:");
        n=input.nextString();
        for(int i=1;i<10;i++){
            System.out.print(" "+n);
        }
    }
}