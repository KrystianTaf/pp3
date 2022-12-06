public class Book{

    private String title;
    private String author;
    private String publishDate;
    private int page;
    private boolean isOpen;
    private String type;


    public Book(String title, String author, String publishDate, int pages, boolean isOpen) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.pages = pages;
        this.isOpen = isOpen;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public boolean getIsOpen() {
        return this.isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void read(){
        isOpen = true;
    }

    public void close(){
        isOpen = false;
    }

    public void nextPage(){
        page +=;
    }

    public void previousPage(){
        page -=;
    }
}