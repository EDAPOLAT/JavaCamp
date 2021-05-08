package eTicaret.core.abstracts;

 

public interface EmailService {
  void mailSend(String message);
  boolean isVerified(String message);
}
