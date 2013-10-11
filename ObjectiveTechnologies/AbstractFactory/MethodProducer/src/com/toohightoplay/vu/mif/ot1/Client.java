package com.toohightoplay.vu.mif.ot1;

import java.util.Scanner;

import com.toohightoplay.vu.mif.ot1.factories.Bar;
import com.toohightoplay.vu.mif.ot1.factories.ClassicalBar;
import com.toohightoplay.vu.mif.ot1.factories.ProgrammersBar;
import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.GrinbergenBeer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.Snacks;

/**
 * @author TooHighToPlay
 */
public class Client {

    public final static String ENTRANCE_CODE = "comeAtMeBro";

    public static Expertise CLIENT_LEVEL;

    public enum DRINKING_STRATEGY {
    	
    	NO_DRINK,
    	
    	SPECIAL_DRINK,
    	
    	DRINK;
    }
    
    public enum MENU_STATE {
    	
    	WAITING,
    	
    	DRINK,
    	
    	NIBBLE,
    	
    	EAT,
    	
    	GO_HOME;
    	
    }
    
    public enum Expertise {

        REGULAR_USER,

        RANDOM_CHEATER,

        HACKER;
    }

    public static void main(String[] args) throws YouShallNotPassException {

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
    	
    	MENU_STATE state = MENU_STATE.WAITING;
    	Scanner scanner = new Scanner(System.in);
    	Bar bar = new ClassicalBar();
    	
    	while (state != MENU_STATE.GO_HOME) {
    		
    		System.out.println("What you wanna do?");
    		System.out.println("0. Wait!!!");
    		System.out.println("1. Drink!!");
    		System.out.println("2. Nibble!!");
    		System.out.println("3. Eat");
    		System.out.println("4. Go Home");
    		
    		state = MENU_STATE.values()[scanner.nextInt()];
    		
    		switch (state) {
			case WAITING:
				System.out.println("I still need time to consider my option");
				break;
			case DRINK:
				bar.serveBeer().drink();
				break;
			case NIBBLE:
				bar.serveSnacks().nibble();
				break;
			case EAT:
				bar.serveMeal().eat();
				break;
			case GO_HOME:
				System.out.println("Thanks. I would like to go home.");
				break;
			default:
				System.out.println("Sorry Mister, we do not have that");
			}
    	}
    	scanner.close();
    }

    public static void hackerMenu() throws YouShallNotPassException {
    	MENU_STATE state = MENU_STATE.WAITING;
    	Scanner scanner = new Scanner(System.in);
    	Bar bar = new ProgrammersBar();
    	
    	while (state != MENU_STATE.GO_HOME) {
    		
    		System.out.println("What you wanna do?");
    		System.out.println("0. Wait!!!");
    		System.out.println("1. Drink!!");
    		System.out.println("2. Nibble!!");
    		System.out.println("3. Eat");
    		System.out.println("4. Go Home");
    		
    		state = MENU_STATE.values()[scanner.nextInt()];
    		
    		switch (state) {
			case WAITING:
				System.out.println("Bro wait a sec. I need to choose my weapon tonight");
				break;
			case DRINK:
				System.out.println();
				System.out.println("Bro how you want to drink it?");
				System.out.println("0. Sorry I am abstinent.");
				System.out.println("1. With fireworks shooting when I found epic sword by the river, after I killed that little rabbit.");
				System.out.println("2. Get me some cold beer.");
				
				DRINKING_STRATEGY strategy = DRINKING_STRATEGY.values()[scanner.nextInt()];
				
				switch (strategy) {
				case NO_DRINK:
					throw new YouShallNotPassException("Impossible decision. I need to terminate JAVA, OS and the universe by itself.");
				case SPECIAL_DRINK:
					((GrinbergenBeer) bar.serveBeer()).drinkWithEffects();
					break;
				case DRINK:
					bar.serveBeer().drink();
					break;
				}
				break;
			case NIBBLE:
				bar.serveSnacks().nibble();
				break;
			case EAT:
				bar.serveMeal().eat();
				break;
			case GO_HOME:
				System.out.println("Thanks. I would like to go home.");
				break;
			default:
				System.out.println("Sorry Mister, we do not have that");
			}
    	}
    	scanner.close();
    }
}
