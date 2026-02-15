package CustomDocs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author Chaitanya
 * @version 1.0.0.0
 * Class for RelectionPackage Example
 */
class ReflectDemo{
    /**
     * @value - for defining all defined to list in Fields Array
     */
    private int a;
    public int b;
    float c;

    /**
     * Non - Parameterized Constructor of ReflectDemo
     */
    ReflectDemo(){}

    /**
     * Parameterized Constructure of ReflectDemo
     * @param a
     * @param b
     * @param c
     */
    ReflectDemo(int a, int b, float c){}
    void display(){}
    void display1(int a, int b){}
}
public class ReflectionPackage {
    public static void main(String[] args) {
        Class d = Thread.class;
        System.out.println(d);
        System.out.println("============ Fields =====================");
        Field f[] = d.getDeclaredFields();
        for (Field f1 : d.getDeclaredFields()) {
            System.out.println(f1);
        }
        System.out.println("============ Methods ====================");
        Method m[] = d.getDeclaredMethods();
        for (Method m1 : d.getDeclaredMethods()) {
            System.out.println(m1);
        }
        System.out.println("============= Constructors ===================");
        Constructor c[] = d.getDeclaredConstructors();
        for (Constructor c1 : d.getDeclaredConstructors()) {
            System.out.println(c1);
        }
        System.out.println("============= Parameters of Method 1 ===================");
        Parameter params[] = m[1].getParameters();
        for (Parameter param : params) {
            System.out.println(param);
        }
    }
}
