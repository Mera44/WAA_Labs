package mum.edu.webflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mum.edu.domain.User;
import mum.edu.service.UserService;

@Component
public class LoginControllerHelper {

	public String validateUser(User loginUser) {
		
		return "true";
	}
	
}
