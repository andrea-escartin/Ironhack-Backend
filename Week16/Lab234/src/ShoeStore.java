import java.util.ArrayList;
import java.util.Iterator;

public class ShoeStore {
    private ArrayList<Shoe> allShoes = new ArrayList<Shoe>();
    private double totalPrice = 0;

    public ShoeStore(ArrayList<Shoe> shoes) {
        this.allShoes=shoes;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    } 


    public ArrayList<Shoe> getAllShoes() {
        return this.allShoes;
    }

    public void setAllShoes(ArrayList<Shoe> allShoes) {
        this.allShoes = allShoes;
    }

    // Get all casual shoes
    public ArrayList<CasualShoe> getCasualShoes() {
        ArrayList<CasualShoe> casualShoes = new ArrayList<>();
        
        for (Shoe shoe : allShoes) {  // Enhanced for loop you probably know
            if (shoe instanceof CasualShoe) {
                casualShoes.add((CasualShoe) shoe);
            }
        }
        return casualShoes;
    }

    // Get all elegant shoes  
    public ArrayList<ElegantShoe> getElegantShoes() {
        ArrayList<ElegantShoe> elegantShoes = new ArrayList<>();
        
        for (Shoe shoe : allShoes) {
            if (shoe instanceof ElegantShoe) {
                elegantShoes.add((ElegantShoe) shoe);
            }
        }
        return elegantShoes;
    }

    // Get all sport shoes  
    public ArrayList<SportShoe> getSportShoes() {
        ArrayList<SportShoe> sportShoes = new ArrayList<>();
        
        for (Shoe shoe : allShoes) {
            if (shoe instanceof SportShoe) {
                sportShoes.add((SportShoe) shoe);
            }
        }
        return sportShoes;
    }

    public void addItem(Shoe shoe) {
        allShoes.add(shoe);  // That's it! No instanceof checks needed
    }
    
    public void addItems(ArrayList<Shoe> shoes) {
        allShoes.addAll(shoes);  // Built-in method to add all at once
    }

    public void addToBasket(Shoe shoe){
        this.totalPrice += shoe.getPrice();
    }
    


    @Override
    public String toString() {
        return "{" +
            " allShoes='" + getAllShoes() + "'" +
            ", totalPrice='" + getTotalPrice() + "'" +
            "}";
    }
    

    
    
}
