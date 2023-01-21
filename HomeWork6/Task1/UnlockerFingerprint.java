package Task1;

public class UnlockerFingerprint implements UnlockerBase {

    private String fingerprint; // на случай отпечатка пальца

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public void confirm() {
        // TODO Auto-generated method stub
        System.out.println("Разблокировщик Fingerprint");
    }

}
