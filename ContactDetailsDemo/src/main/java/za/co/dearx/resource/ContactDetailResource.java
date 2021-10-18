package za.co.dearx.resource;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import za.co.dearx.dto.ContactDetailDTO;
import za.co.dearx.service.ContactDetailService;

@RestController
@RequestMapping("/api")
public class ContactDetailResource {
	
	private ContactDetailService contactDetailService;
	
	@GetMapping("/contact-detail/{id}")
	public ContactDetailDTO getAllContactDetail(@RequestParam int id){
		return contactDetailService.getContactDetail(id);
		
	}
	
	@GetMapping("/test")
	public String greeting() {
		return "Hello, please work";
	}
}
