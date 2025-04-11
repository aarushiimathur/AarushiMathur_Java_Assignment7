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
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Addition");
                        System.out.print("Enter first number: ");
                        double a1 = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double a2 = sc.nextDouble();
                        Addition add = new Addition(a1, a2);
                        System.out.println("Result: " + add.add());
                        break;
                    case 2:
                        System.out.println("Subtraction");
                        System.out.print("Enter first number: ");
                        double s1 = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double s2 = sc.nextDouble();
                        Subtraction sub = new Subtraction(s1, s2);
                        System.out.println("Result: " + sub.sub());
                        break;
                    case 3:
                        System.out.println("Multiplication");
                        System.out.print("Enter first number: ");
                        double m1 = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double m2 = sc.nextDouble();
                        Multiplication mul = new Multiplication(m1, m2);
                        System.out.println("Result: " + mul.multiply());
                        break;
                    case 4:
                        System.out.println("Division");
                        System.out.print("Enter numerator: ");
                        double d1 = sc.nextDouble();
                        System.out.print("Enter denominator: ");
                        double d2 = sc.nextDouble();
                        Division div = new Division(d1, d2);
                        System.out.println("Result: " + div.divide());
                        break;
