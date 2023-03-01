package RESTAURANT.Gideon;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    void showMenu() {
        System.out.println("Drinks: ");
        // list to hold drinks items
        List<String> drinks = new ArrayList<String>();
        drinks.add("1. Water - 200");
        drinks.add("2. CockTail - 450");
        drinks.add("3. MockTail - 400");
        drinks.add("4. Juice - 300");
        drinks.add("5. Coffee - 250");
        System.out.println(drinks);

        System.out.println("Foods: ");
        // list to hold foods items
        List<String> foods = new ArrayList<String>();
        foods.add("1. Shawarma - 250");
        foods.add("2. Chips Masala - 250");
        foods.add("3. Pilau - 200");
        foods.add("4. Biryani - 350");
        foods.add("5. Pizza - 750");
        System.out.println(foods);
    }

    List<String> drinks = new ArrayList<>();
    List<String> foods = new ArrayList<>();
    void showMenuItems() {
        System.out.println("Drinks: ");
        // list to hold drinks items

        drinks.add("1. Water - 200");
        drinks.add("2. CockTail - 450");
        drinks.add("3. MockTail - 400");
        drinks.add("4. Juice - 300");
        drinks.add("5. Coffee - 250");

        System.out.println("Foods: ");
        // list to hold foods items

        foods.add("1. Shawarma - 250");
        foods.add("2. Chips Masala - 250");
        foods.add("3. Pilau - 200");
        foods.add("4. Biryani - 350");
        foods.add("5. Pizza - 750");
    }
}
package restaurant.cj;

import java.util.Scanner;

public class StartingPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Gideon's Restaurant");
        System.out.println("Select a service:");
        System.out.println("1. Show menu.\n2. Place order.\n3. Edit Restaurant menu(Admininstration only).");
        System.out.println("Enter a number representing a service: ");
        int selectedOption = input.nextInt();

        Menu menuObj = new Menu();
        switch (selectedOption) {
            case 1 -> {
                System.out.println("Selected Service: Show menu");
                menuObj.showMenu();
            }
            case 2 -> {
                System.out.println("Selected Service: Place order");
                menuObj.showMenu();
                System.out.println("Enter a number representing a drink: ");
                int selectedDrink = input.nextInt();
                System.out.println("Enter a number representing a food: ");
                int selectedFood = input.nextInt();

                Transactions transactionsObject = new Transactions();
                transactionsObject.showSelectedOrder(selectedDrink, selectedFood);
            }
            case 3 -> System.out.println("Selected Service: Edit Restaurant menu");
            default -> System.out.println("Invalid selection");
        }

    }
}
package restaurant.;

public class Transactions {

    void showSelectedOrder(int selectedDrink, int selectedFood){
        Menu menuObj = new Menu();

        menuObj.showMenuItems();
        System.out.println("Selected drink: " + menuObj.drinks.get(selectedDrink-1));
        System.out.println("Selected foods: " + menuObj.foods.get(selectedFood-1));
    }
}

