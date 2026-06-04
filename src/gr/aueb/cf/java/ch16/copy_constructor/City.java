package gr.aueb.cf.java.ch16.copy_constructor;

public class City {
    private String description;

    public City() {}

    public City(String description) {
        this.description = description;
    }

    // Copy Constructor
    public City(City city) {
        this.description = city.description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
