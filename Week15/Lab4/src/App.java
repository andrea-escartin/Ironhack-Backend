public class App {
    public static void main(String[] args) throws Exception {
        exercise1();
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
}
