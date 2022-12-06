public class Book {
    private int yearOfPublication;
    private String title;
    private int numberOfPages;
    private String genre;
    private int readPages;


    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReadPages() {
        return this.readPages;
    }
    
    public void read(int pages) {
        this.readPages += pages;
    }


    public Book(int yearOfPublication, String title, int numberOfPages, String genre) {
        this.yearOfPublication = yearOfPublication;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
    
    

}