package In.sp.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	 @GetMapping("/showData")
	    public String showData() {
	        String data = "Hello, this is your console output!";
	        System.out.println(data); // Print data to the console
	        System.out.println("First try for aws...");
	        return "Check the console for the printed data.";
	    }

}
