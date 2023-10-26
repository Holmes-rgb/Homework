public class Automobile extends Vehicle {
    private int numPassengers;
    private boolean isSUV;


    public Automobile(Person owner, String make,
                      String model, int year, int mileage, int numPassengers, boolean isSUV) {
        super(owner, make, model, year, mileage);
        this.numPassengers = numPassengers;
        this.isSUV = isSUV;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void setSUV(boolean SUV) {
        isSUV = SUV;
    }

    public boolean isSUV() {
        return isSUV;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s, %s, %s\n%s %s %d %d miles %d passengers",this.getOwner(), this.getMake(),
                this.getModel(), this.getYear(), this.getMileage(), this.getNumPassengers()));
        if (isSUV){
            sb.append(" SUV");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Automobile other = (Automobile) obj;
        return super.equals(other) && this.numPassengers == other.getNumPassengers() && this.isSUV == other.isSUV();
    }
}