public class Bike {
    private String brand;
    private String model;
    private int maxSpeed;
    private boolean hasGears;

    // Constructor
    public Bike(String brand, String model, int maxSpeed, boolean hasGears) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.hasGears = hasGears;
    }

    // Getters and Setters
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

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isHasGears() {
        return this.hasGears;
    }

    public boolean getHasGears() {
        return this.hasGears;
    }

    public void setHasGears(boolean hasGears) {
        this.hasGears = hasGears;
    }

    // Methods
     public void ringBell() {
        System.out.println(brand + " " + model + ": Ring ring!");
    }

    public void pedal() {
        System.out.println(brand + " " + model + ": Pedaling...");
    }

    public void stop() {
        System.out.println(brand + " " + model + ": Stopped.");
    }

    public void turn(String direction) {
        System.out.println(brand + " " + model + ": Turning " + direction + ".");
    }

    public void changeGears() {
        if (hasGears) {
            System.out.println(brand + " " + model + ": Gears changed.");
        } else {
            System.out.println(brand + " " + model + ": No gears available.");
        }
    }
    
    // toString
    @Override
    public String toString() {
        String gearText = hasGears ? "includes gears" : "does not include gears";
        return brand + " " + model + " - Max speed: " + maxSpeed + " km/h, " + gearText;
    }


}
