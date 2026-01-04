package com.pkg1;

public class TestPkg {
    int a=10;
    private  int b=20;
    protected int c = 30;
    public int d = 40;
    public void displayDemo2(){
        System.out.println(a+b+c+d);
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        TestPkg testPkg=new TestPkg();
        testPkg.displayDemo2();
    }
}

