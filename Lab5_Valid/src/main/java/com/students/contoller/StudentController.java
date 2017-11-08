package com.students.contoller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.students.domain.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String showForm(@ModelAttribute("student") Student student) {

		return "registration";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult, RedirectAttributes redirectAttribute ) {
			if(bindingResult.hasErrors()) {
				return "registration";
			}
			
			redirectAttribute.addFlashAttribute(student);
			
		return "redirect:/success";

	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String successForm() {

		return "success";

	}

}
