public class Circle extends Shape {
    
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return Math.PI*(r*r);
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 2*Math.PI*r;
    }

    
}
