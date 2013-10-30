package com.toohightoplay.vu.mif.ot2.specification;

/**
 * @author TooHighToPlay
 * 
 */
public class DomesticAnimalSpecification implements Specification {

	private final String species;

	private final String role;

	private final int eggsCount;

	public DomesticAnimalSpecification(String species, String role,
			int eggsCount) {
		this.species = species;
		this.role = role;
		this.eggsCount = eggsCount;
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

		return species.equalsIgnoreCase(((DomesticAnimalSpecification) obj)
				.getSpecies())
				&& role.equalsIgnoreCase(((DomesticAnimalSpecification) obj)
						.getRole())
				&& eggsCount == ((DomesticAnimalSpecification) obj)
						.getEggsCount();
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

	/**
	 * @return the eggsCount
	 */
	public int getEggsCount() {
		return eggsCount;
	}

}
