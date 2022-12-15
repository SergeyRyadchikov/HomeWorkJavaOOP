package HomeWork1;

public class Coffee extends Drinks {
    // если нужны доп переменные то она будут private


    public Coffee(String name,  String type, int volume, int temperature) {
        super(name, type, volume, temperature);
            
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s, %s, %d %d", name, type, volume, temperature);
    }

    
}