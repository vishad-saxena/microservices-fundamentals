package com.user.service;

import com.user.entity.User;

import java.util.Optional;

public interface UserService {
	public Optional<User> getUser(Long userId);
	public void saveUser(User user);

}
