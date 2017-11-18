package com.hackajob.phonebook.phonebookdemo.service;

import com.hackajob.phonebook.phonebookdemo.model.Contacts;

import java.util.List;

public interface ContactsService {

    List<Contacts> getAllContacts(String uri) throws Exception;
}