package com.contact.service;

import com.contact.dao.ContactRepository;
import com.contact.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService{

//    need to get data from database
//    but for now we are creating our own data

    @Autowired
    ContactRepository repository;

//    List<Contact> list= Arrays.asList(
//            new Contact(1L,"vishad@gmail.com","vishad",1131L),
//            new Contact(5L,"chunnu@gmail.com","chunnu",1131L),
//            new Contact(2L,"vishesh@gmail.com","vishesh",1132L),
//            new Contact(3L,"devarshi@gmail.com","devarshi",1133L),
//            new Contact(4L,"honey@gmail.com","honey",1134L)
//);
    @Override
    public Optional<Contact> getContact(Long userId) {
        return repository.findById(userId);
    }
    @Override
    public List<Contact> getAllContacts(Long userId) {
        return repository.findAllByUserId(userId);
    }

    @Override
    public void addContact(Contact contact) {
        repository.save(contact);
    }
}
