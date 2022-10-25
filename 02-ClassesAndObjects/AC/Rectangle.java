public class Rectangle{

    int sideA;
    int sideB;
    
    public void displayDimensions(){
        System.out.println("Rectangle dimensions are "+sideA+" and "+sideB);
    }
    
    public void displayPerimiter(){
        int perimiter;
        perimiter = 2 * sideA + 2 * sideB;
        System.out.println("Rectangle perimiter is "+perimiter);
    }
    
    public void displaySurfaceArea(){
        int surfaceArea;
        surfaceArea = sideA * sideB;
        System.out.println("Rectangle surface area is "+surfaceArea);
    }
    
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.sideA = 3;
        rectangle1.sideB = 4;
        rectangle1.displayDimensions();
        rectangle1.displayPerimiter();
        rectangle1.displaySurfaceArea();
        
        Rectangle rectangle2 = new Rectangle();
        rectangle2.sideA = 2;
        rectangle2.sideB = 7;
        rectangle2.displayDimensions();
        rectangle2.displayPerimiter();
        rectangle2.displaySurfaceArea();
    }
}
