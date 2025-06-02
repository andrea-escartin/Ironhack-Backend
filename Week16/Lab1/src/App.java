import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option;
        String prompt = "\nSelect an option from the menu below:\n" + 
                "1 - Add food Item to the shopping cart\n" +
                "2 - Show all items in the shopping cart\n" +
                "3 - Show product details based on the product's name\n" +
                "4 - Update product's price\n" +
                "5 - Delete item from the shopping cart\n" +
                "6 - Show product price\n" +
                "7 - Show total shopping cart value\n" +
                "0 - Exit\n";
        String prodName;
        double newPrice;
        double totalPrice;
        double itemPrice;
        ShoppingCart cart = new ShoppingCart();
        do {
            option = readInt(sc, prompt);
            switch (option) {
                case 0:
                    System.out.println("Exiting the system...");
                    break;
                case 1: 
                    cart.addItem(sc);
                    break;
                case 2:
                    cart.printItemsinCart();
                    break;
                case 3:
                    System.out.print("Which product do you want to check? ");
                    prodName = sc.nextLine();
                    cart.findItemByName(prodName);
                    break;
                case 4:
                    System.out.print("Which product do you want to update? ");
                    prodName = sc.nextLine();
                    newPrice = readDouble(sc, "What's the new price?");
                    cart.updateProductPrice(prodName, newPrice);
                    break;
                case 5:
                    System.out.print("Which item do you want to delete? ");
                    prodName = sc.nextLine();
                    cart.removeItemByName(prodName);
                    break;
                case 6:
                    System.out.print("Which item price do you want to check? ");
                    prodName = sc.nextLine();
                    itemPrice = cart.getProductPriceByName(prodName);
                    System.out.printf("Item price based on the added weight is: %f", itemPrice);
                    break;
                case 7:
                    totalPrice = cart.calculateTotalPrice();
                    System.out.printf("Total price is: %f", totalPrice);
                    break;
                default:
                    System.out.println("Did not recognize this option. ");;
            }
        } while (option != 0);

        sc.close();
    }


    // TODO move to utils
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
