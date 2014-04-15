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
	 */
	private String drawModelDir;
	
	/**
	 * This field gives the {@link Enemy} a name to help check for kills
	 */
	public final static String ENEMY = "Enemy";
	
	/**
	 * The speed of the Enemy NPC's movement
	 */
	private int movementSpeed;
	
	/**
	 * The amount of health points the Enemy NPC has
	 */
	private int health;
	
	/**
	 * Checks to see if the path is blocked 
	 */
	private boolean isPathBlocked;
	
	/**
	 * Checks to see if the Enemy NPC can jump
	 */
	private boolean canJump;
	
	/**
	 * The height the Enemy NPC can jump
	 */
	private int jumpHeight;
		
	/**
	 * Checks to see if the Enemy NPC can crouch
	 */
	private boolean canCrouch;
	
	/**
	 * The distance the Enemy NPC can hear a noise
	 */
	private int hearDistance;
	
	/**
	 * The distance the Enemy NPC can see an entity
	 */
	private int sightDistance;
	
	/**
	 * Checks to see if the entity found is an enemy (player) or friend
	 */
	private boolean isEnemy;
	
	/**
	 * Checks to see if the Enemy NPC should chase the player
	 */
	private boolean shouldChaseEnemy;
	
	/**
	 * Checks to see if the Enemy NPC should stop chasing the player
	 */
	private boolean shouldStopChase;
	
	/**
	 * The Enemy NPC's ability to find enemies through sight and sound
	 * This integer will multiply the sightDistance and the hearDistance depending on the Gamemode
	 */
	private int abilityToFindEnemy;

	private boolean isShooting;

	/**
	 * This method assigns a model to the Enemy NPC 
	 * The model is determined by the drawModelDir string which will be declared in this method
	 */
	
	/**
	 * calls shoot method for current weapon
	 * returns true when enemy fires weapon
	 */
	public boolean shoot(){
		return isShooting;
	}
	
	public void drawModel(){
		
	}
	
	/**
	 * This method returns the movement speed of the Enemy NPC
	 * @return the movement speed
	 */
	public int getMovementSpeed(){
		return movementSpeed;
	}
	
	/**
	 * This method uses the speed from movementSpeed to move the Enemy NPC forward
	 */
	public void moveForward(){
		
	}

	/**
	 * This method uses the speed from movementSpeed to move the Enemy NPC backwards
	 */
	public void moveBackwards(){
		
	}
	
	/**
	 * This method uses the speed from movementSpeed to move the Enemy NPC in the left direction (strafe)
	 */
	public void moveLeft(){
	
	}
	
	/**
	 * This method uses the speed from movementSpeed to move the Enemy NPC in the right direction (strafe)
	 */
	public void moveRight(){
	
	}
	
	/**
	 * This method checks the canCrouch boolean to see if the Enemy NPC can crouch
	 * If the Enemy NPC can crouch then do so, if not then do nothing
	 */
	public void crouch(){
		
	}
	
	/**
	 * This method checks the canJump boolean to see if the Enemy NPC can jump
	 * If the Enemy NPC can jump then do so, if not then do nothing
	 */
	public void jump(){
		
	}
	
	/**
	 * This method will cause the Enemy NPC to turn counterclockwise
	 */
	public void turnCounterClockwise(){
		
	}
	
	/**
	 * This method will cause the Enemy NPC to turn clockwise
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
	 * 
	 */
	public void chaseEnemy(){
	
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
	 * This method will determine who last did damage to the {@link Enemy} and return the string giving credit
	 * @param dmgFinal
	 * 		used for determining who last damaged {@link Enemy}
	 * @return
	 * 		only returns {@link User#USER}, but would be able to return {@link #ENEMY} or other defined 
	 * 		enemies in the final version
	 */
	public static String lastHitBy(int dmgFinal) {
		return User.USER;
	}
	
	/**
	 * @param weaponList
	 */
	public void equipWeapon(String[] weaponList){
		
	}
	
	
}













