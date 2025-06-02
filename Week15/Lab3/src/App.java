import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // exercise1(sc);
        exercise2(sc);
        
        int maxAttempts = 3;
        LogInUser user = new LogInUser("andrea", "1234", maxAttempts);
        System.out.printf("Welcome %s\n", user.getUsername());
        String pwd;
        boolean loggedIn = false;
        for (int i = 1; i <= maxAttempts+1; i++) {
            System.out.println("\nWhat's your password? ");
            System.out.println(i);
            pwd = sc.nextLine();
            loggedIn = user.attemptLogIN(pwd, i);
            if (loggedIn) {
                break;
            }
        }

        sc.close();
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


    private static void exercise2(Scanner sc) {
        SheldonNumber n = new SheldonNumber(58);
        System.out.println(n);
        int userN = readInt(sc, "Check if this number is one of Sheldon's fav: ");
        n.setNumber(userN);
        System.out.println(n);

         for (int i = 38; i < 173; i++) {
            n.setNumber(i);
            if (n.isFavorite()){
                System.out.println(n);
            }
         }
    }


    public static byte readByte(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextByte()) {
                byte val = sc.nextByte();
                sc.nextLine(); // consume leftover newline
                return val;
            }
            sc.nextLine(); // discard invalid input
            System.out.println("Invalid input. Please enter a number (byte).");
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
