abstract class Building {
    protected double surface;
    protected double price;
    protected String location;
    protected String type;


    public double getSurface() {
        return this.surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
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
