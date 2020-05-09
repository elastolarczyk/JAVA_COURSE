public class VipCustomers {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    VipCustomers(){
        this("Default name",100, "Default email address");
    }

    public VipCustomers(String name, double creditLimit) {
        this(name, creditLimit, "unknown");
    }

    public VipCustomers(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
