package com.user.service;

import java.util.Optional;

import com.user.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
//	need to implement databse call and get data using dao
//	for now we are using arrayList
//	List<User> list=Arrays.asList(
//			new User(1131L, "vishad saxena", "9999"),
//			new User(1132L,"vishesh saxena","8888"),
//			new User(1133L,"devarshi saxena", "7777"),
//			new User(1134L,"honey saxena", "6666")
//			);
	

	@Override
	public Optional<User> getUser(Long userId) {
		return repository.findById(userId);
	}

	@Override
	public void saveUser(User user) {
		repository.save(user);
	}

}
