public class BankAccount {

    private double number;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setNumber(double number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(int cashToAdd)
    {
        //balance =+ cashToAdd;
        balance += cashToAdd;
        System.out.println("After add: " + cashToAdd + " balance is equal: " + this.balance);
    }

    public void withdraw(int cashBack)
    {
        if(cashBack > this.balance){
            System.out.println("You don't have that amount of money");
        }
        else{
            this.balance -= cashBack;
            System.out.println("Balance: " + this.balance);
        }
    }


}
