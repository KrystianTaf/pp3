public class Clock {
    String hour;
    String minute;
    int alarmHour;
    int alarmMinute;
    
    Clock(){
        hour = "00";
        minute = "00";
    }
    
    Clock(int hour, int minute){
        this.hour = String.valueOf(hour);
        this.minute = String.valueOf(minute);
    }
    
    public void setClock(int hour, int minute){
        this.hour = String.valueOf(hour);
        this.minute = String.valueOf(minute);
    }
    
    public void setClock(){
        hour = "00";
        minute = "00";
    }
    
    public void displayTime(){
        if (hour.length() == 1){
            hour = "0"+hour;
        }
        if (minute.length() == 1){
            minute = "0"+minute;
        }
        System.out.println("Current time is: "+hour+":"+minute);
    }
    
    public void addOneMinute(){
        int x = Integer.parseInt(minute);
        x++;
        if (x == 60){
            x = 0;
            int y = Integer.parseInt(hour);
            y++;
            hour = String.valueOf(y);
        }
        minute = String.valueOf(x);
        
        if (alarmHour == Integer.parseInt(hour) & alarmMinute == Integer.parseInt(minute)){
            runAlarm();
        }
    }
    
    public void setAlarm(int alarmHour, int alarmMinute){
          this.alarmHour = alarmHour;
          this.alarmMinute = alarmMinute;
    }
    
    public void runAlarm(){
        System.out.println("beep-beep-beep-beep!!!");
    }
    
    public static void main(String[] args){
        Clock c1 = new Clock(12,47);
        c1.displayTime();
        c1.setClock(18,14);
        c1.displayTime();
    }
    
}