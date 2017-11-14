package mum.edu.repository.impl;

import java.util.List;

import mum.edu.data.Database;
import mum.edu.domain.User;
import mum.edu.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	Database data;

	public List<User> getAll() {
		return (List<User>) data.users.values();
	}

	public User findByName(String name) {
		User user = data.users.get(name);

		return user;
	}

}
