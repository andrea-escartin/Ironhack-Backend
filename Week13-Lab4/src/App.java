import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        // exercise1(sc);
        // exercise2(sc);
        // exercise3(sc);
        // exercise4(sc);
        // exercise5(sc);
        // exercise6(sc);
        // Implemented 2 methods, naive pythonic one (method = 1) and Java specific one (method = 2)
        // Both methods behave the same, but first one is not efficient. Keeping to be aware of bad practice.
        int method = 2;
        extraExercise(sc, method); 
        sc.close();
    }

    private static void extraExercise(Scanner sc, int method) {
        // Method 1 - same results as 2, but less efficient.
        // Everytime we use +=, we create a new String object (they are inmutable)
        switch (method) {
            case 1:
                String letters = "";
                char letter;
                int maxLoop = readInt(sc, "How many letters do you want to enter? ");
                for (int i=0; i<maxLoop; i++){
                    letter = readChar(sc, "Give me a letter: ");
                    letters += letter;

                }
                System.out.printf("You introduced the letters: %s", letters);
                break;
            case 2:
                StringBuilder letterBuilder = new StringBuilder();
                char letterB;
                int maxLoopB = readInt(sc, "How many letters do you want to enter? ");
                for (int i=0; i<maxLoopB; i++){
                    letterB = readChar(sc, "Give me a letter: ");
                    letterBuilder.append(letterB);

                }
                System.out.printf("You introduced the letters: %s", letterBuilder.toString());
                break;
            default:
                System.out.println("Use method 1 (pythonic, not Java efficient) or 2");
        }
    }

    private static void exercise6(Scanner sc) {
        char letter;
        int maxLoop = readInt(sc, "How many letters do you want to enter? ");
        for (int i=0; i<maxLoop; i++){
            letter = readChar(sc, "Give me a letter: ");
            System.out.printf("You said the letter %c\n", letter);

        }
    }

    private static void exercise5(Scanner sc) {
        System.out.println("Introduce a text. I'll tell you if it has only lower, upper case or both:");
        String txt = sc.nextLine();
        while (txt.trim().length()==0) {
            System.out.println("Upss looks like the text is empty. Try again: ");
            txt = sc.nextLine();
        }
        if (txt.equals(txt.toLowerCase())) {
            System.out.println("Text only has lower case!");
        } 
        else if (txt.equals(txt.toUpperCase())) {
            System.out.println("Text only has upper case!");
        } 
        else {
            System.out.println("Text has both lower and upper case.");
        }
    }

    private static void exercise4(Scanner sc) {
        System.out.print("What's your phone number? ");
        String num = sc.nextLine();
        String numClean = num.replace("-", "");
        System.out.printf("Your phone number is: %s", numClean);
    }

    private static void exercise3(Scanner sc) {
        System.out.print("Give me a word or sentence to reverse: ");
        String str = sc.nextLine();
        int strLen = str.length();
        while (strLen <= 1) {
            System.out.print("I need a longer string. Please try again: ");
            str = sc.nextLine();
            strLen = str.length();
        }
        for (int i = strLen-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    private static void exercise2(Scanner sc) {
        String color = "purple";
        System.out.print("Guess my favourite color: ");
        String userColor = sc.nextLine();
        int attempt = 0;  // chagnge to 1 if first
        String prompt = "No, that's not my favourite color. Guess again";
        while (attempt<3 && !color.equalsIgnoreCase(userColor)) {
            ++attempt;
            if (attempt==3) {
                prompt += " but be careful, this is your last attempt";
            }
            System.out.println("Attempt number" + attempt);
            System.out.printf("%s: ", prompt);
            userColor = sc.nextLine();
        }
        if (!color.equalsIgnoreCase(userColor)) {
            System.out.printf("Ohhh you did not guessed it! My favorite color is %s", color);
        }
        else{
            System.out.printf("Yes! %s is my favourite color\n", color);
        }
    }

    private static void exercise1(Scanner sc) {
        int randomNum = (int) Math.floor(Math.random()*5+1);
        System.out.println("\n\n" + randomNum);
        int userGuess = readInt(sc, "Guess a number between 1 and 5: ");

        int tries = 1;

        while (userGuess != randomNum) {
            ++tries;
            userGuess = readInt(sc, "Upsss wrong guess. Try again!: ");
        }
        System.out.printf("Amazing!! You guessed the secret number (%d) in %d tries\n", randomNum, tries);
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

    public static char readChar(Scanner sc, String prompt) {
    while (true) {
        System.out.print(prompt);
        String input = sc.nextLine();
        if (input.length() == 1) {
            return input.charAt(0);
        }
        System.out.println("Invalid input. Please enter a single character.");
    }
}
}
