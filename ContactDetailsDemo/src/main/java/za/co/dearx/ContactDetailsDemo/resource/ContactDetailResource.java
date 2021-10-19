package za.co.dearx.ContactDetailsDemo.resource;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactDetailResource {

	/*
	*Success 200
	*Curl test: curl  http://localhost:8080/success -v
	*/
	@GetMapping("/success")
	public ResponseEntity<String> success() {
		return ResponseEntity.ok("Successful response");
	}

	/*
	*Error 400 part of the 4XX request 
	*Curl test: curl  http://localhost:8080/badRequest -v
	*/
	@GetMapping("/badrequest")
	public ResponseEntity<String> badRequest() {
		return ResponseEntity.badRequest().body("Bad Request response");
	}

	/*
	*Error 404 part of the 4XX request 
	*Curl test: curl  http://localhost:8080/notfound -v
	*/
	@GetMapping("/notfound")
	public ResponseEntity<String> notFound() {
		return ResponseEntity.notFound().build();
	}
	
	/*
	*Error 500
	*Curl test: curl  http://localhost:8080/internalservererror -v
	*/
	@GetMapping("/internalservererror")
	public ResponseEntity<String> internalServerError() {
		return ResponseEntity.internalServerError().body("Unexpected Error Ocurred");
	}
}
