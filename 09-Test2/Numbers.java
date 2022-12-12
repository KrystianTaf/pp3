public class Numbers {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    public Numbers(int num1, int num2, int num3, int num4, int num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public boolean different() {
        return num1 != num2 && num1 != num3 && num1 != num4 && num1 != num5
            && num2 != num3 && num2 != num4 && num2 != num5
            && num3 != num4 && num3 != num5
            && num4 != num5;
    }



    public static void main(String[] args) {
        Numbers t1 = new Numbers(3,4,2,1,6);
        System.out.println(t1.different());

        Numbers t2 = new Numbers(9,7,4,3,7);
        System.out.println(t2.different());
    }
}