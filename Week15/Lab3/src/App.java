import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
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
