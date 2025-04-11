public class Division {
    private double a, b;

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double divide() {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
