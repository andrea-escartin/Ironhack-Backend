import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your position: ");
        int pos = keyboard.nextInt();
        keyboard.nextLine(); // fix - need to consume the leftover newline (not read by )
        // without the line above, the input below takes the newline from the int
        System.out.println("Input name and surname: ");
        String name = keyboard.nextLine();
        System.out.println("Input your age: ");
        int age = keyboard.nextInt();
        System.out.println("Te llamas " + name  + " y tienes " + age + " años. Bienvenid@ a Ironhack!");
        System.out.println("en el puesto" + pos + ", está "+ name + " con " + age + " años");
        keyboard.close();
    }
}
