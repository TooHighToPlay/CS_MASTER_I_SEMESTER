/**
 * @author TooHighToPlay
 * 
 */
public class MightyGoose extends Bird {

	protected final String specialWeapon;

	private static final String MIGHTY_GOOSE = "Mighty Goose";

	public MightyGoose(int legsCount, int eggsPerLay, SuperPower superPower,
			String specialWeapon) {
		super(legsCount, eggsPerLay, superPower);
		this.specialWeapon = specialWeapon;
	}

	@Override
	public DomesticAnimal deepClone() {

		return new MightyGoose(legsCount, eggsPerLay, superPower.deepClone(),
				specialWeapon);
	}

	@Override
	public DomesticAnimal createFromString(String string) {

		String[] valueKeyPairs = string.trim().split(";");
		return new MightyGoose(Integer.parseInt(valueKeyPairs[0]),
				Integer.parseInt(valueKeyPairs[1]), new SuperPower(
						valueKeyPairs[2]), valueKeyPairs[3]);
	}

	public void specialAttack() {
		System.out.println(MIGHTY_GOOSE + " attacks his opponent with "
				+ specialWeapon + ".");
	}

}
