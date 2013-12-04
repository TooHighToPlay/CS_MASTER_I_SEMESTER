package guest;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String fullAddress;
	
	public Address(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	/**
	 * @return the fullAddress
	 */
	public String getFullAddress() {
		return fullAddress;
	}

	/**
	 * @param fullAddress the fullAddress to set
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	
	@Override
	public String toString() {
		return "Adress = " + fullAddress + " .";
	}
}
