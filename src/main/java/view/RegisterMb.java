package view;

import javax.inject.Inject;
import javax.inject.Named;

import controller.UserController;
import model.User;

@Named
public class RegisterMb {

	@Inject
	private UserController userCntr;

	private String username;
	private String password;
	
	public String register(){
		User user = new User(username, password);
		userCntr.register(user);
		return "index";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}
