package ru.ivanmataras.interview;

import java.util.List;

public interface AddressBookI {

    List<Contact> lookup(String namePrefix);

    void add(Contact contact);

}