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
 * This class defines the {@link Enemy} for the First Person Shooter
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
	 * The speed of the {@link Enemy}'s movement
	 */
	private int movementSpeed;
	
	/**
	 * The amount of health points the {@link Enemy} has
	 */
	private int health;
	
	/**
	 * Checks to see if the path is blocked 
	 */
	private boolean isPathBlocked;
	
	/**
	 * Checks to see if the {@link Enemy} can jump
	 */
	private boolean canJump;
	
	/**
	 * The height the {@link Enemy} can jump
	 */
	private int jumpHeight;
		
	/**
	 * Checks to see if the {@link Enemy} can crouch
	 */
	private boolean canCrouch;
	
	/**
	 * The distance the {@link Enemy} can hear a noise
	 */
	private int hearDistance;
	
	/**
	 * The distance the {@link Enemy} can see an entity
	 */
	private int sightDistance;
	
	/**
	 * Checks to see if the entity found is {@link User} or friend
	 */
	private boolean isEnemy;
	
	/**
	 * Checks to see if the {@link Enemy} should chase {@link User}
	 */
	private boolean shouldChaseEnemy;
	
	/**{@link User}
	 * Checks to see if the {@link Enemy} should stop chasing {@link User}
	 */
	private boolean shouldStopChase;
	
	/**
	 * The {@link Enemy}'s ability to find {@link User} through sight and sound
	 * This integer will multiply the {@link #sightDistance} and the {@link #hearDistance} depending on the {@link Gamemode}
	 */
	private int abilityToFindEnemy;
	
	/** 
	 * Check to see if the {@link Enemy} is shooting
	 */
	private boolean isShooting;

	/**
	 * Calls shoot method for current weapon
	 * returns true when {@link Enemy} fires weapon
	 */
	public boolean shoot(){
		return isShooting;
	}
	
	/**
	 * This method assigns a model to the {@link Enemy} 
	 * The model is determined by the {@link #drawModelDir} string which will be declared in this method
	 */
	public void drawModel(){
		
	}
	
	/**
	 * This method returns the movement speed of the {@link Enemy}
	 * @return the movement speed
	 */
	public int getMovementSpeed(){
		return movementSpeed;
	}
	
	/**
	 * This method uses the speed from {@link #movementSpeed} to move the {@link Enemy} forward
	 */
	public void moveForward(){
		
	}

	/**
	 * This method uses the speed from {@link #movementSpeed} to move the {@link Enemy} backwards
	 */
	public void moveBackwards(){
		
	}
	
	/**
	 * This method uses the speed from {@link #movementSpeed} to move the {@link Enemy} in the left direction (strafe)
	 */
	public void moveLeft(){
	
	}
	
	/**
	 * This method uses the speed from {@link #movementSpeed} to move the {@link Enemy} in the right direction (strafe)
	 */
	public void moveRight(){
	
	}
	
	/**
	 * This method checks {@link #canCrouch} to see if the {@link Enemy} can crouch
	 * If the {@link Enemy} can crouch then do so, if not then do nothing
	 */
	public void crouch(){
		
	}
	
	/**
	 * This method checks the {@link #canJump} to see if the {@link Enemy} can jump
	 * If the {@link Enemy} can jump then do so, if not then do nothing
	 */
	public void jump(){
		
	}
	
	/**
	 * This method will cause the {@link Enemy} to turn counterclockwise
	 */
	public void turnCounterClockwise(){
		
	}
	
	/**
	 * This method will cause the {@link Enemy} to turn clockwise
	 */
	public void turnClockwise(){
		
	}

	/**
	 * This method checks current paths and other paths to decide which is the best
	 * If the {@link #decideAction()} method decides that the {@link Enemy} should find a path then this method should choose which path to take
	 * Define {@link #isPathBlocked} and check to see if the path is blocked; if the path is not blocked and it is the best way to the target,
	 * which is decided in {@link #targetFinding()}, then take that path.
	 * Check {@link #canJump}; if {@link Enemy} can and it will help it reach the target then do so.
	 * Check to see if the {@link Enemy} can crouch; if it can and it will help it dodge and hide, which is decided under {@link #decideAction()},
	 * then do so.
	 */
	public void pathFinding(){
		
	}
	
	/**
	 * This method uses {@link #hearDistance} and {@link #sightDistance} to find a target for {@link #decideAction()} 
	 * Get the {@link #abilityToFindEnemy} value from the {@link Gamemode} and then multiply it by {@link #hearDistance} and {@link #sightDistance} 
	 * If the method finds a target then decide if {@link #isEnemy} is true or false
	 * Give the target to {@link #decideAction()}
	 */
	public void targetFinding(){
		
	}
	
	/**
	 * This method retrieves a target from {@link #targetFinding()} and depending on if it is an enemy or not decide a course of action
	 * Decide if {@link #shouldChaseEnemy} is true, if so then call {@link #chaseEnemy()}, if not then do nothing
	 * If the {@link Enemy} is chasing the enemy the decide if it should stop or not based on how much {@link #health} is left with {@link #shouldStopChase}
	 * If the {@link Enemy} is chasing the enemy then have the {@link #pathFinding()} method find a proper path 
	 * If no gun is equipped then call {@link #equipWeapon()}
	 */
	public void decideAction(){
		
	}
	
	/**
	 * This method has the {@link Enemy} chase the enemy chosen by {@link #targetFinding}
	 * If the {@link #decideAction()} method wants to start the chase then start it, if it wants to stop the chase then stop it. 
	 */
	public void chaseEnemy(){
	
	}

	/**
	 * This method sets the current health of the {@link Enemy}, based on {@link #Gamemode}
	 * @param hp
	 * @return the set {@link health}
	 */
	public int setHealth(int hp){
		return health;
	}
	
	/**
	 * This method gives us this current {@link health}
	 * @return the health
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
	 * This method has the {@link Enemy} equip a weapon from {@link Weapon}
	 * @return the weaponID from {@link Weapon}
	 */
	public String equipWeapon(){
		return "weaponID";
		
	}
	
}













