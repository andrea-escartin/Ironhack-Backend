public class Apartment extends Building {
    private final Integer floor;
    private boolean elevator;

    public Apartment(double surface, double price, String location, Integer floor, boolean elevator) {
        super(surface, price, location, "apartment");
        this.floor = floor;
        this.elevator = elevator;
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
