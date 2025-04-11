import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Square\n6. Square Root\n7. Cube\n8. Exit");
            int choice = sc.nextInt();

            if (choice == 8) {
                System.out.println("Exit.");
                break;
            }
