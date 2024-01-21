public class Destinations {
    public Destinations(int ID, String name, String country, String type, int yearOpened, int visitorCount, double entryFee, double rating) {
        this.ID = ID;
        this.name = name;
        this.country = country;
        this.type = type;
        this.yearOpened = yearOpened;
        this.visitorCount = visitorCount;
        this.entryFee = entryFee;
        this.rating = rating;
    }

    private int ID;
    private String  name;
    private String country;
    private String type;
    private int yearOpened;
    private int visitorCount;
    private double entryFee;
    private double rating;

    @Override
    public String toString() {
        return "Destinations{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", yearOpened=" + yearOpened +
                ", visitorCount=" + visitorCount +
                ", entryFee=" + entryFee +
                ", rating=" + rating +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOpened() {
        return yearOpened;
    }

    public void setYearOpened(int yearOpened) {
        this.yearOpened = yearOpened;
    }

    public int getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(int visitorCount) {
        this.visitorCount = visitorCount;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void add(Destinations destinations1) {
    }
}
