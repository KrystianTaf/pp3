public class Student {
    
    //Wykaz atrybutów
    String name;
    int age;
    String studentIdCard;
    boolean isValid;
    int semester;
    double averageGrade;
    
    //Wykaz metod
    public void sayHello()
    {
        System.out.println("Hello");
    };
    public void displayName()
    {
        System.out.println("My name is " + name);
    };
    public void displayAge()
    {
        System.out.println("My age is " + age);
    };
    public void displayData1()
    {
        System.out.println("Student name: " + name);
        System.out.println("Student semester: " + semester);
        System.out.println("Student average grade: " + averageGrade);
    };
    public void changeIdCardStatus()
    {
        isValid = !isValid;
    };
    public void displayData2()
    {
        System.out.println("Student name: " + name);
        System.out.println("Student student ID card number: " + studentIdCard);
        System.out.println("Student studentID card validation: " + isValid);
    };
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "Jerzy";
        s1.age = 21;
        s1.semester = 2;
        s1.averageGrade = 3.7;
        s1.studentIdCard = "234579";
        s1.isValid = true;
        
        s1.displayData1();
        s1.changeIdCardStatus();
        s1.displayData2();
        
    };
}