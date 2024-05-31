// 16)write a java program to print the no which are divisible by both 3 and 7 from 1 to 100
public class Divisible{
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%7==0){
                System.out.println(" "+i);
            }
        }
    }
}