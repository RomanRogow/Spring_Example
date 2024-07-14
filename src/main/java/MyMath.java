public class MyMath {
    public static double divide(double num1, double num2) {
        if (num2 == 0){
            throw new ArithmeticException("Divide by zero(Деление на ноль");
        }
        return num1 / num2;
    }
}
