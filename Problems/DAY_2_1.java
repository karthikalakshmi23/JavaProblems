
//1.Write a Java program that takes two numbers as input and uses if-else conditions to find and display the largest number.If both numbers are equal, display a message saying they are equal.
import java.util.Scanner;
public class DAY_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
        scanner.close();
    }
}