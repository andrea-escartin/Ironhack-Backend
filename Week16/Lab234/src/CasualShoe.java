public class CasualShoe extends Shoe{
    
    public CasualShoe(String brand, String model, String material, Integer size, double price) {
        super(brand, model, material, size, price);
    }    

    @Override
    public String toString() {
        return "Casual Shoe: " + super.toString();
    }

    
}
