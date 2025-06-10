import java.util.ArrayList;

public class Shoe {
    protected String brand;
    protected String model;
    protected String material;
    protected Integer size;
    // public ArrayList<Integer> sizes;
    protected double price;

    public Shoe(String brand, String model, String material, Integer size, double price) {
    // public Shoe(String brand, String model, String material, ArrayList<Integer> sizes, double price) {
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.size = size;
        this.price = price;
    }

    // getters and setters
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // public ArrayList<Integer> getSizes() {
    //     return this.sizes;
    // }

    // public void setSizes(ArrayList<Integer> sizes) {
    //     this.sizes = sizes;
    // }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    @Override
    public String toString() {
        return "{" +
            " brand='" + getBrand() + "'" +
            ", model='" + getModel() + "'" +
            ", material='" + getMaterial() + "'" +
            ", sizes='" + getSize() + "'" +
            // ", sizes='" + getSizes() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

}
