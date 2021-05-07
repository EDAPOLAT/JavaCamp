package eTicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý baþarýyla eklendi  ");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý baþarýyla silindi  ");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý baþarýyla güncellendi  ");
		
	}

	@Override
	public User get(int id) {
		System.out.println("Kullanýcý baþarýyla listelendi  ");
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("Tüm kullanýcýlar baþarýyla listelendi  ");
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if (user.getEmail() == email)
			{
				return user;
			}
		}
		
		return null;
	}

	@Override
	public User getLogin(String email, String password) {
		for(User user : users) {
			if(user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}

}
