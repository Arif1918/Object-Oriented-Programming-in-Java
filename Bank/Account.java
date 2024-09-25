package Bank;

public class Account {
    private String accNo;
    private String accType;
    private String accHolderName;
    private double balance;

    public Account(String accNo,String accType,String accHolderName,double balance) {
        this.accNo = accNo;
        this.accType = accType;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printAccountDetails(){
        System.out.println("Account No: "+accNo);
        System.out.println("Account Type: "+accType);
        System.out.println("Account Holder: "+accHolderName);
        System.out.println("Initial Balance: "+balance+"\n");
    }

}
