/**
 * @author TooHighToPlay
 * 
 */
public abstract class DomesticAnimal implements
		AbleToDeepCloneItself<DomesticAnimal>,
		CreatableFromString<DomesticAnimal> {

	protected int legsCount;

	public abstract void beCute();

}
