package In.sp.main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api_data")
public class Controller {
	
	 @GetMapping("/showData")
	    public String showData() {
	        String data = "Hello, this is your console output!";
	        System.out.println(data);
	        System.out.println("First try for AWS");// Print data to the console
	        return "Check the console for the printed data.";
	    }

}
