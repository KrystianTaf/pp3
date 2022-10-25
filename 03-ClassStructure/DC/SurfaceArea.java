public class SurfaceArea{

    
    public static double circleArea(int r){
    return r * r * 3.14;
    }
    
    public static double rectangleArea(int a, int h){
    return a * h;
    }
    
    public static double triangleArea(int a, int h){
    return 0.5 * (a * h);
    }
    
    public static void main(String[] args) {
    double rectangleArea = rectangleArea(4,5);
    double circleArea = circleArea(3);
    double triangleArea = triangleArea(3,4);
    
    System.out.println(rectangleArea);
    System.out.println(circleArea);
    System.out.println(triangleArea);
    }
}