/*
Luke Holmes
11/2/23
Person Object
 */
public class Person {
    public String name;
    public String address;
    public String phone;

    /**
     * Constructor for person object
     * @param name name of person
     * @param address address of person
     * @param phone phone number of person
     */
    public Person(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Method to get the name of the person
     * @return name of peron
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get the address of the person
     * @return Address of person
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method to get the phone number of a person
     * @return phone number of person
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Method to set name of person
     * @param name name that you would like to give the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to set the address for person
     * @param address address that you would like to give person
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method to set phone number of person
     * @param phone Phone number that you would like to give to person
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Method for printing person as a string
     * @return Person as a formatted string
     */
    @Override
    public String toString() {
        return String.format("%s, %s, %s", name, address, phone);
    }

    /**
     * Method for checking if two people are the same
     * @param obj Person that you would like to compare to this person
     * @return true if the same false if different
     */
    @Override
    public boolean equals(Object obj) {
        Person other = (Person) obj;
        return this.name.equals(other.getName()) && this.address.equals(other.getAddress()) && this.phone.equals(other.getPhone());
    }
}
