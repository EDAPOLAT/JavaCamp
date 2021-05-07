package eTicaret.business.concretes; 
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
import eTicaret.business.abstracts.UserService;
import eTicaret.business.abstracts.UserValidationService;
import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class UserManager implements UserService{
	
	 

	private UserDao userDao;
 
	
	public UserManager(UserDao userDao ) {
		 this.userDao=userDao;
		 
	}
	@Override
	public void add(User user) { 
		userDao.add(user);
	}
	 

	@Override
	public void delete(User user) {
		 
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
		 
	}
	@Override
	public User getLogin(String email, String password) {
		return userDao.getLogin(email, password);
	}

	 
	    
}
