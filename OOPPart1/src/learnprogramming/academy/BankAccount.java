package learnprogramming.academy;

public class BankAccount {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

//   Constructor
    public BankAccount(){
        //creating default
        this("John Done", "example@example.com", "23423", 2342, 0);
        System.out.println("Empty Constructor");
    }
    public  BankAccount(String name, String email, String phoneNumber, double ac, double balance){
        this.customerName=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.accountNumber=ac;
        this.balance= balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        this.balance +=amount;
        System.out.println("Deposit of "+amount +" made. New balance is "+this.getBalance());
    }
    public  void withdraw(double amount){
        if(this.getBalance()>=amount){
            this.balance-=amount;
            System.out.println("Withdrawal of "+ amount+" processed. Remaining balance = "+this.getBalance());
        }else
            System.out.println("Only "+this.getBalance()+" available. Withdraw not processed");
    }
}
