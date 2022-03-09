package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {

	public Optional<Contact> getContact(Long userId);
	public List<Contact> getAllContacts(Long userId);
	public void addContact(Contact contact);
}
