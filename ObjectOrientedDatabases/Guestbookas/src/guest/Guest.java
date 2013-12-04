package guest;
 
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
 
@MappedSuperclass
public class Guest implements Serializable {
    
	private static final long serialVersionUID = 1L;
  
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String name;
    
    private Date signingDate;
 
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="HOTEL_ID", nullable=false)
    Hotel hotel;
    
    // Constructors:
    public Guest() {
    }
 
    public Guest(String name) {
        this.name = name;
        this.signingDate = new Date(System.currentTimeMillis());
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public Hotel getHotel() {
    	return this.hotel;
    }
    
    public void addHotel(Hotel hotel) {
    	this.hotel = hotel;
    }
 
    // String Representation:
    @Override
    public String toString() {
    	if (hotel != null) {
    		return name + " (signed on " + signingDate + ") in hotel " + hotel.getName() + " with id=" + id;
    	} else {
    		return name + " (signed on " + signingDate + ") without hotel and with id=" + id;
    	}
    }
}