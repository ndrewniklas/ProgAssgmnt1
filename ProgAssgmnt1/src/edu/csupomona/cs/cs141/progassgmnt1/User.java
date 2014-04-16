/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment #N
 *
 * you will develop a design for a First Person Shooter (FPS) video game. 
 * You are to develop a high level architectural design of this system, 
 * and the objects that exist in and compose it. You will list the relevant 
 * classes for each object, and describe their attributes and behaviors.
 *
 * Team #N / (or name if individual)
 *   Ben Nickerson
 *   Andrew Nipp
 *   Dylan Nguyen
 *   Kurt Newcomb
 *   Andrew Niklas 
 */

package edu.csupomona.cs.cs141.progassgmnt1;

/**
 * This class contains all information pertinent to the User, including things like stats and character
 * level, along with methods to allow for interacting with the level and gametype being used.
 * 
 * @author Andrew
 * 
 */
public class User {

	private static boolean userDead;

	/**
	 * This field is a constant string that gives {@link User} a name to check for kills
	 */
	public final static String USER = "User";

	/**
	 * Holds the name of the user/character 
	 */
	private String name;

	/**
	 * tracks the user's character's current level
	 */
	private int level;

	/**
	 * controls the speed at which the character can move around the environment
	 */
	private int speed;

	/**
	 * maintains the user's current level of health
	 */
	private int health;

	/**
	 * defines whether the character currently as a {@link Weapons weapon} activated
	 */
	private boolean hasWeapon;

	/**
	 * is {@code true} when {@link User} shoots weapon
	 */
	private boolean isShooting;
	
	/**
	 * Holds items that the character currently has such as weapons, ammo,
	 * and health packs
	 */
	private Item[] inventory;

	
	/**
	 * controls the movement of the character through input given by the {@link User}
	 * @param input basically any input given by the {@link User}
	 */
	public void move(int input){
		//TO-DO
	}
	
	/**
	 * Removes {@link User} from line of sight of {@link Enemy}
	 */
	public void crouch(){
		
	}
	
	/**
	 * calls shoot method for the current {@link Weapons weapon}
	 * @return 
	 * 		true when user fires weapon
	 */
	public boolean shoot(){
		return isShooting;
		
	}
	
	/**
	 * allow the {@link User} to equip a weapon from their {@link #inventory}
	 * @param weaponNum
	 * 		The number assigned to the slot in the {@link #inventory}
	 * @return
	 * 		The first {@code int} in {@link Weapons#weaponInfo} 
	 */
	public String equipWeapon(int weaponNum){
		return "weaponID";
		
	}
	
	/**
	 * allows {@link User} to cycle through all weapons in their {@link #inventory}
	 * @param weaponNum
	 * 		The number assigned to the slot in the {@link #inventory}
	 * @return
	 * 		The first {@code int} in {@link Weapons#weaponInfo}
	 */
	public String switchWeapon(int weaponNum){
		return "weaponID";
	}
	
	/**
	 * This method tracks the health of {@link User} for use in {@link Levels}
	 * @param dmgFinal
	 * 		amount of damage done to the User by the Enemy
	 * @return
	 * 		whether the {@link User} is dead
	 */
	public static boolean hpTracker(int dmgFinal) {
		return userDead;
	}
	
	/**
	 * This method will determine who last did damage to the {@link User} and return the string giving credit
	 * @param dmgFinal
	 * 		used for determining who last damaged {@link User}
	 * @return
	 * 		only returns {@link Enemy#ENEMY}, but would be able to return {@link #USER} or other defined 
	 * 		enemies in the final version
	 */
	public static String lastHitBy(int dmgFinal) {
		return Enemy.ENEMY;
	}
	
	/**
	 * returns character to the start point defined by the {@link Game}
	 * and restores {@link #health} 
	 * @param location
	 * 		wherever in the level that the {@link User} will spawn in
	 */
	public void respawn(int[] location){
		
	}
	
}