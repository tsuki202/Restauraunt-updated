import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Клас Menu, що реалізує інтерфейс
class Menu implements MenuActions {
    private List<MenuItem> menu = new ArrayList<>();

    @Override
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    @Override
    public List<MenuItem> getMenu() {
        return menu;
    }

    // Отримання унікальних категорій з меню
    public List<String> getCategories() {
        return menu.stream()
                .map(MenuItem::getCategory)
                .distinct()
                .collect(Collectors.toList());
    }

    // Отримання страв із вибраної категорії
    public List<FoodItem> getItemsByCategory(String category) {
        return menu.stream()
                .filter(item -> item.getCategory().equalsIgnoreCase(category))
                .map(item -> (FoodItem) item)
                .collect(Collectors.toList());
    }

    // Метод для виведення всіх елементів меню
    public void displayMenu() {
        for (MenuItem item : menu) {
            item.displayInfo();
        }
    }
}
