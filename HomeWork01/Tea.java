package HomeWork1;

public class Tea extends Drinks {
    // если нужны доп переменные то она будут private
    private String taste;

    public Tea(String name, String type, String taste, int volume, int temperature) {
        super(name, type, volume, temperature);
        this.taste = taste;

    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d, %d", name, type, taste, volume, temperature);
    }
}
