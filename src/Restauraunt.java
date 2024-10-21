import java.util.ArrayList;
import java.util.List;

// Клас Restaurant, який працює з меню
class Restaurant {
    private String name;
    private Menu menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new Menu();
    }

    public void addMenuItem(MenuItem item) {
        menu.addMenuItem(item);
    }

    public void displayRestaurantMenu() {
        System.out.println("Меню ресторану: " + name);
        menu.displayMenu();
    }

    // Отримання категорій з меню ресторану
    public List<String> getCategories() {
        return menu.getCategories();
    }

    // Отримання страв із вибраної категорії
    public List<FoodItem> getMenuItemsByCategory(String category) {
        return menu.getItemsByCategory(category);
    }
}
