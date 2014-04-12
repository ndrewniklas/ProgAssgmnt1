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
 *   Ben Nickerson, Andrew Nipp, Dylan Nguyen, Kurt Newcomb, Andrew Niklas 
 */

package edu.csupomona.cs.cs141.progassgmnt1;

/**
 * @author Andrew
 * 
 */
public class User {

	/**
	 * Holds the name of the user/character
	 */
	private String name;

	/**
	 * tracks the users characters current level
	 */
	private int level;

	/**
	 * controls the speed at which the character can move around the environment
	 */
	private int speed;

	/**
	 * maintains the users current level of health
	 */
	private int health;

	/**
	 * defines whether the character currently as a weapon activated
	 */
	private boolean hasWeapon;

	/**
	 * Holds items that the character currently has such as weapons, ammo,
	 * health packs
	 */
	private Item[] inventory;

	
	/**
	 * controls the movement of the character through input given by the user
	 */
	public void move(int input){
		//TO-DO
	}
	
	/**
	 * Removes user from line of sight of enemy
	 */
	public void crouch(){
		
	}
	
	/**
	 * calls shoot method for current weapon
	 */
	public void shoot(){
		
	}
	
	/**
	 * allow the user to equip a weapon from their inventory
	 * @param weaponNum
	 * @return
	 */
	public String equipWeapon(int weaponNum){
		return "weaponID";
		
	}
	
	/**
	 * allows user to cycle through all weapons in their inventory
	 * @param weaponNum
	 * @return
	 */
	public String switchWeapon(int weaponNum){
		return "weaponID";
	}
	
	/**
	 * returns character to the start point defined by the gameType
	 * and restores health 
	 * @param location
	 */
	public void respawn(int[] location){
		
	}
	
}