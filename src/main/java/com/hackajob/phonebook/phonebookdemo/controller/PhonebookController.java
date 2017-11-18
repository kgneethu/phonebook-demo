package com.hackajob.phonebook.phonebookdemo.controller;

import com.hackajob.phonebook.phonebookdemo.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhonebookController {

    @Value("${phonebook.api}")
    private String phonebookApi;

    @Autowired
    private ContactsService contactsService;

    @RequestMapping(value = "/phonebook", method = RequestMethod.GET)
    public String getPhoneBookContacts(ModelMap modelMap) throws Exception {
        modelMap.put("phoneBook", contactsService.getAllContacts(phonebookApi));
        return "phoneBook";
    }

}
