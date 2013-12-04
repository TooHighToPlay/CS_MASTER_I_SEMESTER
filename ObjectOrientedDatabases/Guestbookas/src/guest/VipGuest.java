package guest;

import javax.persistence.AttributeOverride;
import javax.persistence.Entity;
import javax.persistence.Column;;

@Entity
@AttributeOverride(name="name", column=@Column(name="vipname"))
public class VipGuest extends Guest {
	
	private static final long serialVersionUID = 1L;
	
	private String status;
	
	public VipGuest() {
		
	}
	
	public VipGuest(String name, String status) {
		super(name);
		this.status = status;
	}
	
	@Override
	public String toString() {
		return super.toString() + ". It is Super power user (VIP)";
	}
	
}
