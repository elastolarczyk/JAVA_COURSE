import java.util.Scanner;

public class Hamburger {

    private String name;
    private String roll;
    private String meat;
    private double price;

    private String nameAdd1;
    private String nameAdd2;
    private String nameAdd3;
    private String nameAdd4;

    private double priceAdd1;
    private double priceAdd2;
    private double priceAdd3;
    private double priceAdd4;

    public Hamburger(String name, String roll, String meat, double price) {
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.price = price;
    }

    public void add1(String name, double price)
    {
        this.nameAdd1 = name;
        this.priceAdd1 = price;
    }

    public void add2(String name, double price)
    {
        this.nameAdd2 = name;
        this.priceAdd2 = price;
    }

    public void add3(String name, double price)
    {
        this.nameAdd3 = name;
        this.priceAdd3 = price;
    }

    public void add4(String name, double price)
    {
        this.nameAdd4 = name;
        this.priceAdd4 = price;
    }

    public double addAdditionsToBurger(){
        double burgerCost = this.price;

        System.out.println("Burger name is " + this.name + "\nBread: " + this.roll + "\nMeat: " + this.meat + "\nPrice: " +
                this.price);

        if(nameAdd1 != null){
            burgerCost += this.priceAdd1;
            System.out.println("Name: " + nameAdd1 + "\nPrice: " + priceAdd1);
        }

        if(nameAdd2 != null){
            burgerCost += this.priceAdd2;
            System.out.println("Name: " + nameAdd2 + "\nPrice: " + priceAdd2);
        }

        if(nameAdd3 != null){
            burgerCost += this.priceAdd3;
            System.out.println("Name: " + nameAdd3 + "\nPrice: " + priceAdd3);
        }

        if(nameAdd4 != null){
            burgerCost += this.priceAdd4;
            System.out.println("Name: " + nameAdd4 + "\nPrice: " + priceAdd4);
        }

        return burgerCost;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }
}
