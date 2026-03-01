public class GenericClassDemo<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        GenericClassDemo genericClassDemo = new GenericClassDemo();
        genericClassDemo.setT(10);
        System.out.println(genericClassDemo.getT());
        genericClassDemo.setT("Hello");
        System.out.println(genericClassDemo.getT());
        genericClassDemo.setT(3.14f);
        System.out.println(genericClassDemo.getT());
    }
}
