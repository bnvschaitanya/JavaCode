import java.io.*;
class StudentData implements Serializable{
    String name;
    int age;
    float job_experience;
    transient float salary;
    static int student_num;
    StudentData(){};
    StudentData(String name,int age,float job_experience,float salary){
        this.name=name;
        this.age=age;
        this.job_experience=job_experience;
        this.salary=salary;
        student_num=1;
    }
    public String toString(){
        return "Student: " + this.name + "\nAge: " + this.age + "\nJob Experience: " + this.job_experience +
                "\nSalary: " + this.salary;
    }
}
public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("studentData.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        StudentData sd = new StudentData("Chaitanya", 24, 1.8f, 21.5f);
        oos.writeObject(sd);
        fos.close();

        FileInputStream fis = new FileInputStream("studentData.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        fis.close();

    }
}
