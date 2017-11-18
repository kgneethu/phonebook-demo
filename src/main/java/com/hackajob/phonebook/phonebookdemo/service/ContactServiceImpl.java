package com.hackajob.phonebook.phonebookdemo.service;

import com.hackajob.phonebook.phonebookdemo.model.Contacts;
import com.hackajob.phonebook.phonebookdemo.model.ContactsInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ContactServiceImpl implements ContactsService {

    @Override
    public List<Contacts> getAllContacts(String uri) throws Exception {
        return new RestTemplate().getForObject(uri, ContactsInfo.class).getContactsList();
    }
}
