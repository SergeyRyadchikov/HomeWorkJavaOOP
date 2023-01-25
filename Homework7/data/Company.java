package data;

public class Company extends ContactMain {

    private String companyName;
    private String occupation;

    public String getCompanyName() {
        return companyName;
    }

    public String getOccupation() {
        return occupation;
    }

    public Company(String companyName, String name, String occupation, String address, String key, String value) {
        super(name, address, key, value);
        this.companyName = companyName;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return companyName + ", Name: " + super.name + ", occupation: " + occupation + ", Address: " + super.address
                + ", Communication methods: " + super.communicationMethods + "]";
    }

}
