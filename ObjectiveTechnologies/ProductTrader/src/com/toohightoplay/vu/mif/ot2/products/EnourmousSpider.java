package com.toohightoplay.vu.mif.ot2.products;
/**
 * @author TooHighToPlay
 * 
 */
public class EnourmousSpider extends WildAnimal {

	protected final int legsCount;

	protected final boolean makesNetwork;

	private static final String THREATENING_MOTO = "Ppttssss";

	public EnourmousSpider(int legsCount, boolean makesNetwork) {
		this.legsCount = legsCount;
		this.makesNetwork = makesNetwork;
	}

	@Override
	public void scare() {
		System.out.println(THREATENING_MOTO + "!!!");
	}

	public void attack() {
		String attack = getAttackPhrase();
		System.out.println(attack);
	}

	@Override
	public WildAnimal deepClone() {

		return new EnourmousSpider(legsCount, makesNetwork);
	}

	@Override
	public WildAnimal createFromString(String string) {

		String[] valueKeyPairs = string.trim().split(";");
		return new EnourmousSpider(Integer.parseInt(valueKeyPairs[0]),
				Boolean.parseBoolean(valueKeyPairs[1]));
	}

	private String getAttackPhrase() {
		String attack = String.format("Spider with %s legs attacks his victim",
				legsCount);
		if (makesNetwork) {
			return attack + " and fold the opponent into his own network.";
		} else {
			return attack + ".";
		}
	}

}
