public class Book {

    private String author;
    private String title;
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void display() {
        System.out.println("Author: "+author+", "+"Title: "+title);
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("Jan Kowalski","ABC");
        Book book2 = new Book("Jakub Nowak","Matematyka 2020");
        book1.display();
        book2.display();
    }
}