package HomeWork4;

public class IsEven implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer arg) {
        return arg % 2 == 0;
    }

}
