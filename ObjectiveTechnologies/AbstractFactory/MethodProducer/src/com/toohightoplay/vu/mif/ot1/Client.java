package com.toohightoplay.vu.mif.ot1;

/**
 * @author TooHighToPlay
 */
public class Client {

    public final static String ENTRANCE_CODE = "comeAtMeBro";

    public static Expertise CLIENT_LEVEL;

    public enum Expertise {

        REGULAR_USER,

        RANDOM_CHEATER,

        HACKER;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            CLIENT_LEVEL = Expertise.REGULAR_USER;
        } else if (args[0].equalsIgnoreCase(ENTRANCE_CODE)) {
            CLIENT_LEVEL = Expertise.HACKER;
        } else {
            CLIENT_LEVEL = Expertise.RANDOM_CHEATER;
        }

        switch (CLIENT_LEVEL) {
            case REGULAR_USER:
                System.out.println("Hi client! You have joined as a regular browser");
                regularMenu();
                break;
            case HACKER:
                System.out.println("Yo bro! Welcome to the club.");
                hackerMenu();
                break;
            case RANDOM_CHEATER:
                System.out.println("Hi random guy. I will let you come to our classical bar, but do not cheat again.");
                regularMenu();
                break;
            default:
                break;
        }

        System.out.println("Good bye. I hope to see you soon!");
    }

    public static void regularMenu() {

    }

    public static void hackerMenu() {

    }
}
