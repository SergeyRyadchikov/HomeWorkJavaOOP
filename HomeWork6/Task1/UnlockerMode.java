package Task1;

public class UnlockerMode implements UnlockerBase {

    private int mode; // режим

    public void setMode(int mode) {
        this.mode = mode;
    }

    @Override
    public void confirm() {
        // TODO Auto-generated method stub
        System.out.println("Разблокировка Mode");
    }

}