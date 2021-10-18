package za.co.dearx.service;

import java.util.List;

import org.springframework.stereotype.Service;

import za.co.dearx.dto.ContactDetailDTO;

@Service
public class ContactDetailService {
	
	public ContactDetailService() {
		// TODO Auto-generated constructor stub
	};

//	public List<ContactDetailDTO> getAllContactDetails(){
//		return 
//	}
//	
	public ContactDetailDTO getContactDetail(int id) {
		return new ContactDetailDTO(id);
	}
}
