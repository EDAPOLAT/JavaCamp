package eTicaret.dataAccess.concretes;  
import java.util.List;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
 

	@Override
	public void add(User user) {
		System.out.println("Kullan?c? ba?ar?yla eklendi  ");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan?c? ba?ar?yla silindi  ");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan?c? ba?ar?yla g?ncellendi  ");
		
	}

	@Override
	public User get(int id) { 
		return null;
	}

	@Override
	public List<User> getAll() { 
		return null;
	}

	@Override
	public User getByEmail(String email) { 
		 
		return null;
	}

	 

}
