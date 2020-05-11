public class Main {

    public static void main(String[] args) {

       /* SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());*/

        /*Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());*/

        /*BankAccount bankAccount = new BankAccount();
        bankAccount.setNumber(654789123);
        bankAccount.setBalance(1500.45);
        bankAccount.setCustomerName("Ela");
        bankAccount.setEmail("els@gmail.com");
        bankAccount.setPhoneNumber(533943033);
        System.out.println("Name " + bankAccount.getCustomerName() + " balance: " + bankAccount.getBalance());

        bankAccount.deposit(1500);

        bankAccount.withdraw(3500);*/
        //System.out.println("After -3500: " + bankAccount.getBalance());

        /*VipCustomers ElaVip = new VipCustomers("Ela", 1500, "els@gmail.com");
        System.out.println(ElaVip.getName());

        VipCustomers Somebody = new VipCustomers("Jogus", 99999);
        System.out.println(Somebody.getName() + " " + Somebody.getCreditLimit() + " " + Somebody.getEmailAddress());

        VipCustomers AdrianVip = new VipCustomers();
        System.out.println(AdrianVip.getName());*/

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
