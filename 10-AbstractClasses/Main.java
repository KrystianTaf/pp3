public class Main {
    
    public static void main(String[] args) {
        /* 
        Rectangle r1 = new Rectangle(3, 5);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        Triangle t1 = new Triangle(3, 4, 5);
        System.out.println(t1.area());
        System.out.println(t1.perimeter());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        Circle c1 = new Circle(5);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        */
        SMS s1 = new SMS("hejo","742817172");
        s1.send();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        Email e1 = new Email("qwertyuiop", "PP3", "xyz@uek.pl");
        e1.send();
    }
}
