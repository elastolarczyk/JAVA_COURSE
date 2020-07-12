public class DeluxeHamburger extends Hamburger {
    private String drink;
    private String chips;

    private double priceDrink;
    private double priceChips;

    public DeluxeHamburger( String roll, String meat, double price) {
        super("Deluxe Hamburger", roll, meat, price);
    }

    public void addDrink(String name, double price){
        this.drink = name;
        this.priceDrink = price;
    }

    public void addChips(String name, double price){
        this.chips = name;
        this.priceChips = price;
    }

    @Override
    public double addAdditionsToBurger() {
        double burgerCost = super.addAdditionsToBurger();

        if(this.chips != null){
            burgerCost += this.priceChips;
            System.out.println("Deluxe additions \nName: " + chips + "\nPrice: " + priceChips);
        }

        if(this.drink != null){
            burgerCost += this.priceDrink;
            System.out.println("Deluxe additions \nName: " + drink + "\nPrice: " + priceDrink);
        }

        return burgerCost;
    }
}
