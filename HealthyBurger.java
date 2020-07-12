public class HealthyBurger extends Hamburger {

    private String nameAdd5;
    private String nameAdd6;

    private double priceAdd5;
    private double priceAdd6;

    public HealthyBurger(String meat, double price) {
        super("Healthy burger", "Rye bread", meat, price);
    }

    public void add5(String name, double price)
    {
        this.nameAdd5 = name;
        this.priceAdd5 = price;
    }

    public void add6(String name, double price)
    {
        this.nameAdd6 = name;
        this.priceAdd6 = price;
    }

    @Override
    public double addAdditionsToBurger() {
        double burgerCost = super.addAdditionsToBurger();

        if(nameAdd5 != null){
            burgerCost += this.priceAdd5;
            System.out.println("Healthy additions \nName: " + nameAdd5 + "\nPrice: " + priceAdd5);
        }

        if(nameAdd6 != null){
            burgerCost += this.priceAdd6;
            System.out.println("Healthy additions \nName: " + nameAdd6 + "\nPrice: " + priceAdd6);
        }
        return burgerCost;
    }
}
