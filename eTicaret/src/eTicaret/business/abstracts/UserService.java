package eTicaret.business.abstracts;

import java.util.List;

import eTicaret.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id); 
	User getByEmail(String email);
	User getLogin(String email, String password);
	List<User> getAll();
	
}
