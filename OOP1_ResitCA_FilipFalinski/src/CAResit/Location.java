package CAResit;

public class Location {

    private double latidude;
    private double longtidue;

    public Location(double latidude, double longtidue) {
        this.latidude = latidude;
        this.longtidue = longtidue;
    }

    public double getLatidude() {
        return latidude;
    }

    public void setLatidude(double latidude) {
        this.latidude = latidude;
    }

    public double getLongtidue() {
        return longtidue;
    }

    public void setLongtidue(double longtidue) {
        this.longtidue = longtidue;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latidude=" + getLatidude() +
                ", longtidue=" + getLongtidue() +
                '}';
    }
}
