package com.toohightoplay.vu.mif.ot2.products;
/**
 * @author TooHighToPlay
 * 
 */
public class HungryCat extends WildAnimal {

	protected final String scarySound;

	public HungryCat(String scarySound) {
		this.scarySound = scarySound;
	}

	@Override
	public void scare() {

		System.out.println(scarySound);
	}

	@Override
	public WildAnimal deepClone() {

		return new HungryCat(scarySound);
	}

	@Override
	public WildAnimal createFromString(String string) {

		String[] valueKeyPairs = string.trim().split(";");
		return new HungryCat(valueKeyPairs[0]);
	}

}
