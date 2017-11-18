package com.hackajob.phonebook.phonebookdemo.controller;

import com.hackajob.phonebook.phonebookdemo.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PhonebookController {

    @Value("${phonebook.api}")
    private String phonebookApi;

    @Autowired
    private ContactsService contactsService;

    @RequestMapping("/phonebook")
    @ResponseBody
    public String getPhoneBookContacts() throws Exception {
        System.out.println(contactsService.getAllContacts(phonebookApi));
        return "Hello World";
    }
}
