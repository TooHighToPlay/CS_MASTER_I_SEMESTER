package com.toohightoplay.vu.mif.ot2.specification;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author TooHighToPlay
 * 
 */
public class WildAnimalSpecification implements Specification {

	private final String species;

	private final String scaryPhrase;

	private final int legs;

	public WildAnimalSpecification(String species, String scaryPhrase, int legs) {
		this.species = species;
		this.scaryPhrase = scaryPhrase;
		this.legs = legs;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof WildAnimalSpecification)) {
			return false;
		}

		return new EqualsBuilder()
				// if deriving: appendSuper(super.equals(obj)).
				.append(species, ((WildAnimalSpecification) obj).getSpecies())
				.append(scaryPhrase,
						((WildAnimalSpecification) obj).getScaryPhrase())
				.append(legs, ((WildAnimalSpecification) obj).getLegs())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 31). // two random chosen prime numbers
				// if deriving: appendSuper(super.hashCode())
				append(species).append(scaryPhrase).append(legs).toHashCode();
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @return the scaryPhrase
	 */
	public String getScaryPhrase() {
		return scaryPhrase;
	}

	/**
	 * @return the legs
	 */
	public int getLegs() {
		return legs;
	}
}
