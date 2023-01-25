package ui;

import java.util.Scanner;

import service.PhoneBook;

public class App {

    public static void buttonClick() {
        PhoneBook pBook = new PhoneBook();
        ConsoleView cView = new ConsoleView();
        Presenter control = new Presenter(pBook, cView);
        Scanner in = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            System.out.println("\nMenu:");
            System.out.println("1. Check contacts");
            System.out.println("2. Search for the contact");
            System.out.println("3. Add contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Add new communication method");
            System.out.println("6. Delete communication method");
            System.out.println("7. Exit");
            System.out.println("Select the option: ");
            switch (in.next()) {
                case "1":
                    if (!pBook.getLst().isEmpty()) {
                        control.checkList(pBook.getLst());
                    } else
                        System.out.println("List is empty");
                    break;
                case "2":
                    cView.printMetod(control.search());
                    break;
                case "3":
                    System.out.println("1. Add contact");
                    System.out.println("2. Add company");
                    switch (in.next()) {
                        case "1":
                            control.addContact();
                            System.out.println("Contact was successfully added");
                            break;
                        case "2":
                            control.addCompany();
                            System.out.println("Company was successfully added");
                            break;
                        default:
                            System.out.println("Something went wrong 🙁 Make sure you choose from existing options");
                    }
                    break;
                case "4":
                    control.delContact();
                    break;
                case "5":
                    control.addCommunicationMethod();
                    break;
                case "6":
                    control.delCommunicationMethod();
                    break;
                case "7":
                    condition = false;
                    break;
                default:
                    System.out.println("Something went wrong 🙁 Make sure you choose from existing options");
            }
        }

        in.close();

    }
}
