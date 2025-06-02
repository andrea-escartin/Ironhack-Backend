import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private ArrayList<Food> items = new ArrayList<Food>();
    
    public ShoppingCart() {
        
    }

    public ShoppingCart(ArrayList<Food> items) {
        this.items = items;
    }

    public ShoppingCart(Food item){
        this.items.add(item);
    }


    public ArrayList<Food> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Food> items) {
        this.items = items;
    }

    public void addItem(Scanner sc) {
        System.out.print("What's the name of the product?: ");
        String name = sc.nextLine();
        System.out.print("What's the product origin? ");
        String origin = sc.nextLine();
        double weight = MyUtils.readDouble(sc, "What's the weight of the product (kg)? ");
        double pricePerKg = MyUtils.readDouble(sc, "What's the product's price per kg? ");
        this.items.add(new Food(name, origin, weight, pricePerKg));
    }

    public double getProductPriceByName(String name){
        int pos = getItemPositionByName(name);
        return this.items.get(pos).calculatePrice();
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (Food item : this.items) {
            totalPrice += item.calculatePrice();
        }
        return totalPrice;
    }

    public int getItemPositionByName(String name){
        int pos = -1;
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().equalsIgnoreCase(name)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public void findItemByName(String name){
        int pos = getItemPositionByName(name);
        if (pos == -1) {
            System.out.printf("Food item with name %s not found\n", name);
        }
        else {
            System.out.printf("Food item found at position %d: %s\n", pos, this.items.get(pos).toString());
        }
    }

    public void updateProductPrice(String name, double price){
        int pos = getItemPositionByName(name);
        this.items.get(pos).setPricePerKg(price);
        System.out.printf("Price of %s updated to %f\n", this.items.get(pos).getName(), this.items.get(pos).getPricePerKg());
    }

    public void printItemsinCart(){
        if (this.items.isEmpty()) {
            System.out.println("Shopping cart is empty.");
        } else {
            System.out.println("Items in the shopping cart:");
            for (Food item : this.items) {
                System.out.println(item.getName());
            }
        }
    }

    public void removeItemByName(String name){
        int pos = getItemPositionByName(name);
        this.items.remove(pos);
    }

    @Override
    public String toString() {
        return "{" +
            " items='" + getItems() + "'" +
            "}";
    }

    

}
