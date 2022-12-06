import java.util.ArrayList;

public class Writer {
    private String name;
    ArrayList<Book> books = new ArrayList<Book>();
    private String dateOfBirth;
    private String dateOfDeath;
    private boolean isAlive;
    private String nationality;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfDeath() {
        return this.dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void writeBook(int yearOfPublication, String title, int numberOfPages, String genre) {
        books.add(new Book(yearOfPublication, title, numberOfPages, genre));
    }

    public Writer(String name, ArrayList<Book> books, String dateOfBirth, String dateOfDeath, boolean isAlive, String nationality) {
        this.name = name;
        this.books = books;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.isAlive = isAlive;
        this.nationality = nationality;
    }

}