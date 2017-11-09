package com.packt.webstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.service.impl.EmployeeService;
  

 
@Controller
@RequestMapping({"/employees"})
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
 
	
 	@RequestMapping(value={"","/list"})
	public String listEmployees(Model model) {
        model.addAttribute("employees",employeeService.getAllEmployee());
 		
 		return "employees";
	}
	
  	@RequestMapping("/employee/{id}")
	public String getEmployeeByNumber(Model model, @RequestParam("id") Long employeeId) {

  		// Replace
  		Employee employee = (Employee)employeeService.findemployeeById(employeeId);
  		
  		model.addAttribute("employee", employee);
		return "employee";
	}

	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee) {
	   return "addEmployee";
	}
	   
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewEmployee(@ModelAttribute("newEmployee") Employee employeeToBeAdded) {
		employeeService.saveEmployee(employeeToBeAdded);
		
	   	return "redirect:/employees/list";
	}
	
 
}
