enum Dept{
    CS("Computer Science", "4yrs"),IT("Information Technology", "3yrs"), CIVIL("Civil Engineer", "4yrs");
    String career;
    String period;
    private Dept(String course, String period){
     this.career = course;
     this.period =period;
    }
    public String toString(){
        System.out.println("Career: "+this.career);
        System.out.println("Period: "+this.period);
        return this.name();
    }
}
public class EnumExample {
    public static void main(String[] args) {
        Dept d = Dept.CS;
        System.out.println(d);
        switch (d){
            case IT:
                System.out.println("IT");
                break;
            case CS:
                System.out.println("CS");
                break;
            case CIVIL:
                System.out.println("CIVIL");
                break;
            default:
                System.out.println("None of the Above");
        }
    }
}
