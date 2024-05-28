//14)Write a program to display the numbers sequentially from 1 to 99 with 5 numbers on each line
public class Sequentially{
    public static void main(String args[]){
        for(int i=1;i<=99;i++){
            System.out.print(i+" ");
            if(i%5==0){
                System.out.println();
            }
        }
    }
}