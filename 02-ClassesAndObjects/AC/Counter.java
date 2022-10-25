public class Counter{

    int count = 0;
    
    public void inc1(){
        count += 1;
    }
    
    public void inc10(){
        count += 10;
    }
    
    public void dec1(){
        count -= 1;
    }
    
    public void dec10(){
        count -= 10;
    }
    
    public void resetCounter(){
        count = 0;
    }
    
    public void showCount(){
        System.out.println("Current count is "+count);
    }
    
    
    public static void main(String[] args){
        Counter counter1 = new Counter();
        counter1.inc10();
        counter1.inc10();
        counter1.inc1();
        counter1.inc1();
        counter1.inc1();
        counter1.showCount();
        
        Counter counter2 = new Counter();
        counter2.dec10();
        counter2.dec10();
        counter2.dec10();
        counter2.dec10();
        counter2.dec10();
        counter2.inc1();
        counter2.inc1();
        counter2.inc1();
        counter2.showCount();
    }
}