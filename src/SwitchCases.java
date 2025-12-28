import java.util.Scanner;

public class SwitchCases {
    private static void findDay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Happy, Monday !!");
                break;
            case 2:
                System.out.println("Happy Tueday !!");
                break;
            case 3:
                System.out.println("Happy Wednesday !!");
                break;
            case 4:
                System.out.println("Happy Thursday !!");
                break;
            case 5: System.out.println("Happy Friday !!");
                    break;
            case 6:
                System.out.println("Happy Saturday !!");
                break;
            case 7:
                System.out.println("Happy Sunday !!");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    private static void findMonth   (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month number: ");
        int month = sc.nextInt();
        switch(month){
            case 1:
                System.out.println("Happy, January !!");
                break;
            case 2:
                System.out.println("Happy, February !!");
                break;
            case 3:
                System.out.println("Happy, March !!");
                break;
            case 4:
                System.out.println("Happy, April !!");
                break;
            case 5:
                System.out.println("Happy, May !!");
                break;
            case 6:
                System.out.println("Happy, June !!");
                break;
            case 7:
                System.out.println("Happy, July !!");
                break;
            case 8:
                System.out.println("Happy, August !!");
                break;
                case 9:
                    System.out.println("Happy, September !!");
                    break;
            case 10:
                System.out.println("Happy, October !!");
                break;
            case 11:
                System.out.println("Happy, November !!");
                break;
            case 12:
                System.out.println("Happy, December !!");
                break;
            default:
                System.out.println("Invalid Month Number");
        }
    }
    private static void findWebsite(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the website: ");
        String website = sc.next();
        String protocol = website.split("://")[0];
        String top_domain = website.substring(website.lastIndexOf(".")+1).replaceAll("[^\\w]*", "");
        System.out.println("Protocol: " + protocol + " Top domain: " + top_domain);
        switch(protocol){
            case "https":
                System.out.println("The Website uses https protocol.");
                break;
            case "http":
                System.out.println("The Website uses http protocol.");
                break;
            case "ftp":
                System.out.println("The Website uses ftp protcol.");
                break;
            default:
                System.out.println("Invalid website");
        }
        switch(top_domain){
            case "com":
                System.out.println("The Website meant for commerical usecase.");
                break;
            case "org":
                System.out.println("The Website meant for Organization usecase.");
                break;
            case "net":
                System.out.println("The Website meant for networking usecase.");
                break;
            default:
                System.out.println("Invalid website");
        }
    }
    public static void LeapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.println("Year: " + year);
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Its a Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Its a Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }
    public static void main(String[] args) {
//        findDay();
//        findMonth();
//        findWebsite();
        LeapYear();
    }
}
