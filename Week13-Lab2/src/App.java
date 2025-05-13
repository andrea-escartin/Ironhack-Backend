import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***Exercise 1 - conditionals***");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        if (age < 6 || age > 120){
            System.out.println("ERROR");
        }
        else if (age < 12){
            System.out.println("Primary school");
        }
        else if (age < 18){
            System.out.println("High school");
        }
        else if (age < 22){
            System.out.println("University");
        }
        else{
            System.out.println("Work");
        }

        // -----
        System.out.println("\n***Exercise 2 - loops***");
        for (int i=20; i>9; i--){
            // System.out.println("Square of " + i + " is: " + (i*i));
            System.out.println("Square of " + i + " is: " + (Math.pow(i, 2)));
        }

        // -----
        System.out.println("\n***Exercise 3 - Average Age***");
        System.out.print("Your father's name: ");
        String fName = keyboard.nextLine();
        System.out.print("Your father's age: ");
        int fAge = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Your mother's name: ");
        String mName = keyboard.nextLine();
        System.out.print("Your mother's age: ");
        int mAge = keyboard.nextInt();
        keyboard.nextLine();
        
        float avgAge = (float) (fAge + mAge)/2;
        
        String output = String.format(
            "Your mother's name is %s and she is %d years old. " +
            "Your father's name is %s and he is %d years old. " +
            "Their average age is: %.2f",
            mName, mAge, fName, fAge, avgAge
        );
        System.out.println(output);

        // -----
        System.out.println("\n***Exercise 3 - Questions for tourists***");
        String continent = "";
        while (true) {
            System.out.print("What continent are you from? (Africa, Asia, Europe, America, Oceania): ");
            continent = keyboard.nextLine();

            if (continent.equalsIgnoreCase("Africa")) {
                System.out.println("Africa! I'm love its landscapes and cultures.");
                break;
            } else if (continent.equalsIgnoreCase("Asia")) {
                System.out.println("Asia! I love Asian food.");
                break;
            } else if (continent.equalsIgnoreCase("Europe")) {
                System.out.println("Europe! I love its architecture.");
                break;
            } else if (continent.equalsIgnoreCase("America")) {
                System.out.println("America! I love its diversity.");
                break;
            } else if (continent.equalsIgnoreCase("Oceania")) {
                System.out.println("Oceania! I love its beaches.");
                break;
            } else {
                System.out.println("I don't recognize that continent. Please try again.");
            }
        }
        keyboard.close();

    }
}
