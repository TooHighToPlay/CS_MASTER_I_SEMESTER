/**
 * @author TooHighToPlay
 * 
 */
public class SuperPower implements AbleToDeepCloneItself<SuperPower> {

	private String superPowerName;

	public SuperPower(String superPowerName) {
		this.superPowerName = superPowerName;
	}

	public void setUniqueSense(String superPowerName) {
		this.superPowerName = superPowerName;
	}

	public String getUniqueSense() {
		return superPowerName;
	}

	@Override
	public SuperPower deepClone() {

		return new SuperPower(superPowerName);
	}

}
