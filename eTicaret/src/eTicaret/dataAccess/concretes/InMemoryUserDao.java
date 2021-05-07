package eTicaret.dataAccess.concretes; 
import java.util.List;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	 

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
		return null;
	}

	@Override
	public User getLogin(String email, String password) {
		 
		return null;
	}

}
