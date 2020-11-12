package CAResit;

import java.util.Arrays;

public class Country {

    private String name;
    private String capital;
    private int population;
    private int area;
    private City[] cities;
    private String currency;
    private String language;

    public Country(String name, String capital, int population, int area, City[] cities, String currency, String language) {
        setName(name);
        setCapital(capital);
        setPopulation(population);
        setArea(area);
        setCities(cities);
        setCurrency(currency);
        setLanguage(language);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    //public City getMostPopulousCity(){


    //}

    public void sortCitiesByName(){

    }


    @Override
    public String toString() {
        return "Country{" +
                "name='" + getName() + '\'' +
                ", capital='" + getCapital() + '\'' +
                ", population=" + getPopulation() +
                ", area=" + getArea() +
                ", cities=" + Arrays.toString(getCities()) +
                ", currency='" + getCurrency() + '\'' +
                ", language='" + getLanguage() + '\'' +
                '}';
    }
}
