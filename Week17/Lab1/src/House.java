public class House extends Building {
    private boolean attached;

    public House(double surface, double price, String location, boolean attached) {
        this.surface = surface;
        this.price = price;
        this.location = location;
        this.attached = attached;
        this.type = "house";
    }

    public boolean isAttached() {
        return this.attached;
    }

    public void setAttached(boolean attached) {
        this.attached = attached;
    }

    @Override
    public String toString() {
        String attachedString = isAttached() ? " It is attached." : " It is not attached.";
        return super.toString() + attachedString;
    }

}
