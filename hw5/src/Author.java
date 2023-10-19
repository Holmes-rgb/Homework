/*
Luke Holmes
CS2100
10/3/2023

Program that defines an Author object with getter, setter, toString, and equals methods.
 */



public class Author {
    private String first;
    private String last;
    private String email;

    /**
     * Constructor for Author object
     * @param first First name as a string
     * @param last last name as a string
     * @param email email as a string
     */
    public Author(String first, String last, String email){
        this.first = first;
        this.last = last;
        this.email = email;
    }

    /**
     * Coppy constructor for Author object
     * @param other Author object that is coppied
     */
    public Author(Author other){
        this.first = other.getFirst();
        this.last = other.getLast();
        this.email = other.getEmail();
    }

    /**
     * gets email
     * @return email as a string
     */
    public String getEmail() {
        return email;
    }

    /**
     * gets first name
     * @return first name as a string
     */
    public String getFirst() {
        return first;
    }

    /**
     * gets last name
     * @return last name as a string
     */
    public String getLast() {
        return last;
    }

    /**
     * set the first name
     * @param first first name as a string
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * set email
     * @param email email as a string
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * sets last name
     * @param last last name as a string
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * Method for seeing if two authors are the same
     * @param o Author object to compare to
     * @return true if the same false if different
     */
    @Override
    public boolean equals(Object o) {
        Author author = (Author) o;
        return (this.first.equals(author.getFirst()) && this.last.equals(author.getLast()));
    }

    /**
     * Return author data as a string
     * @return First name last name and email
     */
    @Override
    public String toString() {
        return String.format("%s %s <%s>", this.getFirst(), this.getLast(), this.getEmail());
    }
}