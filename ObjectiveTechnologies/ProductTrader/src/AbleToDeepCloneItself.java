/**
 * @author TooHighToPlay
 * 
 */
public interface AbleToDeepCloneItself<T> {

	/**
	 * You must make sure to call constructor and provide all relevant immutable
	 * types and prototypes(deepClones) of mutable types(must also be
	 * AbleToDeepCloneItself).
	 */
	T deepClone();
}
