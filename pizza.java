import java.util.Scanner;

public class Pizza {
    private int price;
    private boolean veg;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isOptedForTakeaway;
    private int extraCheesePrice = 16;
    private int extraToppingsPrice = 20;
    private int backPackPrice = 20;
    private int basePizzaPrice;

    Scanner in = new Scanner(System.in);

    public Pizza(Boolean veg) {
        this.veg = veg;

        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        System.out.println("Extra cheese (y/n)? =>");
        char ch = in.next().charAt(0);
        if (ch == 'y') {
            isExtraCheeseAdded = true;
            this.price += extraCheesePrice;
        } else {
            isExtraCheeseAdded = false;
        }
    }

    public void addExtraToppings() {
        System.out.println("Want Extra Topping (y/n)? ->");
        char ch = in.next().charAt(0);
        if (ch == 'y') {
            isExtraToppingsAdded = true;
            this.price += extraToppingsPrice;
        } else {
            isExtraToppingsAdded = false;
        }
    }

    public void takeAway() {
        System.out.println("Want TakeAway (y/n)? =>");
        char ch = Character.toLowerCase(in.next().charAt(0));
        if (ch == 'y') {
            isOptedForTakeaway = true;
            this.price += backPackPrice;
        } else {
            isOptedForTakeaway = false;
        }
    }

    public void getBill() {
        StringBuilder bill = new StringBuilder();

        bill.append("Pizza: ").append(basePizzaPrice).append("\n");
        if (isExtraCheeseAdded) {
            bill.append("Extra Cheese: ").append(extraCheesePrice).append("\n");
        }
        if (isExtraToppingsAdded) {
            bill.append("Extra Toppings: ").append(extraToppingsPrice).append("\n");
        }
        if (isOptedForTakeaway) {
            bill.append("Take away: ").append(backPackPrice).append("\n");
        }
        bill.append("\nTotal Amount: ").append(this.price).append("\n");

        System.out.println(bill.toString());
        System.out.println("\n\n\nThank you!!!! Visit Again.....");
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza(true); // Example: Veg pizza
        pizza.addExtraCheese();
        pizza.addExtraToppings();
        pizza.takeAway();
        pizza.getBill();
    }
}
