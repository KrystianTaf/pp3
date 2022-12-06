public class Ebook extends Book {
    
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Ebook(String author, String title, String fileName) {
        super(author, title);
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Author: "+getAuthor()+", Title: "+getTitle()+", File name: "+fileName);
    }

    public static void main(String[] args) {
        Book book3 = new Book("Pitagoras","Trojkaty");
        Ebook ebook1 = new Ebook("Bog","Biblia","Biblia.pdf");
        Ebook ebook2 = new Ebook("xdddd","xddddddd","xdddd.pdf");
        book3.display();
        ebook1.display();
        ebook2.display();
    }
}
