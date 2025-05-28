import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 1 - Greetings
        exercise1(sc);

        // 2 - Calculator with switch and methods
        exercise2(sc);

        // 3 - Parrot wants peanuts
        exercise3(sc);

        // 4 - Modify a phrase
        exercise4(sc);

        sc.close();
    }

    private static void exercise1(Scanner sc) {
        // 1.1 - Greet with no parameters, everything inside method
        greet1();

        // 1.2 - Greet with parameters name and greeting, no return
        System.out.print("\nEnter a greeting: ");
        String greeting = sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        greet2(greeting, name);

        // 1.3 - Greet with parameters and return
        String message = greet3(greeting, name);
        System.out.println(message);
    }

    // 1.1
    public static void greet1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a greeting: ");
        String greeting = scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(greeting + " " + name);
        // scanner.close();
    }

    // 1.2
    public static void greet2(String greeting, String name) {
        System.out.println(greeting + " " + name);
    }

    // 1.3
    public static String greet3(String greeting, String name) {
        return greeting + " " + name;
    }

    private static void exercise2(Scanner sc) {
        char option;
        do {
            System.out.print("\nChoose an operation (+, -, *, /) or s to stop: ");
            option = sc.next().charAt(0);

            if (option == 's') break;

            double num1 = readDouble(sc, "Enter the first number: ");
            double num2 = readDouble(sc, "Enter the second number: ");

            switch (option) {
                case '+':
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case '-':
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case '/':
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        } while (option != 's');
    }

    // 2 - Calculator methods
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    private static void exercise3(Scanner sc) {
        String food;
        do {
            System.out.print("\nWhat do you give the parrot? ");
            food = sc.nextLine();
            if (!food.equalsIgnoreCase("peanuts")) {
                askForFood();
            }
        } while (!food.equalsIgnoreCase("peanuts"));

        sleep();
    }
    // 3 - Parrot methods
    public static void askForFood() {
        System.out.println("Parrot: cacatúa cacahuetes!");
    }

    public static void sleep() {
        System.out.println("Parrot: zzZzzzz…");
    }

    // 4 - Modify phrase
    private static void exercise4(Scanner sc) {
        System.out.print("\nEnter a phrase: ");
        String phrase = sc.nextLine();
        System.out.print("");
        byte choice = readByte(sc, "Choose an option (1: UPPERCASE, 2: lowercase, 3: reverse): ");
        String modified = modifyPhrase(phrase, choice);
        System.out.println("Modified phrase: " + modified);
    }

    public static String modifyPhrase(String phrase, byte option) {
        switch (option) {
            case 1:
                return phrase.toUpperCase();
            case 2:
                return phrase.toLowerCase();
            case 3:
                return new StringBuilder(phrase).reverse().toString();
            default:
                return "Invalid option.";
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
