package com.hackajob.phonebook.phonebookdemo.service;

import com.hackajob.phonebook.phonebookdemo.model.Contacts;
import com.hackajob.phonebook.phonebookdemo.model.ContactsInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContactServiceImpl implements ContactsService {

    @Override
    public List<Contacts> getAllContacts(final String uri) throws Exception {
        return new RestTemplate().getForObject(uri, ContactsInfo.class).getContactsList();
    }

    @Override
    public List<Contacts> getSearchContacts(final String uri, final String name) throws Exception {
        List<Contacts> contacts = getAllContacts(uri);
        return contacts.stream()
                .filter(contact -> contact.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

}
