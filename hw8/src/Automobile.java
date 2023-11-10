public class Automobile extends Vehicle {
    private int numPassengers;
    private boolean isSUV;

    /**
     * Constructor for Automobile object
     * @param owner Person object of the owner of the Automobile
     * @param make Make of the Automobile
     * @param model Model of the Automobile
     * @param year Year that the Automobile was produced
     * @param mileage Mileage on the Automobile
     * @param numPassengers number of passengers that the Automobile can carry
     * @param isSUV T/F value if the Automobile is an SUV
     */
    public Automobile(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV) {
        super(owner, make, model, year, mileage);
        this.numPassengers = numPassengers;
        this.isSUV = isSUV;
    }

    /**
     * Method to get the number of passengers that the Automobile can carry
     * @return integer number of passengers that the Automobile can carry
     */
    public int getNumPassengers() {
        return numPassengers;
    }

    /**
     * Method to set the number of passengers that an Automobile can carry
     * @param numPassengers integer number of passengers
     */
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    /**
     * Method to set an Automobile as an SUV
     * @param SUV T/F value if the Automobile is an SUV
     */
    public void setSUV(boolean SUV) {
        isSUV = SUV;
    }

    /**
     * Method to get if an Automobile is an SUV
     * @return T/F value if Automobile is an SUV
     */
    public boolean isSUV() {
        return isSUV;
    }

    /**
     * Method to print Automobile objects
     * @return Automobile object formatted as a string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s\n%s %s %d %d miles %d passengers",this.getOwner(), this.getMake(),
                this.getModel(), this.getYear(), this.getMileage(), this.getNumPassengers()));
        if (isSUV){
            sb.append(" SUV");
        }
        return sb.toString();
    }

    /**
     * Method to check if two Automobiles are the same
     * @param obj Automobile that you would like to compare this Automobile to
     * @return true if the same false if different
     */
    @Override
    public boolean equals(Object obj) {
        Automobile other = (Automobile) obj;
        return super.equals(other) && this.numPassengers == other.getNumPassengers() && this.isSUV == other.isSUV();
    }
}