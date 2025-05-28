public class Computer {
    private String brand;
    private String model;
    private int ramGB;
    private int storageGB;
    private double price;
    private boolean available;

    // Constructor
    public Computer(String brand, String model, int ramGB, int storageGB, double price, boolean available) {
        this.brand = brand;
        this.model = model;
        this.ramGB = ramGB;
        this.storageGB = storageGB;
        this.price = price;
        this.available = available;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRamGB() {
        return ramGB;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // toString
    @Override
    public String toString() {
        String availabilityText = available ? "Available" : "Not available";
        // Same as bellow
        // String availabilityText;
        // if (available) {
        //     availabilityText = "Available";
        // } else {
        //     availabilityText = "Not available";
        // }
        return "Computer [" + brand + " " + model + "] - RAM: " + ramGB + "GB, Storage: " + storageGB +
                "GB, Price: $" + price + ", " + availabilityText;
    }

    // Discount method
    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            this.price -= this.price * (discountPercent / 100);
        }
    }
}
