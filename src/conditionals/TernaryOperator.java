package conditionals;

public class TernaryOperator {
    public static void main(String[] arg) {
        int num1 = 20;
        int num2 = 10;

        int a, b;
        a = ( b = num1> num2? num2:num1) == num1? num2: num1;
        System.out.println(a + " is greater than " + b);
    }
}
