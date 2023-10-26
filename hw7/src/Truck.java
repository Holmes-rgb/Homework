public class Truck extends Vehicle{
    public final static int DEF_CAPACITY = 1;
    public final static int DEF_AXLES = 2;
    private int capacity;
    private int numAxles;

    /**
     * Constructor for truck with specified number of axles and capacity
     * @param owner Person object of the owner
     * @param make Make of the truck
     * @param model Model of the truck
     * @param year Year of the truck
     * @param mileage Mileage on the truck
     * @param capacity Capacity of the truck
     * @param numAxles Number of axles on the truck
     */
    public Truck( Person owner, String make, String model, int year, int mileage, int capacity, int numAxles){
        super(owner,make,model,year,mileage);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    /**
     * Constructor for truck with specified number of axles and capacity
     * @param name name of owner
     * @param address address of owner
     * @param phoneNumber phone number of owner
     * @param make Make of the truck
     * @param model Model of the truck
     * @param year Year of the truck
     * @param mileage Mileage on the truck
     */
    public Truck( String name, String address, String phoneNumber, String make, String model, int year, int mileage){
        super(new Person(name, address, phoneNumber),make,model,year,mileage);
        this.capacity = DEF_CAPACITY;
        this.numAxles = DEF_AXLES;
    }

    /**
     * Method to get the capacity of the truck (tons)
     * @return capacity of truck (tons)
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method to get the number of axles on the truck
     * @return number of axles on the truck
     */
    public int getNumAxles() {
        return numAxles;
    }

    /**
     * Method to set the capacity of a truck
     * @param capacity capacity that truck should be set to
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Method to set the number of axles on a truck
     * @param numAxles number of axles that the truck should be set to
     */
    public void setNumAxles(int numAxles) {
        this.numAxles = numAxles;
    }

    /**
     * Method for formatting truck objects as strings
     * @return truck object as a string
     */
    @Override
    public String toString() {
        return String.format("%s %d ton %d axles",super.toString(), capacity, numAxles);
    }

    /**
     * Method to check if two trucks are the same
     * @param obj truck that you would like to compare this truck to
     * @return true if the trucks are the same false if different
     */
    @Override
    public boolean equals(Object obj) {
        Truck other = (Truck) obj;
        return super.equals(other) && this.capacity == other.getCapacity() && this.numAxles == other.getNumAxles();
    }
}
