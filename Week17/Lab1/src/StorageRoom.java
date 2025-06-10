public class StorageRoom extends Building {
    private boolean security;

    public StorageRoom(double surface, double price, String location, boolean security) {
        this.surface = surface;
        this.price = price;
        this.location = location;
        this.security = security;
        this.type = "storage room";
    }

    public boolean isSecurity() {
        return this.security;
    }

    public boolean getSecurity() {
        return this.security;
    }

    public void setSecurity(boolean security) {
        this.security = security;
    }

    @Override
    public String toString() {
        String secString = isSecurity() ? " With security" : " Without security";
        return super.toString() + secString;
    }
    
}
