public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 23;
        int num2 = 7;

        int div = num1/num2;
        System.out.println("Result is: " + div);

        float divFloat = num1/num2;
        System.out.println("Float result is: " + divFloat);

        float divFloatCast = (float) num1/num2;
        System.out.println("Float result casted is: " + divFloatCast);
    }
}
