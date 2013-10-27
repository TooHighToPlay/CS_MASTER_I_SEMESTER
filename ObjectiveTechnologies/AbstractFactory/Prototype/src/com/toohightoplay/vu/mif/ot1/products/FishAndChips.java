package com.toohightoplay.vu.mif.ot1.products;

/**
 * @author TooHighToPlay
 */
public class FishAndChips implements Meal {

	private int FINAL_MEAL_PROPORTION = 100;

	private int fishProportion;

	private int chipsProportion;

	/**
	 * Provide fish proportion. (Chips proportion will be 100-fishProportion)
	 * 
	 * @param fishProportion
	 */
	public FishAndChips(int fishProportion) {
		this.fishProportion = fishProportion;
		this.chipsProportion = FINAL_MEAL_PROPORTION - fishProportion;
	}

	@Override
	public void eat() {
		System.out.println("Eating like in London pub.");
	}

	@Override
	public Meal clone() {
		return new FishAndChips(fishProportion);
	}

	public void specificateMeal() {
		System.out.println("This meal contains " + fishProportion
				+ "% of fish and " + chipsProportion
				+ "% of chips. Bon apetitte!");
	}
}
