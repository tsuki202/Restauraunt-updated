// Абстрактний клас для елементів меню
abstract class MenuItem {
    private String name;
    private String category;
    private int price;

    public MenuItem(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    // Абстрактний метод, який потрібно перевизначити в дочірніх класах
    public abstract void displayInfo();
}
