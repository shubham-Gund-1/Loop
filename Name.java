// 15)Write a program to read your name and print it ‘n’ times
import java.util.Scanner;
public class Name{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of times to print your name: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(name);
        }
    }
}