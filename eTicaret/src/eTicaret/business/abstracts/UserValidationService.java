package eTicaret.business.abstracts;

import eTicaret.entities.concretes.User;

public interface UserValidationService {
  boolean validate(User user);
}
