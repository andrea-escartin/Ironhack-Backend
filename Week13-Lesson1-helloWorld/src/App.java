import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("\nHello, World!");
        // int x = 5;
        // int y = 9;
        // int sum = x+y;
        // System.out.println("Sum is: " + sum);
        // float z = 8.22f;
        // // to sum we need to cast -> write in parenthesis the value to convert
        // float sumFloats = x+y+z;
        // int sumInts = (int) (x+y+z);
        // System.out.println("Sum with integers is: " + sumInts);
        // System.out.println("Sum with decimals is: " + sumFloats);

        // // creare an input variable for int
        // Scanner keyboard = new Scanner(System.in); 
        // System.out.println("Write an integer: ");
        // int userNum = keyboard.nextInt();  // reads the number

        // System.out.println("Write another integer: ");
        // int userNum2 = keyboard.nextInt();

        // int userSum = userNum + userNum2;
        // System.out.println("The sum is: " + userSum);
        // System.out.println("The sum is: " + (userNum+userNum2));

        // // create input variable for string
        // System.out.println("What's your fav country?: ");
        // String country = keyboard.nextLine();  // This is now working
        // System.out.println("Everyone likes " + country);

        // keyboard.close(); // close to avoid leakeage

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your position: ");
        int pos = keyboard.nextInt();
        System.out.println("Input name and surname: ");
        String name = keyboard.nextLine();
        System.out.println("Input your age: ");
        int age = keyboard.nextInt();
        System.out.println("Te llamas " + name  + " y tienes " + age + " años. Bienvenid@ a Ironhack!");
        System.out.println("en el puesto" + pos + ", está "+ name + " con " + age + " años");
        keyboard.close();
        
    }
}
