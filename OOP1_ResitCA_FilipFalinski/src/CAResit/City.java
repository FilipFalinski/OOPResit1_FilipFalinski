package CAResit;


public class City {

    private String name;
    private int population;
    private Location location;

    public City(String name, int population, Location location) {
        setName(name);
        setPopulation(population);
        setLocation(location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    //public getDistanceBetween() {

        //int distance;

        //distance = 110.25();



//}

    @Override
    public String toString() {
        return "City{" +
                "name='" + getName() + '\'' +
                ", population=" + getPopulation() +
                ", location=" + getLocation() +
                '}';
    }
}
