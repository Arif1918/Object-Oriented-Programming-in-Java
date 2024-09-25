package Bank;

public class MainClass {
    public static void main(String[] args) {

        Account ac1 = new Account("12009","Savings","Ariful Islam",500);
        ac1.deposit(1500);
        ac1.printAccountDetails();

        Account ac2 = new Account("12010","Current","Moin Uddin",500);
        ac2.deposit(2500);
        ac2.printAccountDetails();

        Bank islamiBank = new Bank();
        islamiBank.addAccount(ac1);
        islamiBank.addAccount(ac2);

        //Withdraw and Deposit money from a specific account by the bank
        islamiBank.withdrawMoney(ac1,700);
        islamiBank.depositMoney(ac2,500);


        //Print account details of these account that are in the Islami Bank
        for(Account a : islamiBank.getAccounts()) {
            a.printAccountDetails();
        }
    }
}
