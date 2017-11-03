package mum.edu.controller;

import mum.edu.domain.User;
import mum.edu.service.AdviceService;
import mum.edu.service.UserService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Servlet implementation class AuthenticationServlet
 */
@Controller
@SessionAttributes({ "Leonardo" })
public class LoginController {

	@Autowired
	UserService userService;
	@Autowired
	AdviceService adviceService;

	/**
	 * Landing page method - Login facility
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String Login(Model model) {
		Map<Integer, String> roasts = adviceService.getAllRoasts();
		model.addAttribute("roasts", roasts);

		return "login";

	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String Authenticate(User loginUser, Model model) {

		User user = userService.findByName(loginUser.getName());

		if (user == null || !user.getPassword().equals(loginUser.getPassword())) {

			throw new RuntimeException("Username or Password is invalid");
		}

		model.addAttribute("Leonardo", user.getName());

		return "LoginSuccessful";
		// return "redirect:advice";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logOut(Model model, SessionStatus status) {

		status.setComplete();

		return "redirect:/login";

	}

}
