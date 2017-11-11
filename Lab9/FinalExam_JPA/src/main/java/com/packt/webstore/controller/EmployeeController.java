package com.packt.webstore.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.service.impl.EmployeeService;


@Controller
//@RequestMapping({"/employees"})
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
 
	
 	@RequestMapping(value={"","/list"})
	public String listEmployees(Model model) {
        model.addAttribute("employees",employeeService.getAllEmployee());
 		
 		return "employees";
	}
	
  	@RequestMapping("/employee/{number}")
	public String getEmployeeByNumber(Model model, @PathVariable("number")int number) {

  		// Replace
  		Employee employee = employeeService.findEmployeeByEmployeeNumber(number);
  		System.out.println("employe===>"+employee.getFirstName());
  		List<Employee>employees=new ArrayList<Employee>();
  		 employees.add(employee);
  		
  		model.addAttribute("employees",employees);
		return "employees";
	}

	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee,Principal principal, Model model) {
		String loggedInUserName = principal.getName();
		model.addAttribute("user", loggedInUserName);
	   return "addEmployee";
	}
	   
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String processAddNewEmployee(@ModelAttribute("newEmployee") Employee employeeToBeAdded) {
		
		
		employeeService.saveEmployee(employeeToBeAdded);
		
	   	return "redirect:/list";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {

		return "login";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {

		model.addAttribute("message",
				"You have successfully logged off from application !");
		return "logout";

	}

	@RequestMapping(value = "/loginError", method = RequestMethod.GET)
	public String loginError(Model model) {
		model.addAttribute("error", "true");
		return "login";

	}
 
}
