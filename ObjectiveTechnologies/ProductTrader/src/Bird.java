/**
 * @author TooHighToPlay
 * 
 */
public class Bird extends DomesticAnimal {

	protected final int eggsPerLay;

	protected final SuperPower superPower;

	public Bird(int legsCount, int eggsPerLay, SuperPower superPower) {
		this.legsCount = legsCount;
		this.eggsPerLay = eggsPerLay;
		this.superPower = superPower;
	}

	@Override
	public DomesticAnimal deepClone() {

		return new Bird(legsCount, eggsPerLay, superPower.deepClone());
	}

	@Override
	public void beCute() {
		System.out.println(toString() + " and starts to be cute.");
	}

	@Override
	public String toString() {

		return "Bird with " + legsCount + " lays " + eggsPerLay + " egg(s)";
	}

	public void specialPower() {
		System.out.println("Bird's special super power is " + superPower);
	}

	@Override
	public DomesticAnimal createFromString(String string) {

		String[] valueKeyPairs = string.trim().split(";");
		return new Bird(Integer.parseInt(valueKeyPairs[0]),
				Integer.parseInt(valueKeyPairs[1]), new SuperPower(
						valueKeyPairs[2]));
	}
}
