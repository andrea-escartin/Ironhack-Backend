public class VinylRecord {
    private String artist;
    private String title;
    private int year;
    private double duration;

    // Constructor
    public VinylRecord(String artist, String title, int year, double duration) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.duration = duration;
    }

    // Getters and Setters
    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDuration() {
        return this.duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    // Methods

    // to String
    @Override
    public String toString() {
        return "{" +
            " artist='" + getArtist() + "'" +
            ", title='" + getTitle() + "'" +
            ", year='" + getYear() + "'" +
            ", duration='" + getDuration() + "'" +
            "}";
    }


        
}
