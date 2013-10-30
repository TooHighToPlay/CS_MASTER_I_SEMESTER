/**
 * @author TooHighToPlay
 * 
 */
public class MightyGoose extends Bird {

	private static final String MIGHTY_GOOSE = "Mighty Goose";

	private final String specialWeapon;

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

	public void specialAttack() {
		System.out.println(MIGHTY_GOOSE + " attacks his opponent with "
				+ specialWeapon + ".");
	}

}
