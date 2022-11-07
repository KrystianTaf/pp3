import java.util.Random;
import java.util.Scanner;

public class StudentGrades{

    String studentName;
    double[] grades;
    double lowestGrade = 6.0;
    double highestGrade = 1.0;
    int number;
    double gradeAverage;
    double sum;

    StudentGrades(String name, double[] grades){
        this.studentName = name;
        this.grades = grades;
    }
    
    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        

        double[] possibleGrades = {2.0, 3.0, 3.5, 4.5, 5.0};
        for (int i = 0; i < numberOfGrades; i++){
            Random random = new Random();
           int x = random.nextInt(4);
           this.grades[i] = possibleGrades[x];
        }
    }
    
    StudentGrades(String name){
        this.studentName = name;
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many grades you want to add?");
        int numberOfGrades = Integer.parseInt(myObj.nextLine());
        
        this.grades = new double[numberOfGrades];
        System.out.println("Enter grades (one at a time)");
        for (int i = 0; i < numberOfGrades; i++){
            grades[i] = Double.valueOf(myObj.nextLine());
        }
    }
    
    public void lowestGrade(){
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            } 
        }
    }
    
    public void highestGrade(){
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            } 
        }
    }
    
    public void numberOfGrades(){
        number = grades.length;
    }
    
    public void gradePointAverage(){
        for (int i = 0; i < grades.length; i++){
            sum = sum + grades[i];
        }
        gradeAverage = sum / number;
    }
    
    public void displayStudentData(){
        System.out.println("Student name: "+studentName);
        System.out.println("Student's grades: "+grades);
        System.out.println("Lowest grade: "+lowestGrade);
        System.out.println("Highest grade: "+highestGrade);
        System.out.println("Grade point average: "+gradeAverage);
    }
    
    public static void main(String[] args){
    double[] ag = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
    double[] jg = {2.0, 3.0, 2.0, 4.5, 4.5};
    StudentGrades s1 = new StudentGrades("Amanda",ag);
    StudentGrades s2 = new StudentGrades("James",jg);
    
    }
}