class NegativeValueException extends Exception {
    public String toString() {
        return "Negative Values are not accepted !!";
    }
}
public class CustomExceptions {
    int area(int x, int y) throws NegativeValueException {
        if(x<0 || y<0){
            throw new NegativeValueException();
        }
        return x*y;
    }
    public void main(String[] args) {
        try{
            System.out.println("Area of Rectangle: " + area(-10,20));
        }catch(NegativeValueException e){
            System.out.println(e);
        }
    }
}
