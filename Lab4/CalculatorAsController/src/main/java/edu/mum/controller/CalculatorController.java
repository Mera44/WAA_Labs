package edu.mum.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.domain.Calculator;
import edu.mum.service.CalculatorService;
 

@Controller
public class CalculatorController {
 
  @Autowired
  CalculatorService calculatorService;
  
  @RequestMapping(value={"/","/Calculator"} , method = RequestMethod.GET)
  public String inputCalc(Calculator calculator ) throws Exception {
   	  
       return  "CalculatorForm" ;    
   }
   
  @RequestMapping(value= "/Calculator" , method = RequestMethod.POST)
  public String handleCalc(Calculator calculator, Model model,RedirectAttributes redirectAttributes ) {
  
 	  
 		if (calculator.getAdd1() != null &&
			 calculator.getAdd2() != null)
		     calculatorService.add(calculator);
 
		if (calculator.getMult1() != null &&
				 calculator.getMult2() != null)
			calculatorService.mult(calculator);
		
		redirectAttributes.addFlashAttribute("calculator",calculator);
		redirectAttributes.addAttribute("greet","HelloUserhereisyourresult");
		System.out.println("result"+calculator.getSum()+"===="+calculator.getProduct());
		
		return "redirect:/result";

   }
  @RequestMapping(value={"/result"} , method = RequestMethod.GET)
  public String resultCalc() {
	  
   	  
	  return  "CalculatorView" ;    
   }
   
  
   
 
}
