public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount (String number, double balance, String customerName, String email, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double addFund) {
        this.balance += addFund;
        System.out.println("Added " + addFund + " to your Account. New balance: " + this.balance);
    }

    public void withdrawalFunds(double subtractFund){
        if (this.balance - subtractFund < 0){
            System.out.println("Only " + this.balance + "available. Withdrawal not processed.");
        }
        else {
            this.balance -= subtractFund;
            System.out.println("Withdrawal of " + subtractFund + " processed. Remaining balance: " + this.balance);
        }
    }
}
