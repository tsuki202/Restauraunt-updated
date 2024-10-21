import java.util.ArrayList;
import java.util.List;

// Клас для створення меню ресторану
public class FoodMenu {

    public static List<FoodItem> getAmadeusMenu() {
        List<FoodItem> menu = new ArrayList<>();
        menu.add(new FoodItem("Англійський сніданок", "Сніданки", 290));
        menu.add(new FoodItem("Італійський сніданок", "Сніданки", 355));
        menu.add(new FoodItem("Салат овочевий", "Сніданки", 255));
        menu.add(new FoodItem("Бургер з яловичиною", "Основне меню", 580));
        menu.add(new FoodItem("Тайський суп", "Основне меню", 470));
        menu.add(new FoodItem("Тірамісу", "Десерти", 280));
        menu.add(new FoodItem("Львівська кава", "Напої", 60));
        return menu;
    }

    public static List<FoodItem> getCelentanoMenu() {
        List<FoodItem> menu = new ArrayList<>();
        menu.add(new FoodItem("Піца Маргарита", "Піца", 200));
        menu.add(new FoodItem("Паста Карбонара", "Паста", 220));
        menu.add(new FoodItem("Салат Цезар", "Салати", 180));
        menu.add(new FoodItem("Лимонад", "Напої", 50));
        return menu;
    }

    public static List<FoodItem> get36PoMenu() {
        List<FoodItem> menu = new ArrayList<>();
        menu.add(new FoodItem("Котлета по-київськи", "Основне меню", 320));
        menu.add(new FoodItem("Борщ", "Основне меню", 150));
        menu.add(new FoodItem("Деруни", "Основне меню", 120));
        menu.add(new FoodItem("Компот", "Напої", 40));
        return menu;
    }
}
