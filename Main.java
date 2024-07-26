package bill;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-- Welcome to Pizzamania --");

        System.out.println("Which pizza: (1. Veg Pizza 2. Non-Veg Pizza 3. Delux Veg Pizza 4. Delux Non-Veg Pizza)");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                Pizza vegPizza = new Pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
                break;
            case 2:
                Pizza nonvegPizza = new Pizza(false);
                nonvegPizza.addExtraToppings();
                nonvegPizza.addExtraCheese();
                nonvegPizza.takeAway();
                nonvegPizza.getBill();
                break;
            case 3:
                DeluxePizza veg = new DeluxePizza(true);
                veg.basePizzaPrice = 550;
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeAway();
                veg.getBill();
                break;
            case 4:
                DeluxePizza nonveg = new DeluxePizza(false);
                nonveg.basePizzaPrice = 650;
                nonveg.addExtraToppings();
                nonveg.addExtraCheese();
                nonveg.takeAway();
                nonveg.getBill();
                break;
            default:
                System.out.println("Sorry, Enter Again!!");
                break;
        }

        sc.close();
    }

}
