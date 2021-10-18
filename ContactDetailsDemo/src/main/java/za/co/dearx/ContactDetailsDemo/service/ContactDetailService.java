package za.co.dearx.ContactDetailsDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import za.co.dearx.ContactDetailsDemo.dto.ContactDetailDTO;

@Service
public class ContactDetailService {
	
	public ContactDetailService() {
		// TODO Auto-generated constructor stub
	};

	public ContactDetailDTO getContactDetail(int id) {
		return new ContactDetailDTO(id);
	}
}
