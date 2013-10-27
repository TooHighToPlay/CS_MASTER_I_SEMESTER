package com.toohightoplay.vu.mif.ot1.products;

import java.security.SecureRandom;

/**
 * @author TooHighToPlay
 */
public class GrinbergenBeer implements Beer {

	public static final int MAX_TO_GENERATE = 100;

	private double promiles;

	private int luckyNumber;

	private Integer actualNumber = null;

	/**
	 * I would choose luckyNumber wisely. [0..100]???
	 * 
	 * @param promiles
	 * @param luckyNumber
	 */
	public GrinbergenBeer(double promiles, int luckyNumber) {
		this.promiles = promiles;
		this.luckyNumber = luckyNumber;
	}

	@Override
	public void drink() {
		System.out
				.println("I drank this Grinbergen almost as fast as Rob Ashton.");
	}

	public void drinkWithEffects() {
		System.out
				.println("I drasgsf thisss Grinbergen with an attitude. Be my paladin, be my guest, you will always be loved. Just bring me moore beer");
	}

	@Override
	public Beer clone() {

		return new GrinbergenBeer(promiles, luckyNumber);
	}

	public void tryWinLottery() {
		if (actualNumber == null) {
			SecureRandom randomGenerator = new SecureRandom();
			actualNumber = randomGenerator.nextInt(MAX_TO_GENERATE);
		}
		if (actualNumber == luckyNumber) {
			System.out
					.println("U, the Mighty Warrior of the Great Wall Of Justice please welcome a gift for you. "
							+ "Now you can code Clojure. Yes,.. it's not a dream.. If it is then dreams come true...");
		}
		System.out.println("U lost the lotterry sir. Try another time");
	}

}
