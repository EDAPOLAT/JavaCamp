package eTicaret.core.concretes;

import eTicaret.core.abstracts.EmailService;

public class EmailManager implements EmailService  {

	@Override
	public void mailSend(String message) {
		System.out.println("Do�rulama i�in linke t�klay�n�z //https://mail.google.com/mail/u/0/#inbox// :" +message);
		
	}
 
	
	}
 