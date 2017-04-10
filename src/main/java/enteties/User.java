package enteties;

public class User {
		private String surname;
	    private String name;
	    private String email;
	    private String password;
	    private User() {
	    }

	    public static User get() {
	        return new User();
	    }
	    
	    public User setSurname(String surname){
	    	this.surname = surname;
	    	return this;
	    }

	    public User setName(String name) {
	        this.name = name;
	        return this;
	    }

	    public User setEmail(String email) {
	        this.email = email;
	        return this;
	    }

	    public User setPassword(String password) {
	        this.password = password;
	        return this;
	    }
	    
	    public User build() {
	        return this;
	    }

	    // - - - - - - - - - -

	    public String getSurname() {
	    	return surname;
	    }
	    
	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getPassword() {
	        return password;
	    }

}
