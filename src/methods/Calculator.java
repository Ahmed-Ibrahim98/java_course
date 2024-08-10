package methods;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the add method with two integers
        int sum1 = calc.add(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum1);

        // Calling the add method with three integers
        int sum2 = calc.add(10, 20, 30);
        System.out.println("Sum of 10, 20 and 30 is: " + sum2);

        // Calling the add method with two double values
        double sum3 = calc.add(10.5, 20.5);
        System.out.println("Sum of 10.5 and 20.5 is: " + sum3);
    }
}
