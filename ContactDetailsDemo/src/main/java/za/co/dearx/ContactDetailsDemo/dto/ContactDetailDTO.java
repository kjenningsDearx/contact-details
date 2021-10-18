package za.co.dearx.ContactDetailsDemo.dto;

public class ContactDetailDTO {

	public ContactDetailDTO(int id) {
		this.id = id;
		firstName = "David";
		lastName = "Smith";
		cellPhoneNumber = "0767947721";
		emailAddress = "dSmith@gmail.com";
		physicalAddressLine1 = "73 Baumont Street";
		physicalAddressLine2 = "Claremont";
		physicalAddressLine3 = "Cape Town";
		postalCode = "7976";
	}

	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String cellPhoneNumber;
	
	private String emailAddress;
	
	private String physicalAddressLine1;
	
	private String physicalAddressLine2;
	
	private String physicalAddressLine3;
	
	private String postalCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhysicalAddressLine1() {
		return physicalAddressLine1;
	}

	public void setPhysicalAddressLine1(String physicalAddressLine1) {
		this.physicalAddressLine1 = physicalAddressLine1;
	}

	public String getPhysicalAddressLine2() {
		return physicalAddressLine2;
	}

	public void setPhysicalAddressLine2(String physicalAddressLine2) {
		this.physicalAddressLine2 = physicalAddressLine2;
	}

	public String getPhysicalAddressLine3() {
		return physicalAddressLine3;
	}

	public void setPhysicalAddressLine3(String physicalAddressLine3) {
		this.physicalAddressLine3 = physicalAddressLine3;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ContactDetail [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", cellPhoneNumber="
				+ cellPhoneNumber + ", emailAddress=" + emailAddress + ", physicalAddressLine1=" + physicalAddressLine1
				+ ", physicalAddressLine2=" + physicalAddressLine2 + ", physicalAddressLine3=" + physicalAddressLine3
				+ ", postalCode=" + postalCode + "]";
	}
}
