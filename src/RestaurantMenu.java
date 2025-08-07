
interface FoodItem {
    void prepare();
    int getPrice();
}


class Pizza implements FoodItem {
    private int price = 300;
    private int preparationTime = 15;
    private String[] ingredients = {"Dough", "Cheese", "Tomato Sauce", "Toppings"};

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza...");
        System.out.println("Ingredients: ");
        for (String item : ingredients) {
            System.out.println("- " + item);
        }
        System.out.println("Preparation Time: " + preparationTime + " mins");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Burger implements FoodItem {
    private int price = 150;
    private int preparationTime = 10;
    private String[] ingredients = {"Bun", "Patty", "Lettuce", "Cheese", "Sauce"};

    @Override
    public void prepare() {
        System.out.println("Preparing Burger...");
        System.out.println("Ingredients: ");
        for (String item : ingredients) {
            System.out.println("- " + item);
        }
        System.out.println("Preparation Time: " + preparationTime + " mins");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Pasta implements FoodItem {
    private int price = 200;
    private int preparationTime = 12;
    private String[] ingredients = {"Pasta", "Cream", "Cheese", "Spices"};

    @Override
    public void prepare() {
        System.out.println("Preparing Pasta...");
        System.out.println("Ingredients: ");
        for (String item : ingredients) {
            System.out.println("- " + item);
        }
        System.out.println("Preparation Time: " + preparationTime + " mins");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

public class RestaurantMenu {
    public static void orderItem(FoodItem item) {
        item.prepare();
        System.out.println("Price: ₹" + item.getPrice());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Restaurant!");
        System.out.println("============================");

        // Polymorphism: all items handled via FoodItem reference
        FoodItem[] menu = {
                new Pizza(),
                new Burger(),
                new Pasta()
        };

        for (FoodItem item : menu) {
            orderItem(item);
        }
    }
}
