package mywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/get")
	public String post() {
		return "Welcome Docker";
	}
	

}
