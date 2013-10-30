import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.toohightoplay.vu.mif.ot2.specification.DomesticAnimalSpecification;
import com.toohightoplay.vu.mif.ot2.specification.WildAnimalSpecification;

/**
 * @author TooHighToPlay
 * 
 */
public class SpecificationTest {

	@Test
	public void wildAnimalSpecificationIsEqual() {
		WildAnimalSpecification wild1 = new WildAnimalSpecification("tiger",
				"roar", 4);
		WildAnimalSpecification wild2 = new WildAnimalSpecification("tiger",
				"roar", 4);

		assertEquals(wild1.equals(wild2), true);
		assertEquals(wild2.equals(wild1), true);
	}

	@Test
	public void domesticAnimalSpecificationIsEqual() {
		DomesticAnimalSpecification domestic1 = new DomesticAnimalSpecification(
				"bird", "roar", 1);
		DomesticAnimalSpecification domestic2 = new DomesticAnimalSpecification(
				"bird", "roar", 1);

		assertEquals(domestic1.equals(domestic2), true);
		assertEquals(domestic2.equals(domestic1), true);
	}

	@Test
	public void doesNotEqualNull() {
		DomesticAnimalSpecification domestic1 = new DomesticAnimalSpecification(
				"bird", "roar", 1);

		assertEquals(domestic1.equals(null), false);
	}

	@Test
	public void domesticAndWildDoesNotMatch() {
		WildAnimalSpecification wild1 = new WildAnimalSpecification("tiger",
				"roar", 4);
		DomesticAnimalSpecification domestic1 = new DomesticAnimalSpecification(
				"bird", "roar", 1);

		assertEquals(domestic1.equals(wild1), false);
	}
}
