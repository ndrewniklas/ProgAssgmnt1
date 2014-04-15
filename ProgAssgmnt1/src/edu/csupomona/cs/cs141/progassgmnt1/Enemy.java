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
	 * This method checks current paths and other paths and decides which path is best
	 * If the decideAction method decides that the Enemy NPC should find a path then this method should choose which path to take
	 * Define isPathBlocked and check to see if the path is blocked; if the path is not blocked and it is the best way to the target,
	 * which is decided in targetFinding, then take that path.
	 * Check to see if the Enemy NPC can jump; if it can and it will help it reach the target then do so.
	 * Check to see if the Enemy  NPC can crouch; if it can and it will help it dodge and hide, which is decided under decideAction,
	 * then do so.
	 */
	public void pathFinding(){
		
	}
	
	/**
	 * This method uses hearDistance and sightDistance to find a target for decideAction() 
	 * Get the abilityToFindEnemy value from the Gamemode and then multiply it by hearDistance and sightDistance 
	 * If the method finds a target then decide if isEnemy is true or false
	 * Give the target to decideAction()
	 */
	public void targetFinding(){
		
	}
	
	/**
	 * This method retrieves a target from targetFinding() and depending on if it is an enemy or not decide a course of action
	 * Decide if shouldChaseEnemy is true, if so then call chaseEnemy(), if not then do nothing
	 * If the Enemy Npc is chasing the enemy the decide if it should stop or not based on how much health is left with shouldStopChase
	 * If the Enemy NPC is chasing the enemy then have the pathFinding() method find a proper path 
	 * If no gun is equipped then call equipWeapon()
	 */
	public void decideAction(){
		
	}
	
	/**
	 * This method has the Enemy NPC chase the enemy chosen by targetFinding
	 * If the decideAction() method wants to start the chase then start it, if it wants to stop the chase then stop it. 
	 */
	public void chaseEnemy(){
	
	}

	/**
	 * This method sets the current health of the Enemy NPC, based on Gamemode
	 * @param hp
	 * @return the set health
	 */
	public int setHealth(int hp){
		return health;
	}
	
	/**
	 * This method gives us this current health
	 * @return the health
	 */
	public int getHealth(){
		return health;
	}
	
	/**
	 * This method has the Enemy NPC equip a weapon defined in the Weapon class
	 * @param weaponList from the Weapon class
	 */
	public void equipWeapon(String[] weaponList){
		
	}
	
	
}













