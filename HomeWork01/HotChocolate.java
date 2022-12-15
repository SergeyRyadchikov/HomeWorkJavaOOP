package HomeWork1;

public class HotChocolate extends Drinks {
    // если нужны доп переменные то она будут private


    public HotChocolate(String name,  String type, int volume, int temperature) {
        super(name, type, volume, temperature);
            
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s, %s, %d, %d", name, type, volume, temperature);
    }
}
