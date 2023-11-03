public class Vehicle {
    private Person owner;
    private String make;
    private String model;
    private int year;
    private int mileage;

    /**
     * Constructor for Vehicle including mileage
     * @param owner Person object of the owner
     * @param make Make of the Vehicle
     * @param model Model of the Vehicle
     * @param year Year of the Vehicle
     * @param mileage Mileage on the Vehicle
     */
    public Vehicle( Person owner, String make, String model, int year, int mileage){
        this.owner = owner;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    /**
     * Constructor for Vehicle without mileage
     * @param owner Person object of the owner
     * @param make Make of the Vehicle
     * @param model Model of the Vehicle
     * @param year Year of the Vehicle
     */
    public Vehicle( Person owner, String make, String model, int year){
        this.owner = owner;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /**
     * Method to get owner of vehicle
     * @return owner as a person object
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Method to set the owner of the Vehicle
     * @param owner Owner as a person object
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * Method to set the make of the vehicle
     * @param make make that you would like to set the vehicle to
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Method to get the make of a vehicle
     * @return make of the vehicle
     */
    public String getMake() {
        return make;
    }

    /**
     * Method to set the model of the vehicle
     * @param model Model that you would like to set the vehicle to
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Method to get the model of a vehicle
     * @return Model of the vehicle
     */
    public String getModel() {
        return model;
    }

    /**
     * Method to set the manufacture year of the vehicle
     * @param year year that you would like to set the manufacture year to
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Method to get the manufacture year of a Vehicle
     * @return Manufacture year of the vehicle
     */
    public int getYear() {
        return year;
    }

    /**
     * Method to set the mileage of a vehicle
     * @param mileage milage that you would like to set the car to
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Method to get the mileage on a vehicle
     * @return mileage on a vehicle
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Method for formatting vehicle objects as a string
     * @return vehicle object as a string
     */
    @Override
    public String toString() {
        String sb = "";
        sb += (String.format("%s %s %s %d",this.getOwner().toString(), this.getMake(), this.getModel(), this.getYear()));
        if(this.getMileage() > 0){
            sb += (String.format(" %d miles",this.getMileage()));
        }
        return sb;
    }

    /**
     * Method for checking if two vehicles are the same
     * @param obj vehicle that you would like to compare this vehicle to
     * @return true if the vehicles are the same false if different
     */
    @Override
    public boolean equals(Object obj) {
        Vehicle other = (Vehicle) obj;
        return ( this.owner.equals(other.owner)&& this.make.equals(other.getMake()) && this.model.equals(other.getModel())
                && this.year == other.getYear() && this.mileage == other.getMileage());
    }
}
