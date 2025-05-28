public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 23;
        int num2 = 7;

        int div = num1/num2;
        System.out.println("Result is: " + div);

        float divFloat = num1/num2;
        System.out.println("Float result is: " + divFloat);

        // we need to cast, else the division is an int division and the int result is assinged to a float
        float divFloatCast = (float) num1/num2;
        System.out.println("Float result casted is: " + divFloatCast);
    }
}
