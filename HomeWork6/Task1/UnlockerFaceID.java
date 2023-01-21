package Task1;

public class UnlockerFaceID implements UnlockerBase {

    private String faceID; // на случай лица

    public void setFaceID(String faceID) {
        this.faceID = faceID;
    }

    @Override
    public void confirm() {
        // TODO Auto-generated method stub
        System.out.println("Разблокировщик FaceID");
    }

}
