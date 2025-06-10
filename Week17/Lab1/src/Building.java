abstract class Building {
    private double surface;
    private double price;
    private String location;
    private String type;

    public Building(double surface, double price, String location, String type) {
        this.surface = surface;
        this.price = price;
        this.location = location;
        this.type = type;
    }

    protected double getSurface() {
        return this.surface;
    }

    protected void setSurface(double surface) {
        this.surface = surface;
    }

    protected double getPrice() {
        return this.price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected String getLocation() {
        return this.location;
    }

    protected void setLocation(String location) {
        this.location = location;
    }

    protected String getType() {
        return this.type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "This is a " + getType() + " of " + getSurface() +
         "m2 in " + getLocation() + ", which costs " + getPrice() + "E.";
    }

    public String toString(boolean onlyLocation) {
        if (onlyLocation){
            return getType() + " in " + getLocation();
        } else {
            return toString();
        }
    }

}
