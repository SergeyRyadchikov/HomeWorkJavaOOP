package HomeWork1;

public class Drinks {
    protected String name;
    protected String type;
    protected int volume;
    protected int temperature;

    public Drinks(String name, String type, int volume, int temperature) {
        this.name = name;
        this.type = type;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %d", name, type, volume, temperature);
    }
}