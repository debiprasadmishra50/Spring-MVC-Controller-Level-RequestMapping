package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/applicationController")
public class ApplicationController {
	
//	@RequestMapping("/")	// Can't call index.jsp from here, called from DemoController
//	public String index() {
//		return "index";
//	}
	
	@RequestMapping("/showForm") 	// it will behave as /applicationController/showForm
	public String showForm() {
		return "showform";
	}
	
	// add new controller method to read form data
	// add data to model
	
	@RequestMapping("/processFormModelAnnotation") 	// it will behave as /applicationController/processFormModelAnnotation
	public String capitalize(@RequestParam("studentName") String theName, Model model) {
		
		// convert data to capital letters
		theName = theName.toUpperCase();
		
		// Create the message
		String result = "Hello "+theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	
}
