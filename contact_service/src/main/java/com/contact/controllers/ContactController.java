package com.contact.controllers;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService service;

//    @GetMapping("/user/{userId}")
//    public Optional<Contact> getContact(@PathVariable("userId") Long userId){
//      return service.getContact(userId);
//    }
    @GetMapping("/user/{userId}")
    public List<Contact> getAllContact(@PathVariable("userId") Long userId){
      return service.getAllContacts(userId);
    }
    @PostMapping("/addContact")
    public void saveContact(@RequestBody Contact contact){
        service.addContact(contact);
    }
}
