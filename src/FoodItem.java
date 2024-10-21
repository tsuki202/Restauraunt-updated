// Клас для конкретних елементів меню
class FoodItem extends MenuItem {

    public FoodItem(String name, String category, int price) {
        super(name, category, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Назва страви: " + getName() + ", Категорія: " + getCategory() + ", Ціна: " + getPrice());
    }
}
