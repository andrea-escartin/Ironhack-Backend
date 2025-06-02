public class SheldonNumber {
    private int number;

    public SheldonNumber(int number) {
        this.number = number;
    }

    public boolean isFavorite() {
        return (number % 2 == 0 &&
               number > 37 &&
               number < 173 &&
               number % 10 != 0) ||
               number == 73;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }


    @Override
    public String toString() {
        String isFav = isFavorite() ? "is a Sheldon's favorite!" : "is NOT a Sheldon's favorite :(";
        return "{" +
            " number='" + getNumber() + "'" +
            isFav +
            "}";
    }

}
