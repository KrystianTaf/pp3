public class Audiobook extends Book{
    
    private int minutes;
    private int seconds;

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public Audiobook(String author, String title, int minutes, int seconds) {
        super(author, title);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void display() {
        System.out.println("Author: "+getAuthor()+", Title: "+getTitle()+", Time: "+minutes+":"+seconds);
    }

    public static void main(String[] args) {
        Book book4 = new Book("244224","241419");
        Audiobook abook1 = new Audiobook("null", "null", 13, 54);
        Audiobook abook2 = new Audiobook("AAAAAAA", "aaaaaa", 78, 12);
        book4.display();
        abook1.display();
        abook2.display();
    }
    
}
