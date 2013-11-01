package com.toohightoplay.vu.mif.ot2.products;

import javax.inject.Named;

/**
 * @author TooHighToPlay
 * 
 */
public class Pussy extends DomesticAnimal {

	protected final String specialPhrase;

	public Pussy(@Named("legsCount") int legsCount,
			@Named("specialPhrase") String specialPhrase) {
		this.legsCount = legsCount;
		this.specialPhrase = specialPhrase;
	}

	public DomesticAnimal deepClone() {

		return new Pussy(legsCount, specialPhrase);
	}

	@Override
	public void beCute() {
		System.out.println(specialPhrase + "!!!");
	}

	public DomesticAnimal createFromString(@Named("string") String string) {

		String[] valueKeyPairs = string.trim().split(";");
		return new Pussy(Integer.parseInt(valueKeyPairs[0]), valueKeyPairs[1]);
	}

}
