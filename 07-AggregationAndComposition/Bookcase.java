import java.util.ArrayList;

public class Bookcase {

    private int numberOfBooks;
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        for (Book book : this.books) {
            System.out.println(book.getTitle());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

    public Bookcase() {

    }

    public static void main(String[] args) {
        Bookcase bc1 = new Bookcase();
        Book book1 = new Book(1998,"Encyklopedia",2137,"Informacyjna");
        Book book2 = new Book(2021,"Podrecznik do matematyki",67,"Edukacyjna");

        bc1.addBook(book1);
        bc1.addBook(book2);
        bc1.displayBooks();
        bc1.removeBook(book1);
        bc1.displayBooks();
    }
}