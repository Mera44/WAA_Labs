package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;
@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
  public Employee findemployeeById(Long Id) {
	  
	return employeeRepository.findOne(Id);
	  
  }
  
  public void saveEmployee(Employee employee) {
	  employeeRepository.save(employee);
  }
  
  public List<Employee> getAllEmployee(){
	return (List<Employee>) employeeRepository.findAll();
  }
  
  public Employee findEmployeeByEmployeeNumber(int number) {
	  return (Employee) employeeRepository.findEmployeeByEmployeeNumber(number);
  }
}
