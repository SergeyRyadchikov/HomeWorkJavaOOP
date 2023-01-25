package ui;

import java.util.LinkedList;
import java.util.List;

import data.Company;
import data.ContactMain;
import service.Add;
import service.Delete;
import service.PhoneBook;
import service.Search;

public class Presenter implements Add, Delete, Search {
    private PhoneBook modelPhoneBook;
    private ConsoleView view;

    public Presenter(PhoneBook modelPhoneBook, ConsoleView view) {
        this.modelPhoneBook = modelPhoneBook;
        this.view = view;
    }

    // Посмотреть список контрагентов
    public void checkList(List<ContactMain> cMains) {
        view.printMetod(cMains);
    }

    // Найти контрагента по названию. Посмотреть подробную информацию о нём
    @Override
    public List<ContactMain> search() {
        List<ContactMain> bufList = new LinkedList<>();
        String param = view.getName();
        for (ContactMain cMain : modelPhoneBook.getLst()) {
            if (cMain.getName().equals(param)) {
                bufList.add(cMain);
            }
        }
        return bufList;

    }

    // Удалить контрагента
    @Override
    public void delContact() {
        view.numberedList(modelPhoneBook.getLst());
        int index = view.getIndex();
        modelPhoneBook.getLst().remove(index);
    }

    // Удалить способ связи
    @Override
    public void delCommunicationMethod() {
        if (!modelPhoneBook.getLst().isEmpty()) {
            view.numberedList(modelPhoneBook.getLst());
            int choseContact = view.getIndex();
            modelPhoneBook.getLst().get(choseContact).getCommunicationMethods().remove(view.setKey());
        } else
            System.out.println("List is empty");

    }

    // Добавить новый контакт
    @Override
    public void addContact() {
        modelPhoneBook.getLst().add(new ContactMain(view.setName(), view.setAddress(),
                view.setKey(), view.setValue()));

    }

    // Добавить компанию
    @Override
    public void addCompany() {
        modelPhoneBook.getLst()
                .add(new Company(view.setCompanyName(), view.setName(),
                        view.setOccupation(), view.setAddress(), view.setKey(), view.setValue()));

    }

    // Добавить способ связаться с контрагентом
    @Override
    public void addCommunicationMethod() {
        if (!modelPhoneBook.getLst().isEmpty()) {
            view.numberedList(modelPhoneBook.getLst());
            int choseContact = view.getIndex();
            modelPhoneBook.getLst().get(choseContact).getCommunicationMethods()
                    .put(view.setKey(), view.setValue());
        } else
            System.out.println("List is empty");

    }

    @Override
    public void addAddress() {
        // TODO Auto-generated method stub

    }

}
