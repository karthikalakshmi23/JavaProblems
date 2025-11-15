/*2. Online Shopping Discount

 - A customer’s total purchase is given.

-  If amount ≥ 5000 → Apply 20% discount.

-  Else if amount ≥ 2000 → Apply 10% discount.

 - Else → No discount.*/
import java.util.Scanner; 

public class DAY_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double amount = scanner.nextDouble();
        double discount = 0;

        if (amount >= 5000) {
            discount = amount * 0.20;
        } else if (amount >= 2000) {
            discount = amount * 0.10;
        }

        double finalAmount = amount - discount;
        System.out.println("Discount applied: " + discount);
        System.out.println("Final amount to pay: " + finalAmount);

        scanner.close();
    }
}
