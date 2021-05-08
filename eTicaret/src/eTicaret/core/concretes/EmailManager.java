package eTicaret.core.concretes;

import eTicaret.core.abstracts.EmailService;

public class EmailManager implements EmailService  {

	@Override
	public void mailSend(String message) {
		System.out.println("Doðrulama için linke týklayýnýz //https://mail.google.com/mail/u/0/#inbox// :" +message);
		
		 
	}

	@Override
	public boolean isVerified(int sayi) {
		 if(sayi==1) {
			 System.out.println("E-posta adresiniz baþarýyla doðrulandý.");
			 return true;
		 }
		  
		return false;
	}
 
	
	}
 