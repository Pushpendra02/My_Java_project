package bill;

public class DeluxPizza extends pizza {

    public DeluxPizza(Boolean veg) {
        super(veg);
        // You can optionally call superclass methods here
        // super.addExtraCheese();
        // super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        this.price += extraCheesePrice;
    }

    @Override
    public void addExtraToppings() {
        this.price += extraToppingsPrice;
    }

    // Optional: Override other methods if needed

    public static void main(String[] args) {
        // Example usage:
        DeluxPizza deluxePizza = new DeluxPizza(true); // Example: Veg deluxe pizza
        deluxePizza.addExtraCheese();
        deluxePizza.addExtraToppings();
        deluxePizza.takeAway(); // Example of using inherited method
        deluxePizza.getBill(); // Example of using inherited method
    }
}
