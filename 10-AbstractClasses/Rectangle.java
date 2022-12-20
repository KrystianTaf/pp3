public class Rectangle extends Shape {
    
    double a;
    double b;

    
    
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return (a*b);
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 02*(a+b);
    }
}
