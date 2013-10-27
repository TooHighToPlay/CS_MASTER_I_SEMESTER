package com.toohightoplay.vu.mif.ot1.products;

/**
 * @author TooHighToPlay
 */
public class GuinessBeer implements Beer {

	private String greetings;

    /**
     * Remember to add a greeting for our customer.
     *
     * @param greetings
     */
	public GuinessBeer(String greetings) {
		this.greetings = greetings;
	}

    @Override
    public void drink() {
        System.out.println("Gently and softly.. Sip by sip.");
    }

    /**
     * Greeting letter from you princess.
     */
    public void readGreeting() {
    	System.out.println(greetings);
    }

}
