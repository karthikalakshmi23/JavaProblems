import java.util.Scanner;

public class DAY_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (M > N) {
            System.out.println("M should not be greater than N. Product is 1.");
            System.out.println(1);
        } else {
            int product = 1;
            for (int i = M; i <= N; i++) {
                product *= i;
            }
            System.out.println("Product: " + product);
        }
        sc.close();
    }
}
