package ru.ivanmataras.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook implements AddressBookI {

    private List<Contact> addressBookList = new ArrayList<Contact>();

    public AddressBook() {
    }

    @Override
    public synchronized List<Contact> lookup(String namePrefix) {

        List<Contact> resultAddressBookList = new ArrayList<Contact>();
        Iterator<Contact> addressBookListIterator = addressBookList.iterator();

        while (addressBookListIterator.hasNext()) {
            Contact contact = addressBookListIterator.next();
            String name = contact.getName();
            boolean checkResult = name.startsWith(namePrefix);
            if (checkResult) {
                resultAddressBookList.add(contact);
            }
        }
        return resultAddressBookList;
    }

    @Override
    public synchronized void add(Contact contact) {
        addressBookList.add(contact);
    }

}