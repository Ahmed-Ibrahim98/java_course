package methods;

public class AddTwoNumbers {
    public static void main(String[] arg) {
        var num1 = 5.5;
        var num2 = 10.5;
//        double addition = AddTwoNumbers.addNumbers(num1,num2);
        double addition = addNumbers(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + addition);
    }

    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }
}
