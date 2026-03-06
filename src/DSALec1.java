import java.util.*;
public class DSALec1 {
    public int countDigits(int num){
        int count = 0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    int reverseNum(int num){
        int reverseNum = 0;
        while(num>0){
            reverseNum = reverseNum*10+num%10;
            num=num/10;
        }
        return reverseNum;
    }
    void checkPalindrome(int num){
        int reverseNum = reverseNum(num);
        if(num==reverseNum){
            System.out.printf("The Number: %d is a Palindrome.\n",num);
        }
        else{
            System.out.printf("The Number: %d is not a Palindrome.\n",num);
        }
    }
    void findGCD(int a,int b){
        int gcd=0;
        while(a>0 && b>0){
            if(a>b){a = a%b;}
            else{b = b%a;}
        }
        if(a==0)gcd=b;
        else if(b==0)gcd=a;
        System.out.println("GCD of "+a+" and "+ b + " is " + gcd);
        return;
    }
    void printDivisors(int a){
        System.out.print("Divisors of "+a+" is ");
        for(int i=1;i<a/2;i++){
            if(a%i==0){
                System.out.print(i + ",");
            }
        }
        System.out.println();
        return;
    }
    void checkPrime(int a){
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                System.out.println("The number " + a + " is not a prime number, it is divisible by "+i);
            }
        }
        return;
    }
    public static void main(String[] args){
        DSALec1 dsa = new DSALec1();
        System.out.println("The count of digits: " + dsa.countDigits(15432));
        System.out.println("The reverse of the number 15432 is" + dsa.reverseNum(15432));
        dsa.checkPrime(15434);
        dsa.checkPalindrome(15434);
        dsa.checkPalindrome(15451);
        dsa.checkPrime(97);
        dsa.printDivisors(15434);
    }
}
