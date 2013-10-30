import java.util.Hashtable;

/**
 * Product trader
 * 
 * @author TooHighToPlay
 * 
 */
public abstract class ProductTrader<S, T> {

	protected Hashtable<S, T> map;

	private final String initializationFileName;

	public ProductTrader(String initializationFileName) {
		this.initializationFileName = initializationFileName;
		map = new Hashtable<S, T>();
		initSpecificationToProductMap();
	}

	private static <T, V> Hashtable<Specification, T> initSpecificationToProductMap() {

		// XXX: add smth

		return null;
	}
}
