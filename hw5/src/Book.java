/*
Luke Holmes
CS2100
10/3/2023

Program that defines a book object with getter, setter, toString, and equals methods.
 */

public class Book {
    private String isbn;
    private String title;
    private String publisher;
    private Author author;
    private int numPages;

    /**
     * Constructor for book object
     * @param isbn isbn as a string
     * @param title title as a string
     * @param author author object
     * @param publisher publisher as a string
     * @param numPages number of pages
     */
    public Book(String isbn, String title, Author author, String publisher, int numPages){
        this.isbn = isbn;
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.numPages = numPages;
    }

    /**
     * Copy constructor for book
     * @param other book object to be copied
     */
    public Book(Book other){
        this.isbn = other.getIsbn();
        this.title = other.getTitle();
        this.publisher = other.getPublisher();
        this.author = other.getAuthor();
        this.numPages = other.getNumPages();
    }

    /**
     * gets isbn
     * @return isbn as a string
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * gets title
     * @return title as a string
     */
    public String getTitle() {
        return title;
    }

    /**
     * gets publisher
     * @return publisher as a string
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * gets author object
     * @return author object
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * gets number of pages
     * @return number of pages as an int
     */
    public int getNumPages() {
        return numPages;
    }

    /**
     * sets author object
     * @param author author object
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * sets ISBN
     * @param isbn ISBN as a string
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * sets number of pages
     * @param numPages number of pages as an int
     */
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    /**
     * sets publisher
     * @param publisher publisher as a string
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * sets title
     * @param title title as a string
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Method to see if two books are the same
     * @param o book object comparing to
     * @return true if title, author and isbn are the same. false if not.
     */
    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return (this.title.equals(book.getTitle()) && this.author.equals(book.getAuthor()) && this.isbn.equals(book.getIsbn()));
    }

    /**
     * returns book object as a string
     * @return String formatted ("Title, Author < email > (ISBN-10 #__________, ___ pages)
     */
    @Override
    public String toString() {
        return String.format("%s, %s %s <%s> (ISBN-10 #%s, %d pages)",this.getTitle(), this.getAuthor().getFirst(),
                this.getAuthor().getLast(), this.getAuthor().getEmail(), this.getIsbn(), this.getNumPages());
    }
}
