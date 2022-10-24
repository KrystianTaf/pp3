public class Books {

    String title;
    String author;
    String publishedYear;
    int numberOfPages;
    int readPages;
    boolean isReccomended;
    
    public void showBookInfo(){
        System.out.println("Book title: "+title);
        System.out.println("Book author: "+author);
        System.out.println("Year of publication: "+publishedYear);
        System.out.println("Total number if pages is "+numberOfPages);
    }
    
    public void readBook(){
        readPages += 10;
        if (readPages > numberOfPages){
            readPages=numberOfPages;
        }
        
    }
    
    public void chageReccomendation(){
        isReccomended = !isReccomended;
    }
    
    public void showPersonalBookInfo(){
        System.out.println("Number of pages read: "+readPages);
        System.out.println("Reccomended: "+isReccomended);
    }
    
    
    public static void main(String[] args){
    Books book1 = new Books();
    book1.title="ABCD";
    book1.author="Jan Kowalski";
    book1.publishedYear="1998";
    book1.numberOfPages=9;
    book1.showBookInfo();
    book1.showPersonalBookInfo();
    book1.readBook();
    book1.chageReccomendation();
    book1.showPersonalBookInfo();
    
    
    Books book2 = new Books();
    book2.title="XYZ";
    book2.author="Jakub Nowak";
    book2.publishedYear="1974";
    book2.numberOfPages=187;
    book2.showBookInfo();
    book2.showPersonalBookInfo();
    book2.readBook();
    book2.chageReccomendation();
    book2.showPersonalBookInfo();
    }
}