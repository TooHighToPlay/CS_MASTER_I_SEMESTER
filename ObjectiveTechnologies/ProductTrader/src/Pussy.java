/**
 * @author TooHighToPlay
 * 
 */
public class Pussy extends DomesticAnimal {

	private final String specialPhrase;

	public Pussy(int legsCount, String specialPhrase) {
		this.legsCount = legsCount;
		this.specialPhrase = specialPhrase;
	}

	@Override
	public DomesticAnimal deepClone() {

		return new Pussy(legsCount, specialPhrase);
	}

	@Override
	public void beCute() {
		System.out.println(specialPhrase + "!!!");
	}

}
