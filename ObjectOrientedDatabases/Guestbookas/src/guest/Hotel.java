package guest;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
 
@Entity
public class Hotel implements Serializable {
    
	private static final long serialVersionUID = 1L;
 
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String name;
    
    @OneToMany(cascade=CascadeType.REMOVE, mappedBy="hotel", fetch=FetchType.EAGER)
    Set<Guest> guests;  
    
    public Set<Guest> getGuests() { return guests; }
    
    // Constructors:
    public Hotel() {
    }
 
    public Hotel(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void addGuest(Guest guest) {
    	guests.add(guest);
    }
 
    // String Representation:
    @Override
    public String toString() {
        return name + " with id=" + id;
    }
}