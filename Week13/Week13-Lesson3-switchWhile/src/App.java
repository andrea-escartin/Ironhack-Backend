import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // switch is a way to do a conditional for specific cases
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell me a year between 2000 and 2005: ");
        int year = sc.nextInt();
        sc.nextLine();
            switch (year) {
                case 2000:
                    System.out.println("New milenia!!!");
                    break;
                case 2001:
                    System.out.println("A space odyssey");
                    break;
                default:
                    break;
            }
        sc.close();
    }
}
