public class CinemaTicket{
    
    static String cinemaName = "Kino Kraków";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    public void displayTicket(){
        System.out.println("Cinema name: "+cinemaName);
        System.out.println("Film title: "+filmTitle);
        System.out.println("Row: "+row+" Seat: " +seat);
        System.out.println("Price: "+price+"zł");
    }
    
    public CinemaTicket(String t,int r, int s){
        filmTitle=t;
        row=r;
        seat=s;
        if(row < 3){
            price = 10;
        }
        else {
            price = 25;
        }
        
    }
    
    public static void main(String[] args) {
	CinemaTicket ticket1=new CinemaTicket("Gladiator",2,5);
	
	CinemaTicket ticket2=new CinemaTicket("Gladiator",7,8);
	
	ticket1.displayTicket();
	ticket2.displayTicket();
    }

}