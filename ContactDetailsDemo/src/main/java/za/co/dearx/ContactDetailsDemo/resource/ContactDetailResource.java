package za.co.dearx.ContactDetailsDemo.resource;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactDetailResource {
	
	@GetMapping("/success")
	public ResponseEntity<String> success() {
		return ResponseEntity.ok("Successful response");
	}
}
