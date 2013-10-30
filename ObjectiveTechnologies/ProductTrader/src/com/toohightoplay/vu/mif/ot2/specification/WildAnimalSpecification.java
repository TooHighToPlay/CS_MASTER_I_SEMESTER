package com.toohightoplay.vu.mif.ot2.specification;

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

		return species.equalsIgnoreCase(((WildAnimalSpecification) obj)
				.getSpecies())
				&& scaryPhrase.equalsIgnoreCase(((WildAnimalSpecification) obj)
						.getScaryPhrase())
				&& legs == ((WildAnimalSpecification) obj).getLegs();
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
