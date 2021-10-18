package za.co.dearx.ContactDetailsDemo.resource;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactDetailResource {
	
	@GetMapping("/test1")
	public ResponseEntity<String> greeting() {
		return ResponseEntity.ok("Working");
	}
}
