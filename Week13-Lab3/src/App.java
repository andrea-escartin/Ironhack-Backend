import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);  // Question - is this better or should i initialize and close it in each method?
    
    byte exercise = readByte(sc, "Which exercise do you want to run? (1, 2 or 3): ");

    switch (exercise) {
        case 1:
            exercise1Switch(sc);
            break;
        case 2:
            exercise2While(sc);
            break;
        case 3:
            exercise3DoWhileSwitch(sc);
            break;
        default:
            System.out.println("Upsss I don't have this exercise. Run again and select 1, 2 or 3");
    }

    sc.close();
    }

    public static void exercise1Switch(Scanner sc) {
        System.out.print("What's your fav season?: ");
        String station = sc.nextLine();
        station = station.toLowerCase();
        switch (station) {
            case "spring":
                System.out.println("Spring is in the air");
                break;
            case "summer":
                System.out.println("Summer dog days");
                break;
            case "fall":
            case "autumn":
                System.out.println("Leaves are falling");
                break;
            case "winter":
                System.out.println("Brrr COLD!");
                break;
            default:
                System.out.println("Did not recognize this season");
                break;
        }
    }

    public static void exercise2While(Scanner sc) {
        // ensure answer is one of the accepted ones
        String ans = askForHelp(sc);

        // Ask for money as they say yes
        float money = 0;
        int help = 0;
        while (isYes(ans)) {
            float moneyGiven = readFloat(sc, "How much money do you want to give? ");
            money += moneyGiven;
            help++;
            ans = askForHelp(sc);
        }

        if (ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("n")) {
            System.out.println("Sad... I'm going to leave");
        }

        if (help > 0) {
            System.out.printf("I got %.2f euros from %d people", money, help);
        }
    }

    public static void exercise3DoWhileSwitch(Scanner sc) {
        byte soundByte;
        String cont = "y";
        do {
            soundByte = readByte(sc, "Choose a sound (1-car, 2-dog, 3-vespa, 4-duck): ");
            
            // Verify answer -> QUESTION should this be integrated into the default case?
            while (soundByte > 4) {
                soundByte = readByte(sc, "Upsss I don't know that sound. Options are: 1-car, 2-dog, 3-vespa, 4-duck.\nChoose a sound: ");
            }

            printSound(soundByte);
            
            String question = "Do you wanna hear another sound?: ";
            System.out.print(question);
            cont = sc.nextLine();
            cont = verifyAnswer(sc, cont, question);
        } while (isYes(cont));
    }

    private static void printSound(byte sound) {
        switch (sound) {
            case 1:
                System.out.println("Ziuuuuuum");
                break;
            case 2:
                System.out.println("Bup bup");
                break;
            case 3:
                System.out.println("Brrrrmmmm");
                break;
            case 4:
                System.out.println("Quack quack");
                break;
            default:
                System.out.println("SOMETHING IS WRONG! SHOULD NOT REACH THIS POINT");
                break;
        }
    }

    private static boolean isYes(String str) {
        return str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y");
    }  

    private static String askForHelp(Scanner sc) {
        System.out.print("A little help please? ");
        String ans = sc.nextLine();
        ans = ans.toLowerCase();
        ans = verifyAnswer(sc, ans, "A little help please? ");
        return ans;
    }

    private static String verifyAnswer(Scanner sc, String ans, String txt) {
        final List<String> possibleAns = Arrays.asList("yes", "y", "no", "n");
        while (!possibleAns.contains(ans)) {
            System.out.print("I did not understand... " + txt);
            ans = sc.nextLine().trim().toLowerCase();
        }
        return ans;
    }

    // Question - how to create a "module" with utils like the methods bellow
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

    // Not used - implemented for future use
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

    public static float readFloat(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextFloat()) {
                float val = sc.nextFloat();
                sc.nextLine();
                return val;
            }
            sc.nextLine();
            System.out.println("Invalid input. Please enter a decimal number (float).");
        }
    }

}

