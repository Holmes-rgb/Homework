/*
Luke Holmes
11/2/23
Taxi Object
 */

public class Taxi extends Automobile {
    private Person driver;
    private String id;

    /**
     * Constructor for Taxi object
     * @param owner Person object of person who owns the taxi
     * @param make Make of the taxi
     * @param model Model of the taxi
     * @param year Year the taxi was produced
     * @param mileage Mileage on the taxi
     * @param numPassengers Number of passengers that the taxi can carry
     * @param isSUV True/false value if the taxi is an SUV
     * @param driver Person object of the driver of th etaxi
     * @param id ID of the taxi
     */
    public Taxi(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV, Person driver, String id) {
        super(owner, make, model, year, mileage, numPassengers, isSUV);

        this.driver = driver;
        this.id = id;
    }

    /**
     * Method to get the driver object of the driver of the taxi
     * @return person object for the driver of the taxi
     */
    public Person getDriver() {
        return driver;
    }

    /**
     * Method to get the ID of the taxi
     * @return ID of the taxi as a string
     */
    public String getId() {
        return id;
    }

    /**
     * Method to set the driver of the taxi
     * @param driver person object of the new driver of the taxi
     */
    public void setDriver(Person driver) {
        this.driver = driver;
    }

    /**
     * Method to set the ID of the taxi
     * @param id ID of the taxi as a string
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Method to print a taxi object
     * @return taxi object as a string
     */
    @Override
    public String toString() {
        return String.format("%s,\nDriver: %s ID#%s",super.toString(), getDriver().toString(), getId());
    }
}
