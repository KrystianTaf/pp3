public class Room{

    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int number){
        this.number = number;
        beds = 2;
    }
    
    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    
    public void checkin(String guestName){
        this.guestName = guestName;
        occupied = true;
    }
    
    public void checkout(){
        guestName = null;
        occupied = false;
    }
    
    public void isOccupied(){
        System.out.println("Room is occupied: "+occupied);
    }
    /*
    public void displayStatus(){
        System.out.println("Room: "+number);
        System.out.println("Beds: "+beds);
        System.out.println( "Is occupied: "+occupied);
        System.out.println("Guest name: "+guestName);
    }
    */
    public static void listOfRooms(Room[] rooms){
        for(int i = 0; i < rooms.length; i++){
            rooms[i].toString();
            /*System.out.println("---------------------");*/
        }
    }
    
    public static void limitedListOfRooms(Room[] rooms, int beds){
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].beds == beds){
                System.out.println(rooms[i].toString());
            }
        }
    }
    
    public static void vacantVsOccupied(Room[] rooms){
        int vac = 0;
        int occ = 0;
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].occupied == true){
                occ++;
            }
            else{
                vac++;
            }
        }
        System.out.println("Number of vacant rooms: "+vac);
        System.out.println("Number of occupied rooms: "+occ);
    }
    
    public static void vacantBeds(Room[] rooms){
        int vacBeds = 0;
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].occupied == false){
                vacBeds = vacBeds + rooms[i].beds;
            }
        }
        System.out.println("Number of vacant beds: "+vacBeds);
    }
    
    public String toString(){
        return 
            "Room: " + number + ", Beds : " + beds + ", is Occupied: " + occupied + ", Guest name: " + guestName;
    }
    
    public static void main(String[] args){
        Room[] rooms = new Room[6];

        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[2] = new Room(3);
        rooms[3] = new Room(4,3);
        rooms[4] = new Room(5,3);
        rooms[5] = new Room(6,1);
        
        System.out.println(rooms[0].toString());
        
        listOfRooms(rooms);
        
        limitedListOfRooms(rooms, 3);
        
        vacantVsOccupied(rooms);
        
        vacantBeds(rooms);
    }
}