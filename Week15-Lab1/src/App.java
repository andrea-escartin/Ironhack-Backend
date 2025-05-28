public class App {
    public static void main(String[] args) throws Exception {
        Computer c1 = new Computer("Dell", "XPS 13", 16, 512, 1200.0, true);
        Computer c2 = new Computer("HP", "Envy", 8, 256, 850.0, false);
        Computer c3 = new Computer("Apple", "MacBook Air", 8, 512, 1300.0, true);

        // 1. Print all features
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // 2. Print brand and price of a specific computer
        System.out.println("Brand: " + c1.getBrand() + ", Price: $" + c1.getPrice());

        // 3. Change property and print again
        c1.setPrice(1100.0);
        System.out.println("Updated price of " + c1.getBrand() + ": $" + c1.getPrice());

        // Extra: apply discount
        c3.applyDiscount(10); // 10% off
        System.out.println("After discount: " + c3);
    }
}
