import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RealEstateAgency {
    private ArrayList<Building> listings = new ArrayList<Building>();
    private static final String[] LISTING_TYPES = {"house", "apartment", "storage room"};

    // Constructor
    public RealEstateAgency(ArrayList<Building> listings) {
        this.listings = listings;
    }

    // Constructor with empty listings
    public RealEstateAgency() {
    }

    // Getters/Setters
    public ArrayList<Building> getListings() {
        return this.listings;
    }

    public void setListings(ArrayList<Building> listings) {
        this.listings = listings;
    }

    // methods
    public ArrayList<Building> getBuildingByType(String type){
        ArrayList<Building> buildings = new ArrayList<>();
        
        if (!Arrays.asList(LISTING_TYPES).contains(type)){
            System.out.println("Building type not recognized. This real estate agency only handles: " + Arrays.toString(LISTING_TYPES));
            return buildings;
        }

        for (Building b : this.listings){
            if (type.equalsIgnoreCase("house") && b instanceof House) {
                buildings.add(b);
            } else if (type.equalsIgnoreCase("apartment") && b instanceof Apartment) {
                buildings.add(b);
            } else if (type.equalsIgnoreCase("storage room") && b instanceof StorageRoom) {
                buildings.add(b);
            }
        }

        if (buildings.size() == 0){
            System.out.printf("Ohh we don't have any %s currently\n", type);
        }

        return buildings;
    }

    public ArrayList<Building> getBuildingsByLocation(String location){
        ArrayList<Building> buildings = new ArrayList<>();
        for (Building b : this.listings){
            if (b.getLocation().equalsIgnoreCase(location)){
                buildings.add(b);
            }
        }

        if (buildings.size() == 0){
            System.out.printf("Ohh we don't have any building in %s\n", location);
        }
        return buildings;
    }

    public void addListing(Building building){
        this.listings.add(building);
    }

    // toString()
    @Override
    public String toString() {
        String finalString = "Our current listings are: ";
        for (Building b : this.listings){
            finalString += "\n" + b.toString();
        }
        return finalString;
    }
}
