package enteties;

import framework.utility.PropertyLoader;

public class UserRepo {
	public User getValidUser(){
		return User.get().setSurName(PropertyLoader.getSurName()).setEmail(PropertyLoader.getEmail()).setName(PropertyLoader.getName()).setPassword(PropertyLoader.getPass());
	}
	
	public User getInValidUser(){
		return User.get().setEmail(PropertyLoader.getInvalidEmail()).setName(PropertyLoader.getInvalidName()).setPassword(PropertyLoader.getInvalidPass());
	}
	
	
}
