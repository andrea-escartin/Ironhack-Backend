import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Single instances
        Bike b1 = new Bike("Orbea", "MX50", 35, true);
        Bike b2 = new Bike("Decathlon", "Rockrider", 30, false);

        System.out.println(b1);
        System.out.println(b2);

        // Method tests
        b1.pedal();
        b2.ringBell();
        b1.changeGears();
        b2.changeGears();

        // Change property using setter
        b2.setHasGears(true);
        System.out.println("After update: " + b2);

        // ArrayList of Bikes
        ArrayList<Bike> bikeList = new ArrayList<>();
        bikeList.add(b1);
        bikeList.add(b2);
        bikeList.add(new Bike("Specialized", "Allez", 40, true));

        // Loop with for-each to print all bikes
        System.out.println("\nAll Bikes:");
        for (Bike bike : bikeList) {
            System.out.println(bike);
        }

        // Show only brand and max speed
        System.out.println("\nBrands and max speeds:");
        for (Bike bike : bikeList) {
            System.out.println("Brand: " + bike.getBrand() + ", Max speed: " + bike.getMaxSpeed() + " km/h");
        }

        // EXTRA: Scanner input
        Scanner scanner = new Scanner(System.in);
        int newSpeed = readInt(scanner, "Enter a new max speed for the first bike: ");
        b1.setMaxSpeed(newSpeed);
        System.out.println("Updated: " + b1);
        scanner.close();
    }

    public static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int val = sc.nextInt();
                sc.nextLine();
                return val;
            }
            sc.nextLine();
            System.out.println("Invalid input. Please enter a whole number (int).");
        }
    }
}
