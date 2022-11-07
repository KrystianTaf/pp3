public class BasicStatistics{
    
    int number;
    int x;
    int y;
    int sum;
    double mean;
    
    public void displayBasicStatistics(){
    System.out.println("Range from "+x+" to "+y);
    System.out.println("Number of items within range: "+number);
    System.out.println("Sum of numbers in range: "+sum);
    System.out.println("Arithmetic mean of the numbers in range: "+mean);
    }
    
    public BasicStatistics(int a, int b){
        x = a;
        y = b;
        number = y - x + 1;
        for (int i = x; i <= y; i++){
            sum = sum + i;
        }
        double s = sum;
        double n = number;
        mean = s / n;
        }
    
    public static void main(String[] args) {
    BasicStatistics b1 = new BasicStatistics(5,10);
    
    b1.displayBasicStatistics();
    }
}