public class Appartment extends Building {
    private final Integer floor;
    private boolean elevator;

    public Appartment(double surface, double price, String location, Integer floor, boolean elevator) {
        this.surface = surface;
        this.price = price;
        this.location = location;
        this.floor = floor;
        this.elevator = elevator;
        this.type = "appartment";
    }


    public Integer getFloor() {
        return this.floor;
    }

    public boolean isElevator() {
        return this.elevator;
    }

    public void setElevator(boolean elevator) {
        this.elevator = elevator;
    }


    @Override
    public String toString() {
        String elevatorString = isElevator() ? " with elevator" : " without elevator";
        return super.toString() + " It is on the " + getFloor() + " floor" + elevatorString; 
    }



}
