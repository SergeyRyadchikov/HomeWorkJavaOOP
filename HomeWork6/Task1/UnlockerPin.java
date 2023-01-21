package Task1;

public class UnlockerPin implements UnlockerBase {

    private int pin; // на случай пин-кода

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public void confirm() {
        // TODO Auto-generated method stub
        System.out.println("Разблокировщик PIN");
    }

}
