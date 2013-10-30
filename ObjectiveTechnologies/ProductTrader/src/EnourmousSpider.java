/**
 * @author TooHighToPlay
 * 
 */
public class EnourmousSpider extends WildAnimal {

	private static final String THREATENING_MOTO = "Ppttssss";

	private final int legsCount;

	private final boolean makesNetwork;

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
