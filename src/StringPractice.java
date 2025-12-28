import java.util.Scanner;

public class StringPractice {
    static void mailCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any valid gmail id:");
        String mailId = sc.next();
        boolean check = mailId.matches("[\\w]*@[\\w]+.com");
        if(check){
            System.out.printf("Entered mail id is valid.\n");
        }
        else{
            System.out.printf("Entered mail id is invalid.\n");
        }
        int breakIndex = mailId.indexOf("@");
        int len = mailId.length();
        System.out.println("User name: " + mailId.substring(0, breakIndex) + "\nDomain Name: " +  mailId.substring(breakIndex + 1));
    }
    static void patternChecks(){
        int i = 100;
        String str = Integer.toBinaryString(i);
        System.out.printf("Binary String: %s\n", str);
        System.out.printf("Check whether it is binary: %b \n", str.matches("[01]*"));

        str = Integer.toHexString(i);
        System.out.printf("Hex String: %s\n", str);
        System.out.printf("Check whether it is HexaDecimal: %b \n", str.matches("[0-9A-F]*"));

        String date = "25/08/2001";
        System.out.printf("Check whether date is in proper format (dd/mm/yyyy): %b \n", date.matches("\\d{2}/\\d{2}/\\d{4}"));
    }
    static void stringPractice(){
        String str = "        Hello         @World        !!   123";
        str = str.replaceAll("[^a-zA-Z0-9]*", "");
        System.out.println("String after special characters removal: " + str);

        System.out.println("No of Words: " + str.trim().replaceAll("\\s+"," ").split("\\s").length);
    }
    public static void main(String[] args) {
//        mailCheck();
//        patternChecks();
        stringPractice();
    }
}
