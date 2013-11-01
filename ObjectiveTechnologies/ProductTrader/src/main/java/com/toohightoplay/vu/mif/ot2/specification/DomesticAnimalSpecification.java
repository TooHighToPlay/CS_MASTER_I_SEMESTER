package com.toohightoplay.vu.mif.ot2.specification;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author TooHighToPlay
 * 
 */
public class DomesticAnimalSpecification implements Specification {

	private final String species;

	private final String role;

	public DomesticAnimalSpecification(String species, String role) {
		this.species = species;
		this.role = role;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DomesticAnimalSpecification)) {
			return false;
		}

		return new EqualsBuilder()
				// if deriving: appendSuper(super.equals(obj)).
				.append(species,
						((DomesticAnimalSpecification) obj).getSpecies())
				.append(role, ((DomesticAnimalSpecification) obj).getRole())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 31). // two random chosen prime numbers
				// if deriving: appendSuper(super.hashCode())
				append(species).append(role).toHashCode();
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
}
