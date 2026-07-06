import java.util.*;


abstract class Person {
    protected String name;
    protected int rollNo;
    public Person(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public abstract void displayResult();
}
class Student extends Person {
    private int[] marks = new int[5];
    private int total;
    private double percentage;
    private String grade;

    public Student(String name, int rollNo) {
        super(name, rollNo);
    }
    public void setMarks(int[] marks){
        this.marks = marks;
    }
    public int getTotal(){
        return total;
    }
    public double getPercentage(){
        return percentage;
    }
    public String getGrade(){
        return grade;
    }
    public void calculateResult(){
        total = 0;
        for (int mark : marks){
            total += mark;
        }
        percentage = total / 5.0;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";
    }

    @Override
    public void displayResult() {
        System.out.println("\n====== Student Result ======");
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Total: " + total + "/500");
        System.out.printf("Percentage : %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        if(grade.equals("F"))
            System.out.println("Result: Fail");
        else
            System.out.println("Result: Pass");
    }
}
public class StudGradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Roll No.: ");
        int rollno = sc.nextInt();
        Student student = new Student(name , rollno);
        int[] marks = new int[5];
        System.out.println("Enter Marks of 5 Subjects: ");
        for (int i = 0; i<5; i++){
            System.out.println("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        student.setMarks(marks);
        student.calculateResult();
        student.displayResult();

        sc.close();
    }
}