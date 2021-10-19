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

	/*
	*Error 400 part of the 4XX request 
	*Curl test: curl  http://localhost:8080/api/badRequest -v
	*/
	@GetMapping("/badRequest")
	public ResponseEntity<String> badRequest() {
		return ResponseEntity.badRequest().body("Bad Request response");
	}
}
