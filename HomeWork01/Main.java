package HomeWork1;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Coffee latte350 = new Coffee("Латте", "С молоком", 350, 70);
        Coffee latte450 = new Coffee("Латте", "С молоком", 450, 70);
        Coffee espresso = new Coffee("Эспрессо", "Черный", 200, 80);
        Coffee mokkachino = new Coffee("mokkachino", "cream", 250, 60);
        Tea ulun = new Tea("Улун", "Зеленый", "Молочный", 500, 65);
        Tea blackTea = new Tea("Индийский чай", "Черный", "С лимоном", 300, 70);
        HotChocolate nesquik = new HotChocolate("Шоколад", "Двойной", 350, 50);

        Map<Integer, Object> products = new HashMap<>();
        products.put(1, latte350);
        products.put(2, latte450);
        products.put(3, espresso);
        products.put(4, mokkachino);
        products.put(5, ulun);
        products.put(6, blackTea);
        products.put(7, nesquik);

        VendingMashine automat = new VendingMashine(products);
        
        automat.choiceOptions();


    }
    



}
