class BankAccount{
    private String AccName;
    private String AccID;
    private String Address;
    private String Email;
    public BankAccount() {
        System.out.println("========== Bank Account Constructor ===========");
    }
    public BankAccount(String AccName, String AccID, String Address, String Email) {
        this.AccName = AccName;
        this.AccID = AccID;
        this.Address = Address;
        this.Email = Email;
    }
}
class SavingAccount extends BankAccount{
    private String AccountType;
    private int AccountBalance;
    public void deposit(int amount) {
        this.AccountBalance += amount;
        System.out.println("Deposited "+this.AccountBalance);
    }
    public void withdraw(int amount) {
        this.AccountBalance -= amount;
        System.out.println("Withdrawing "+this.AccountBalance);
    }
}
class LoanAccount extends BankAccount{
    private String AccountType;
    private int RemainingLoanAmount;
    public void payLoan(int amount) {
        this.RemainingLoanAmount += amount;
    }
    public void getLoanBalance() {
        System.out.println("Loan Balance "+this.RemainingLoanAmount);
    }
}
public class Account {
    public static void main(String args[]) {
        System.out.println("Main Method");
        LoanAccount loanAccount = new LoanAccount();
    }
}