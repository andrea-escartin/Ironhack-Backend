import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // exercise1(sc);
        int [] array = generateRandomIntArray(5);
        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        int [] arrayEven = new int[evenCount];
        int [] arrayOdd = new int[oddCount];
        int iEven = 0;
        int iOdd = 0;
        for (int num : array) {
            if(num % 2 == 0){
                // arrayEven[iEven] = num;
                // iEven++;
                // above is correct, but below is optimized
                arrayEven[iEven++] = num;
            }
            else {
                arrayOdd[iOdd] = num;
                iOdd++;
            }
            
        }

        System.out.printf("The array %s has %d even number(s) and %d odd number(s)\n", Arrays.toString(array), evenCount, oddCount);
        System.out.printf("The even array is: %s\nThe odd array is: %s", Arrays.toString(arrayEven), Arrays.toString(arrayOdd));
        sc.close();
    }

    private static void exercise1(Scanner sc) {
        int arraySize = readInt(sc, "How big should the array be? ");
        int[] array = generateRandomIntArray(arraySize);
        System.out.printf("Your array i: %s", Arrays.toString(array));
    }

    private static int[] generateRandomIntArray(int arraySize) {
        int [] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            int n = (int) (Math.random() * 10);
            array[i] = n;
        }
        return array;
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
