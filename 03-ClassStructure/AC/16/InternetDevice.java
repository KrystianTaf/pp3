public class InternetDevice{

    String name;
    boolean connected = false;
    static int connectedDevices;
    
    public InternetDevice(String n){
        name = n;
    }
    
    public void connect(){
    connected = true;
    connectedDevices++;
    }
    
    public void disconnect(){
    connected = false;
    connectedDevices--;
    }
    
    public boolean isConnected(){
    return connected;
    }
    
    public void displayStatus(){
    System.out.println("Device name: "+name);
    System.out.println("Internet connection: "+connected);
    }
    
    public static void displayConnections(){
        System.out.println("Connected devices: "+connectedDevices);
    }
    
    public static void main(String[] args)
    {
        InternetDevice d1 = new InternetDevice("Phone1");
        d1.connect();
        d1.displayStatus();
        d1.displayConnections();
        
        InternetDevice d2 = new InternetDevice("Phone2");
        d2.displayStatus();
        d2.displayConnections();
        
        InternetDevice d3 = new InternetDevice("Desktop");
        d3.connect();
        d3.displayStatus();
        d3.displayConnections();
        
        InternetDevice d4= new InternetDevice("TV");
        d4.connect();
        d4.displayStatus();
        d4.displayConnections();
        
        InternetDevice d5 = new InternetDevice("Laptop");
        d5.displayStatus();
        d5.displayConnections();  
    }
}