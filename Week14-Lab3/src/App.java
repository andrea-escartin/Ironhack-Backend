import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        exercise1();
        exercise1Arrays();
        exercise2();
        exercise3();
    }

    private static void exercise3() {
        System.out.println("\n=== ANALYZING A PHRASE ===");
        String fraseAleatoria = "Los errores del pasado son la sabiduria del presente";
        char target = 'e';
        int countE = 0;
        ArrayList<Integer> positions = new ArrayList<>();

        for (int i = 0; i < fraseAleatoria.length(); i++) {
            if (fraseAleatoria.charAt(i) == target) {
                countE++;
                positions.add(i);
            }
        }

        if (countE > 0) {
            System.out.println("The letter 'e' exists.");
            System.out.println("It appears " + countE + " times.");
            System.out.println("Positions: " + positions);
        } else {
            System.out.println("The letter 'e' does not exist.");
        }
    }

    private static void exercise2() {
        System.out.println("\n=== AVERAGE OF NUMBERS ===");
        Scanner sc = new Scanner(System.in);

        int count = readInt(sc, "How many numbers do you want to enter? ");
        ArrayList<Integer> numbers = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < count; i++) {
            int number = readInt(sc, "Enter number " + (i + 1) + ": ");
            numbers.add(number);
            sum += number;
        }

        double average = (double) sum / numbers.size();
        System.out.println("Average: " + average);

        sc.close();
    }

    public static void exercise1Arrays() {
        System.out.println("=== FIESTA EN TU CASA (SIN COLLECTIONS) ===");

        // Initial guest list
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Michael");
        guests.add("Laura");
        guests.add("Pedro");
        guests.add("Ana");
        guests.add("Luis");
        guests.add("Sofia");
        guests.add("Carlos");
        guests.add("Lucia");
        guests.add("Marta");
        guests.add("Tomas");
        System.out.println("Initial guest list: " + guests);

        // Michael can't come
        for (int i = 0; i < guests.size(); i++) {
            if (guests.get(i).equals("Michael")) {
                guests.remove(i);
                break;
            }
        }
        System.out.println("Removed Michael (traveling): " + guests);

        // Pepi and Silvester join
        guests.add("Pepi");
        guests.add("Silvester");
        System.out.println("Added Pepi and Silvester: " + guests);

        // Eva wants to be third
        guests.add(2, "Eva");
        System.out.println("Added Eva in position 3: " + guests);

        // Another party joins
        String[] newPeople = {"Juan", "Elena", "Raul", "Carmen", "Hugo", "Isabel", "Mario", "Nuria", "Pablo", "Sandra"};
        for (int i = 0; i < newPeople.length; i++) {
            guests.add(newPeople[i]);
        }
        System.out.println("Added guests from the other party: " + guests);

        // Sort alphabetically (basic bubble sort)
        for (int i = 0; i < guests.size() - 1; i++) {
            for (int j = i + 1; j < guests.size(); j++) {
                if (guests.get(i).compareTo(guests.get(j)) > 0) {
                    String temp = guests.get(i);
                    guests.set(i, guests.get(j));
                    guests.set(j, temp);
                }
            }
        }
        System.out.println("Sorted guest list: " + guests);

        // Last guest
        String lastGuest = guests.get(guests.size() - 1);
        System.out.println("Last guest in the list: " + lastGuest);

        // Check if Pedro is in the list
        boolean found = false;
        for (int i = 0; i < guests.size(); i++) {
            if (guests.get(i).equals("Pedro")) {
                System.out.println("Pedro is in the list at position: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Pedro is not in the list.");
        }
    }

    private static void exercise1() {
        System.out.println("=== FIESTA EN TU CASA ===");

        ArrayList<String> guests = new ArrayList<>();
        // Initial list
        Collections.addAll(guests, "Michael", "Laura", "Pedro", "Ana", "Luis", "Sofia", "Carlos", "Lucia", "Marta", "Tomas");
        System.out.println("Initial guest list: " + guests);

        // Michael can't come
        guests.remove("Michael");
        System.out.println("Removed Michael (traveling): " + guests);

        // Pepi and Silvester join
        guests.add("Pepi");
        guests.add("Silvester");
        System.out.println("Added Pepi and Silvester: " + guests);

        // Eva wants to be third
        guests.add(2, "Eva");
        System.out.println("Added Eva in position 3: " + guests);

        // Another party joins
        ArrayList<String> newGuests = new ArrayList<>();
        Collections.addAll(newGuests, "Juan", "Elena", "Raul", "Carmen", "Hugo", "Isabel", "Mario", "Nuria", "Pablo", "Sandra");
        guests.addAll(newGuests);
        System.out.println("Added guests from the other party: " + guests);

        // Sort alphabetically
        Collections.sort(guests);
        System.out.println("Sorted guest list: " + guests);

        // Last guest
        String lastGuest = guests.get(guests.size() - 1);
        System.out.println("Last guest in the list: " + lastGuest);

        // Check if Pedro is in the list
        if (guests.contains("Pedro")) {
            System.out.println("Pedro is in the list at position: " + guests.indexOf("Pedro"));
        } else {
            System.out.println("Pedro is not in the list.");
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
}
