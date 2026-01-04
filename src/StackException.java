import java.util.EmptyStackException;
import java.util.Stack;
class StackOverflowException extends Exception {
    public String toString(){
        return "Stack Overflow !! Stack is full, can't push new element.";
    }
}
class StackUnderflowException extends Exception {
    public String toString(){
        return "Stack Underflow !! Stack is empty, can't remove an element.";
    }
}
class stack{
    int size;
    int top;
    int[] s;
    stack(int size){
        this.size=size;
        s = new int[size];
        top=-1;
    }
    void push(int value) throws StackOverflowException{
        if(top == size-1){
            throw new StackOverflowException();
        }
        System.out.println("Pushing "+value+" to stack of size = "+ top );
        s[++top]=value;
    }
    void pop() throws StackUnderflowException{
        if(top==-1){
            throw new StackUnderflowException();
        }
        System.out.println("Popping "+s[top]+" from stack having size "+ top +".");
        s[top--]=0;
    }
}
public class StackException {
    public static void main(String[] args) {
        stack s = new stack(3);
        try {
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
        } catch (StackOverflowException e) {
            System.out.println(e);
        }
        try {
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
        } catch (StackUnderflowException e) {
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
