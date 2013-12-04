package guest;

import javax.jdo.annotations.Embedded;
import javax.persistence.Entity;

@Entity
public class RegularGuest extends Guest {
	
	@Embedded protected Address address;
	
	public RegularGuest() {
		
	}
	
	public RegularGuest(String name, Address adress) {
		super(name);
		this.address = adress;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return super.toString() + ". " + this.address.toString();
	}
}
