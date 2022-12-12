public class Car extends Vehicle{

    int maxSpeed;

    public Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        int[] spec = new int[2];
        spec[0] = getSeats();
        spec[1] = maxSpeed;
        return spec;
    }

    public static void main(String[] args) {
        Car c1 = new Car(4,120);
        System.out.println(c1.spec());
    }
}