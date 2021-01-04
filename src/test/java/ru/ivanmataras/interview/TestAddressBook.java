package ru.ivanmataras.interview;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestAddressBook {

    @Test
    @Order(1)
    public void testAddAddressAndLookupAddress() {

        Contact contact1 = new Contact("Contact1", "12");
        Contact contact2 = new Contact("Contact2", "123");

        AddressBookI addressBook1 = new AddressBook();
        addressBook1.add(contact1);
        addressBook1.add(contact2);

        List<Contact> addressBookSearchResultList1 = addressBook1.lookup("Contact");
        List<Contact> addressBookSearchResultList2 = addressBook1.lookup("Contact1");

        assertEquals(2, addressBookSearchResultList1.size());
        assertEquals(1, addressBookSearchResultList2.size());

    }

}