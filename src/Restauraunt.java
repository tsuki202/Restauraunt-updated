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

    // Додаємо елементи до меню
    public void addMenuItem(MenuItem item) {
        menu.addMenuItem(item);
    }

    // Відображення меню ресторану
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

    // Отримання назви ресторану
    public String getName() {
        return name;
    }

    // Перевірка наявності ресторану у списку
    public static void checkRestaurantExists(String restaurantName, List<Restaurant> restaurants) throws RestaurantException {
        if (restaurantName == null || restaurantName.isEmpty()) {
            throw new RestaurantException("Назва ресторану не може бути порожньою.");
        }

        boolean exists = restaurants.stream()
                .anyMatch(restaurant -> restaurant.getName().equalsIgnoreCase(restaurantName));

        if (!exists) {
            throw new RestaurantException("Ресторан '" + restaurantName + "' не знайдено.");
        }
    }

    // Перевірка наявності категорії меню
    public void checkMenuExists(String categoryName) throws RestaurantException {
        if (categoryName == null || categoryName.isEmpty()) {
            throw new RestaurantException("Назва категорії не може бути порожньою.");
        }

        if (!menu.getCategories().contains(categoryName)) {
            throw new RestaurantException("Категорія '" + categoryName + "' не існує в меню ресторану '" + name + "'.");
        }
    }
}
