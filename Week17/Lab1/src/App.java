import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ArrayList<Building> agencyListings = new ArrayList<>(
            Arrays.asList(
                new House(100, 270000, "La Garriga", false),
                new House(85, 195000, "Centelles", true),
                new Appartment(60, 160000, "Centelles", 1, false),
                new Appartment(40, 120000, "Centelles", 7, true),
                new Appartment(60, 180000, "La Garriga", 2, false),
                new StorageRoom(20, 60000, "Granollers", false),
                new StorageRoom(20, 50000, "La Garriga", true)
            )
        );
        RealStateAgency rsAgency = new RealStateAgency(agencyListings);

        String menu = "\n1 - View all listings" + 
            "\n2- View only a type of listings" +
            "\n3- View listings in a certain area" +
            "\n0 - Exit\n";
        System.out.println("Welcome to our Real State Agency:). How can we help you?");
        Integer option;
        String buildingType;
        String buildingArea;
        ArrayList<Building> filteredList = new ArrayList<>();
        do {
            option = Utils.readInt(sc, menu);
            switch (option) {
                case 0:
                    System.out.println("Thank you for your visit!");
                    break;
                case 1:
                    System.out.println(rsAgency.toString());
                    System.out.println("\nCan we help you with something else?");
                    break;
                case 2:
                    System.out.println("Which type of building would you like to see?");
                    buildingType = sc.nextLine();
                    filteredList = rsAgency.getBuildingByType(buildingType);
                    for (Building b : filteredList){
                        System.out.println(b.toString());
                    }
                    System.out.println("\nCan we help you with something else?");
                    break;
                case 3:
                    System.out.println("Which area would you like to see?");
                    buildingArea = sc.nextLine();
                    filteredList = rsAgency.getBuildingsByLocation(buildingArea);
                    for (Building b : filteredList){
                       System.out.println(b.toString());
                    }
                    System.out.println("\nCan we help you with something else?");
                    break;
                default:
                    System.out.println("Upsss I did not understand that");
                    break;
            }
        } while (option != 0);
        sc.close();
    }
}
