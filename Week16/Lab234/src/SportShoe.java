public class SportShoe extends Shoe {
    public String sport;
    
    public SportShoe(String brand, String model, String material, Integer size, double price, String sport) {
        super(brand, model, material, size, price);
        this.sport = sport;
    }


    public String getSport() {
        return this.sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }


    @Override
    public String toString() {
        return "Sport Shoe (" + this.sport +"): " + super.toString();
    }
    

}
