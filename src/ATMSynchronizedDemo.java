class ATM{
    synchronized void checkBalance(String name){
        System.out.println("Hi "+name+" , your balance: 1000");
    }
    synchronized void withdraw(String name, int amount){
        System.out.println("Hi "+name+" , After withdraw: "+amount + " available in your account");
    }
}

class customer1 extends Thread{
    ATM atm;
    String name;
    int amount;
    customer1(String name, ATM atm, int amount){
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }
    public void run(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
}

class customer2 extends Thread{
    ATM atm;
    String name;
    int amount;
    customer2(String name, ATM atm, int amount){
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }
    public void run(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
}
public class ATMSynchronizedDemo {
    public static void main(String[] args){
        ATM atm = new ATM();
        customer1 c1 = new customer1("Rahu", atm, 100);
        customer2 c2 = new customer2("Ketu", atm, 200);
        c1.start();
        c2.start();
    }
}
