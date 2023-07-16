// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// import java.util.ArrayList;
class laptop {
    int id;
    String nameLaptop;
    String operSystem;
    int amountRAM;
    int price;
    String color;
    String model;

    public laptop(int id, String nameLaptop, String operSystem, int amountRAM, int price, String color, String model) {
        this.id = id;
        this.nameLaptop = nameLaptop;
        this.operSystem = operSystem;
        this.amountRAM = amountRAM;
        this.price = price;
        this.color = color;
        this.model = model;
    }

    // public ArrayList<String> propetis() {
    //     ArrayList<String> list = new ArrayList<>();
    //     list.add("amountRAM");
    //     list.add("operSystem");
    //     list.add("price");
    //     list.add("model");
    // }

    public int getID() {
        return id;
    }

    public String getNameLaptop() {
        return nameLaptop;
    }

    public String getOperSystem() {
        return operSystem;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}

public class Seminar6 {
    public static void main(String[] args) {
        laptop lp1 = new laptop(1, "Notebook1", "Windows10", 80000, 50000, "black", "Lenovo");
        laptop lp2 = new laptop(2, "Notebook2", "Windows10", 85000, 60000, "black", "Asus");
        laptop lp3 = new laptop(3, "Notebook3", "Linux", 80000, 55000, "grey", "HP");
        laptop lp4 = new laptop(4, "Notebook4", "Windows10", 90000, 60000, "white", "HP");
        System.out.println(lp1.getColor());
    }

}
