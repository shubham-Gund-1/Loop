// 13) Multiplication table using + operator
import java.util.Scanner;
public class Mult{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = 0;
            for (int j = 0; j < i; j++) {
                result=result+number;
            }
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}