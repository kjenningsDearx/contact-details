package za.co.dearx.ContactDetailsDemo.resource;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactDetailResource {
	
	@GetMapping("/test")
	public String greeting() {
		return "Hello, testing 123";
	}
}
