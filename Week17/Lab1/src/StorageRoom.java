public class StorageRoom extends Building {
    private boolean security;

    public StorageRoom(double surface, double price, String location, boolean security) {
        super(surface, price, location, "storage room");
        this.security = security;
    }

    public boolean isSecurity() {
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
