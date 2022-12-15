package HomeWork1;

// import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * VendingMashine
 */

public class VendingMashine {
    private boolean mode;

    private Map<Integer, Object> products;

    public VendingMashine(Map<Integer, Object> products) {
        this.products = products;
    }

    public void onOff() {
        if (!isMode()) {
            System.out.println("Загрузка машины с напитками...");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Готов к работе!");
            mode = true;
        } else {
            System.out.println("Выключение...");
            mode = false;
        }
    }

    public String userChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------");
        for (Map.Entry<Integer, Object> entry : getProducts().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("Введите 'off' - для выключения");
        System.out.println("-----------------------");
        System.out.println("Выберете напиток: ");
        String number = scanner.nextLine();
        return number;
    }

    public void choiceOptions() {
        onOff();
        while (isMode()) {
            switch (userChoice()) {
                case "1":
                    System.out.println("-----------------------\n");
                    System.out.println("Ваш заказ --> " + getProducts().get(1) + "\n");
                    break;

                case "2":
                    System.out.println("-----------------------\n");
                    System.out.println("Ваш заказ --> " + getProducts().get(2) + "\n");
                    break;

                case "3":
                    System.out.println("-----------------------\n");
                    System.out.println("Ваш заказ --> " + getProducts().get(3) + "\n");
                    break;

                case "4":
                    System.out.println("-----------------------\n");
                    System.out.println("Ваш заказ --> " + getProducts().get(4) + "\n");
                    break;

                case "5":
                    System.out.println("-----------------------\n");
                    System.out.println("Ваш заказ --> " + getProducts().get(5) + "\n");
                    break;

                case "6":
                    System.out.println("-----------------------\n");
                    System.out.println("Ваш заказ --> " + getProducts().get(6) + "\n");
                    break;
                case "7":
                    System.out.println("-----------------------\n");
                    System.out.println("Ваш заказ --> " + getProducts().get(7) + "\n");
                    break;
                case "off":
                    System.out.println("-----------------------\n");
                    onOff();
                    break;

                default:
                    System.out.println("-----------------------\n");
                    System.out.println("Введите цифру от 1 до 7 или 'off' для выключения!");
                    break;
            }
        }

    }

    public boolean isMode() {
        return mode;
    }

    public Map<Integer, Object> getProducts() {
        return products;
    }

}
