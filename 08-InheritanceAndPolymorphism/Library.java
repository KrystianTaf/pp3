import java.util.ArrayList;

public class Library {
    
    ArrayList<Book> shelf = new ArrayList<Book>();

    public void addBook(Book book) {
        shelf.add(book);
    }

    public void removeBook(Book book) {
        shelf.remove(book);
    }

    public void display() {
        for () {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Jan Kowalski","ABC");
        Ebook ebook1 = new Ebook("Bog","Biblia","Biblia.pdf");
        Ebook ebook2 = new Ebook("xdddd","xddddddd","xdddd.pdf");
        Audiobook abook1 = new Audiobook("null", "null", 13, 54);
        Audiobook abook2 = new Audiobook("AAAAAAA", "aaaaaa", 78, 12);
    }
}
