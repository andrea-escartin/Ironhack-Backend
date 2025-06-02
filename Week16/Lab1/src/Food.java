public class Food {
    private String name;
    private String origin;
    private double weight;
    private double pricePerKg;

    public Food(String name, String origin, double weight, double pricePerKg) {
        this.name = name;
        this.origin = origin;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePerKg() {
        return this.pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double calculatePrice(){
        return this.weight * this.pricePerKg;
    }
    

}
