import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // exercise1();
        // exercise2(sc);
        exercise3();
        sc.close();

    }

    private static void exercise3() {
        ArrayList<String> ppl = new ArrayList<>();
        ppl.add("Andrea"); ppl.add("Carlota"); ppl.add("Nuria"); ppl.add("Marta"); ppl.add("Maria"); 
        System.out.println("Welcome to the Earth!! Let me present you some humans");
        System.out.printf("The humans accompaning us are: %s\n", ppl.toString());
        
        // 2 and 3 get scared and leave the mission
        // but Ari replaces participant 2
        System.out.printf("Oh no, looks like %s and %s will not be able to join us\n", ppl.get(1), ppl.get(2));
        ppl.set(1, "Ari");
        ppl.remove(2);
        System.out.printf("But it's okay! Looks like %s is joining us. The crew now is: %s\n", ppl.get(1), ppl.toString());

        // Last person gets sick but she recomends Paula for the mission
        System.out.printf("Oh no! More bad news. %s got sick and will not be able to join!\n", ppl.get(ppl.size()-1));
        ppl.remove(ppl.size()-1);
        ppl.add("Paula");
        System.out.printf("But don't worry, %s is joining us! These is our crew now: %s\n", ppl.get(ppl.size()-1), ppl.toString());
        ppl.add(2, "Tere");
        System.out.printf("Good news! Another addition to the team! %s is joining us, making the crew complete: %s\n", ppl.get(2), ppl.toString());
    }

    private static void exercise2(Scanner sc) {
        ArrayList<String> santJordiElements = new ArrayList<>();
        String element;

        do {
            System.out.println("Tell me something typical from Sant Jordi (type 'exit' to quit): ");
            element = sc.nextLine();
            if (!element.equals("exit")){
                santJordiElements.add(element);
            }
        } while (!element.equals("exit"));
        System.out.printf("The elements of Sant Jordi are: %s", santJordiElements.toString());
    }

    private static void exercise1() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 20; i < 51; i++) {
            array.add(i);
        }
        System.out.printf("The output array is: %s\n", array.toString());
    }
}
