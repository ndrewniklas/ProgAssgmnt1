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
 * @author Dylan Nguyen
 * {@link Weapons} will contain all the necessary info
 * and methods to access and define weapons in the game
 */
public class Weapons {


	/**
	 * This is one of the fields that would be used to contain
	 * the information of each weapon, where there is only 5 weapons,
	 * which are the knife, M9, M16, SV98, and Katana. The weapon properties
	 * will be in the array in the following order as integer values: weapon id, 
	 * weapon damage, weapon ammo capacity, and effective range
	 */
	int[] weaponInfo = new int[4];
	
	/**
	 * @param userInput is determined by the weapon picked up in-game
	 * or when the user chooses his initial weapon. Each weapon in the game,
	 * is assigned a number. That number is taken as input for this method
	 * as the variable userInput when prompted by the user's input via menu
	 * or in-game action. This will make
	 * 
	 * @return The return value will be the identifying number at the beginning of
	 * each weapon array for the weapon that has been walked over, chosen, or equipped
	 * 
	 * {@link #gunType) will check for one of three
	 * weapon types which is dependent on the user input when
	 * choosing the initial weapon, walking over a weapon in-game,
	 * or each time.
	 */
	
	private int gunType(int userInput){
		return 0;
		
	}
	
	/**
	 * @param AMMO is the integer that is retrieved when the user
	 * moves his avatar over a weapon.
	 * 
	 * {@link #checkAmmo} will determine if there is ammo present
	 * in a gun or not, and this will be apply to the equipped weapon
	 * after firing the gun and when checking weapons on the floor
	 * 
	 * @return a boolean that will determine if there is ammo or not
	 */
	private boolean checkAmmo(int AMMO) {
		return true;
	}
	
	/**
	 * @param isThereAmmo will be the return value of the checkAmmo method
	 * 
	 * {@link #canEquip} will check if a weapon on the floor has ammo
	 * that is either spawned or dropped, and return a boolean to determine
	 * if the weapon can be equipped
	 * 
	 * @return the returned value will be used
	 */
	private boolean canEquip(boolean isThereAmmo){
		return true;
	}
	
	/**
	 * {@link #equipWeapon} will be initiated by the user from their input,
	 * only if the return value of the {@link #canEquip} is true,
	 * and equip a weapon that is dropped or spawned on the map
	 */
	public void equipWeapon() {
		
	}
	
	/**
	 * {@link #fireWeapon} will fire the weapon when prompted
	 * by user input and decrease the value of the of the ammo value
	 * in the weapon array each time {@link #fireWeapon} is initialized, but only
	 * if the return value of the canEquip method is true
	 */
	public void fireWeapon() {
		
	}
	
	/**
	 * {@link #reloadWeapon} method will reload the weapon equipped when
	 * prompted by user input, or when the weapon ammo is depleted
	 */
	public void reloadWeapon() {
		
	}
	
	/** 
	 * {@link #dropWeapon} will drop the weapon if there is no ammo left in the weapon
	 * which would be kept track of using a four part array which will contain
	 * values for the weapon id, weapon damage, weapon ammo capacity, and effective
	 * range
	 */
	public void dropWeapon() {
		
	}
}
