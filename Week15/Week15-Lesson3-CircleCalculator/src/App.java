public class App {
    public static void main(String[] args) throws Exception {
        /*
         * We have a class Circle with 3 methods:
         *  calculate circumference
         *  calculate area
         *  determine if length circumference is normal, small (<=5) or big (>50)
         */
        Circle c1 = new Circle(1);
        System.out.println(c1);
        System.out.printf("Circumference=%.2f\nArea=%.2f\n", c1.getCircumference(), c1.getArea());
        System.out.printf("The circumference is %s\n", c1.evaluateCircumference());
    }
}
