package com.hackajob.phonebook.phonebookdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contacts {

    private String name;

    @JsonProperty("phone_number")
    private String phoneNumber;

    private String address;

}
