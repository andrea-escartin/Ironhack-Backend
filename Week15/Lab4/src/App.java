import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // exercise1(sc);
        sc.close();

        exercise2();
    }

    private static void exercise2() {
        ArrayList<String> cities = new ArrayList<>();
        // Fill arraylist with 20 cities
        for (int i = 1; i <= 20; i++) {
            cities.add("City" + i);
        }

        // Select and print 3 random cities
        for (int i = 0; i < 3; i++) {
            int randomIndex = getRandomIndex(cities.size());
            String selectedCity = cities.get(randomIndex);
            System.out.println("Selected city: " + selectedCity);
            // Use debugger to observe:
            // - The value of i (loop index)
            // - The value of randomIndex
            // - The selected city
        }
    }

    public static int getRandomIndex(int upperBound) {
        Random rand = new Random();
        int result = rand.nextInt(upperBound);
        // Set a breakpoint here to trace when it jumps from main to this method
        return result;
    }

    private static void exercise1(Scanner sc) {
        List<VinylRecord> records = new ArrayList<>();
        records.add(new VinylRecord("Pink Floyd", "The Wall", 1979, 81));
        records.add(new VinylRecord("The Beatles", "Abbey Road", 1969, 47));
        records.add(new VinylRecord("Queen", "A Night at the Opera", 1975, 43));
        records.add(new VinylRecord("David Bowie", "Heroes", 1977, 40));
        records.add(new VinylRecord("Nirvana", "Nevermind", 1991, 49));

        // Show all records
        System.out.println("All records:");
        for (VinylRecord record : records) {
            System.out.println(record);
        }

        // Show year of 3rd record
        System.out.println("\nYear of 3rd record: " + records.get(2).getYear());

        // Change year of 3rd record
        records.get(2).setYear(1980);
        System.out.println("Updated year of 3rd record: " + records.get(2));

        // Search by artist
        System.out.print("\nEnter artist name to search: ");
        String search = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getArtist().toLowerCase().contains(search.toLowerCase())) {
                System.out.println("Artist found at position " + i + ": " + records.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Artist not found.");
        }

        // Extra: User adds a record
        System.out.print("\nAdd your own record - Artist: ");
        String artist = sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        int year = readInt(sc, "Year: ");
        double duration = readDouble(sc, "Duration: ");
        sc.nextLine(); // consume newline

        records.add(new VinylRecord(artist, title, year, duration));
        System.out.println("New record added. Full list:");
        for (VinylRecord record : records) {
            System.out.println(record);
        }
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

    public static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                double val = sc.nextDouble();
                sc.nextLine();
                return val;
            }
            sc.nextLine();
            System.out.println("Invalid input. Please enter a number (double).");
        }
    }
}
