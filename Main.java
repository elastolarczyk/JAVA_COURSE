public class Main {

    public static void main(String[] args) {
        Hamburger firstHamburger = new Hamburger("Normal", "White", "Chicken", 5.5);
        System.out.println(firstHamburger.addAdditionsToBurger());

        firstHamburger.add2("Onion", 0.25);
        firstHamburger.add3("Tomato", 0.35);

        System.out.println(firstHamburger.addAdditionsToBurger());

        HealthyBurger firstHealthyBurger = new HealthyBurger("Chicken",
                5.55);
        System.out.println(firstHealthyBurger.addAdditionsToBurger());
        firstHealthyBurger.add1("Salad", 0.10);
        firstHealthyBurger.add5("Red Onion", 1.25);
        firstHealthyBurger.add6("Aspargus", 2.35);

        System.out.println(firstHealthyBurger.addAdditionsToBurger());

        DeluxeHamburger firstDeluxeBurger = new DeluxeHamburger("White bread", "Ham", 8.15);
        firstDeluxeBurger.addChips("Big chips", 2.5);
        firstDeluxeBurger.addDrink("Cola", 3.0);
        firstDeluxeBurger.add1("Tomato", 0.55);
        System.out.println(firstDeluxeBurger.addAdditionsToBurger());
    }
}
