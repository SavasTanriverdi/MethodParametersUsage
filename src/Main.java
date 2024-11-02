public class Main {

    // Toplama metodu
    public int add(int a, int b) {
        return a + b;
    }

    // Çıkarma metodu
    public int subtract(int a, int b) {
        return a - b;
    }

    // Çarpma metodu
    public int multiply(int a, int b) {
        return a * b;
    }

    // Bölme metodu
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Main main = new Main();

        // Toplama işlemi
        System.out.println("Addition: " + main.add(10, 5));

        // Çıkarma işlemi
        System.out.println("Subtraction: " + main.subtract(10, 5));

        // Çarpma işlemi
        System.out.println("Multiplication: " + main.multiply(10, 5));

        // Bölme işlemi
        System.out.println("Division: " + main.divide(10, 5));
    }
}