public class Chapter {
    private String titleChapter;
    private int chapterNumber;
    private int numberOfPages;
    private int startingPageNumber;


    public String getTitleChapter() {
        return this.titleChapter;
    }

    public void setTitleChapter(String titleChapter) {
        this.titleChapter = titleChapter;
    }

    public int getChapterNumber() {
        return this.chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getStartingPageNumber() {
        return this.startingPageNumber;
    }

    public void setStartingPageNumber(int startingPageNumber) {
        this.startingPageNumber = startingPageNumber;
    }

    public Chapter(String titleChapter, int chapterNumber, int numberOfPages, int startingPageNumber) {
        this.titleChapter = titleChapter;
        this.chapterNumber = chapterNumber;
        this.numberOfPages = numberOfPages;
        this.startingPageNumber = startingPageNumber;
    }
    
}