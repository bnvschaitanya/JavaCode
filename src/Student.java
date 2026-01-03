import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String className;
    private int[] marks;
    public Student(String id, String name) {
        this.name = name;
        this.id = id;
    }
    public void setStudyDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the study details of " + this.name + " of ID: "+this.id);
        System.out.print("\nEnter the student Age:");
        this.age = sc.nextInt();
        System.out.print("\nEnter the student className:");
        this.className = sc.next();
        System.out.print("\nEnter the student marks of all 4 subjects:");
        this.marks = new int[4];
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = sc.nextInt();
        }
    }
    public void getStudyDetails(){
        System.out.println("Study Details of student: "+this.name + "of ID: "+this.id);
        System.out.println("Age: "+this.age);
        System.out.println("Class: "+this.className);
    }
    public String toString(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student ID: "+this.id);
        getStudyDetails();
        System.out.println("Average Marks: "+this.AverageMarks());
        return "";
    }
    public int AverageMarks(){
        int sum = 0;
        for(int a:marks){
            sum =+ a;
        }
        return sum/marks.length;
    }
    public static void main(String []args){
        Student []student = new Student[3];
        student[0] = new Student("O170516", "Chaitanya");
        student[1] = new Student("O170517", "Ravi");
        student[2] = new Student("O170518", "Vinay");
        student[0].setStudyDetails();
        student[1].setStudyDetails();
        student[2].setStudyDetails();
        for(Student s:student){
            System.out.println(s);
        }
    }
}
