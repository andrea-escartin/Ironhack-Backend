public class House extends Building {
    private boolean attached;

    public House(double surface, double price, String location, boolean attached) {
        super(surface, price, location, "house");
        this.attached = attached;
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
