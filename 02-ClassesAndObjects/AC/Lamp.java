public class Lamp{

    boolean isOn;
    
    public void turnOn(){
        isOn = true;
    }
    
    public void turnOff(){
        isOn = false;
    }
    
    public void displayStatus(){
        System.out.println("Lamp is on: "+isOn);
    }
    
    public static void main(String[] args){
        Lamp lamp1 = new Lamp();
        lamp1.turnOn();
        lamp1.displayStatus();
        
        Lamp lamp2 = new Lamp();
        lamp2.turnOff();
        lamp2.displayStatus();
    }
}
