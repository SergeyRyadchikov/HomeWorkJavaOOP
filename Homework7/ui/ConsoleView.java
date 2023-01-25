package ui;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import data.ContactMain;

public class ConsoleView implements View {

    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in);
    }

    @Override
    public String getAddress() {
        System.out.println("Address: ");
        return in.next();
    }

    @Override
    public Map<String, String> getCommunicationMethods() {
        System.out.println("CommunicationMethods: ");
        return null;
    }

    @Override
    public String getCompanyName() {
        System.out.println("CompanyName: ");
        return null;
    }

    @Override
    public String getName() {
        System.out.println("Name");
        return in.next();
    }

    @Override
    public String getOccupation() {
        System.out.println("Occupation: ");
        return in.next();
    }

    @Override
    public String setAddress() {
        System.out.println("Address");
        return in.next();

    }

    @Override
    public String setCompanyName() {
        System.out.println("Company Name:");
        return in.next();

    }

    @Override
    public String setName() {
        System.out.println("Name:");
        return in.next();

    }

    @Override
    public String setKey() {
        System.out.println("Communication method: ");
        return in.next();
    }

    @Override
    public String setValue() {
        System.out.println("Contact: ");
        return in.next();


    }

    @Override
    public String setOccupation() {
        System.out.println("Occupation");
        return in.next();

    }

    public void printMetod(List<ContactMain> cMain) {
        for (ContactMain item : cMain) {
            System.out.println(item);
        }
    }

    public Integer getIndex() {
        System.out.println("Chose contact");
        return in.nextInt() - 1;
    }

    public void numberedList(List<ContactMain> list){
        for (int i = 0; i < list.size(); i++){
            System.out.printf("%s. %s\n", i + 1, list.get(i));
        }
    }

};