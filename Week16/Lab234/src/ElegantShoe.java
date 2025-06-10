public class ElegantShoe extends Shoe{
    private boolean hasBuckle;
    public ElegantShoe(String brand, String model, String material, Integer size, double price, boolean hasBuckle) {
        super(brand, model, material, size, price);
        this.hasBuckle = hasBuckle;
    }    

    public boolean getHasBuckle() {
        return this.hasBuckle;
    }

    public void isHasBuckle(boolean hasBuckle) {
        this.hasBuckle = hasBuckle;
    }
    

    @Override
    public String toString() {
        String buckle = hasBuckle ? "(with buckle)" : "(without buckle)";
        return "Elegant Shoe " + buckle + ": " + super.toString();
    }
}
