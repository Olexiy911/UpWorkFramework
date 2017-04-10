package enteties;

import framework.utility.PropertyLoader;

public class UserRepo {
	public User getValidUser(){
		return User.get().setSurname(PropertyLoader.getSurname()).setName(PropertyLoader.getName()).setEmail(PropertyLoader.getEmail()).setPassword(PropertyLoader.getPass());
	}
	
	public User getValidSecondUser(){
		return User.get().setSurname(PropertyLoader.getSurnameValidSecondUser()).setName(PropertyLoader.getSurnameValidSecondUser()).setEmail(PropertyLoader.getEmailValidSecondUser()).setPassword(PropertyLoader.getPassValidSecondUser());
	}
	
	public User getInValidUser(){
		return User.get().setSurname(PropertyLoader.getInvalidSurname()).setName(PropertyLoader.getInvalidName()).setEmail(PropertyLoader.getInvalidEmail()).setPassword(PropertyLoader.getInvalidPass());
	}
}
