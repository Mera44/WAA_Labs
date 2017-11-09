package mum.edu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mum.edu.domain.Employee;
 
@Controller
@RequestMapping("/")
public class EmployeeController {
	
	@RequestMapping
	public String getForm (Model model) {
		return "employee";
	}
   
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public @ResponseBody Employee saveForm(@Valid@RequestBody Employee employee) {
		System.out.println("====>"+employee.getFirstName());
		return employee;
	}
	
	
}
