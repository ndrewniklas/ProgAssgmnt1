/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 * 
 * Programming Assignment 1
 * 
 * A team assignment to create skeleton code for a First person shooter video game
 * 
 * Team Ba^2kd
 * Ben Nickerson (Captain)
 * Kurt Newcomb
 * Dylan Nguyen
 * Andrew Niklas
 * Andrew Nipp
 */
package edu.csupomona.cs.cs141.progassgmnt1;

/**
 * This class defines the Enemy NPC for the First Person Shooter
 * 
 * @author Andrew Nipp
 *
 */

public class Enemy {
	
	/**
	 * The directory for the character model
	 * Called within the drawModel() method
	 */
	private String drawModelDir;
	
	/**
	 * 
	 */
	private int movementSpeed;
	
	/**
	 * 
	 */
	private int health;
	
	/**
	 * 
	 */
	private boolean isPathBlocked;
	
	/**
	 * 
	 */
	private boolean canJump;
	
	/**
	 * 
	 */
	private int jumpHeight;
	
	
	/**
	 * 
	 */
	private boolean canCrouch;
	
	/**
	 * 
	 */
	private int hearDistance;
	
	/**
	 * 
	 */
	private int sightDistance;
	
	/**
	 * 
	 */
	private boolean isEnemy;
	
	/**
	 * 
	 */
	private boolean isFriend;
	
	/**
	 * 
	 */
	private boolean chaseEnemy;
	
	/**
	 * 
	 */
	private boolean stopChase;
	
	/**
	 * 
	 */
	private int abilityToFindEnemy;
	
	/**
	 * 
	 */
	private int abilityToDodgeAndHide;
	
	/**
	 * 
	 */
	private boolean isWeaponOutOfAmmo;

	/**
	 * 
	 */
	public void drawModel(){
		
	}
	
	public int getMovementSpeed(){
		return movementSpeed;
	}
	
	/**
	 * 
	 */
	public void moveForward(){
		
	}

	/**
	 * 
	 */
	public void moveBackwards(){
		
	}
	
	/**
	 * 
	 */
	public void moveLeft(){
	
	}
	

	/**
	 *
	 */
	public void crouch(){
		
	}
	
	/**
	 * 
	 */
	public void jump(){
		
	}
	
	/**
	 * 
	 */
	public void turnCounterClockwise(){
		
	}
	
	/**
	 * 
	 */
	public void turnClockwise(){
		
	}

	/**
	 * 
	 */
	public void pathFinding(){
		
	}
	
	/**
	 *
	 */
	public void targetFinding(){
		
	}
	
	/**
	 *
	 */
	public void noticeEntity(){
		
	}
	
	/**
	 * 
	 */
	public void decideAction(){
		
	}
	
	/**
	 * @param hp
	 * @return
	 */
	public int setHealth(int hp){
		return health;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getHealth(){
		return health;
	}
	
	/**
	 * @param weaponList
	 */
	public void equipWeapon(String[] weaponList){
		
	}
	
	
}













