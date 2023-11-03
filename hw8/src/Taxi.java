public class Taxi extends Automobile {
    private Person driver;
    private String id;
    public Taxi(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV, Person driver, String id) {
        super(owner, make, model, year, mileage, numPassengers, isSUV);

        this.driver = driver;
        this.id = id;
    }

    public Person getDriver() {
        return driver;
    }

    public String getId() {
        return id;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%s,\nDriver: %s ID#%s",super.toString(), getDriver().toString(), getId());
    }
}
