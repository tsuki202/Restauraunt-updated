import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створюємо ресторани
        Restaurant amadeus = new Restaurant("Amadeus");
        Restaurant celentano = new Restaurant("Celentano");
        Restaurant po36 = new Restaurant("36 Po");

        // Додаємо елементи до меню кожного ресторану
        for (FoodItem item : FoodMenu.getAmadeusMenu()) {
            amadeus.addMenuItem(item);
        }

        for (FoodItem item : FoodMenu.getCelentanoMenu()) {
            celentano.addMenuItem(item);
        }

        for (FoodItem item : FoodMenu.get36PoMenu()) {
            po36.addMenuItem(item);
        }

        // Вибір ресторану
        System.out.println("Оберіть ресторан: Amadeus/Celentano/36 Po:");
        String restaurantChoice = scanner.nextLine().trim();

        Restaurant selectedRestaurant;

        switch (restaurantChoice) {
            case "Amadeus":
                selectedRestaurant = amadeus;
                break;
            case "Celentano":
                selectedRestaurant = celentano;
                break;
            case "36 Po":
                selectedRestaurant = po36;
                break;
            default:
                System.out.println("Такого ресторану не існує.");
                return;
        }

        // Починаємо замовлення
        int totalSum = 0;
        while (true) {
            // Отримуємо категорії з меню ресторану
            List<String> categories = selectedRestaurant.getCategories();
            System.out.println("Оберіть категорію: " + String.join("/", categories) + " (або 'це все!' для завершення):");
            String selectedCategory = scanner.nextLine().trim();

            if (selectedCategory.equalsIgnoreCase("це все!")) {
                break;
            }

            if (!categories.contains(selectedCategory)) {
                System.out.println("Такої категорії не існує.");
                continue;
            }

            // Виведення страв із вибраної категорії
            System.out.println("Страви в категорії " + selectedCategory + ":");
            List<FoodItem> itemsInCategory = selectedRestaurant.getMenuItemsByCategory(selectedCategory);

            for (FoodItem item : itemsInCategory) {
                System.out.println(item.getName() + " - " + item.getPrice() + " ₴");
            }

            // Вибір страви
            System.out.println("Оберіть страву або напишіть 'назад' для повернення до вибору категорії:");
            String selectedItemName = scanner.nextLine().trim();

            if (selectedItemName.equalsIgnoreCase("назад")) {
                continue;
            }

            boolean found = false;
            for (MenuItem item : itemsInCategory) {
                if (item.getName().equalsIgnoreCase(selectedItemName)) {
                    totalSum += item.getPrice();
                    System.out.println("Додано до замовлення: " + item.getName() + " - " + item.getPrice() + " ₴");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Страву не знайдено в обраній категорії.");
            }
        }

        // Виведення загальної суми
        System.out.println("Загальна сума до оплати: " + totalSum + " ₴");
    }
}
