public class Smartphone {
    
    String model;
    int batteryLvl;
    int memory;
    String phoneNumber;
    boolean isCharge;
    
    public void info(){
        System.out.println("Smartphone model is " + model);
        System.out.println("Battery level is " + batteryLvl);
        System.out.println("Available memory is " + memory + "GB");
    }
    
    public void charge() {
        isCharge = !isCharge;
        System.out.println("Is charging: " + isCharge);
        if (isCharge = false) {
            batteryLvl = batteryLvl + 15;
            if (batteryLvl > 100){
                batteryLvl = 100;
            }
                
        }
    }
    
    public void showNumber(){
        System.out.println("Your phone number is " + phoneNumber);
    }
}