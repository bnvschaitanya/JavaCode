import java.util.Scanner;

public class Expressions {
    public static void baseHeight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base and Height of the triangle:");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float areaOfTriangle = (base * height)/2;
        System.out.println("The Area of the triangle is "+areaOfTriangle);
    }
    public static void sidesArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sides of the triangle:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float s = (a + b + c) / 2;
        System.out.println("The Value of s: " + s);

        float area =(float) Math.sqrt(((s-a) + (s-b) + (s-c)));
    }
    static void quadraticExpression(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the values of a,b and c literals of Quadratic Expressions: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float discriminant = (float) Math.sqrt((b*b)-(4*a*c));
        float root1 = ( - b + discriminant)/(2*a);
        float root2 = ( - b - discriminant)/(2*a);
        if(discriminant<0){
            System.out.println("The discriminant value is negative : It has 2 imaginary roots -> " + root1 + " " + root2);
        }
        else if(discriminant>0){
            System.out.println("The discriminant value is positive : It has 2 positive unique roots -> "+root1+ " " + root2);
        }
        else{
            System.out.println("The discriminant value is zero : It has 2 equal roots -> " +  root1 + " " + root2);
        }
    }
    public static void main(String args[]){
//       baseHeight();
//        sidesArea();
        quadraticExpression();
    }
}
