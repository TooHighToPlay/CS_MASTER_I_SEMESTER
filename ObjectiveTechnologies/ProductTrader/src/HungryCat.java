/**
 * @author TooHighToPlay
 * 
 */
public class HungryCat extends WildAnimal {

	private final String scarySound;

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

}
