package edu.csupomona.cs.cs141.progassgmnt1;

/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment #1
 *
 * Build a skeleton code with multiple classes for a mock FPS
 * Game
 *
 * Team b(a^2)kd
 *   Andrew Niklas
 *   Andrew Nipp
 *   Ben Nickerson
 *   Dylan Nguyen
 *   Kurt Newcomb
 */

/**
 * @author Ben
 *
 */
public class Levels {
	
	/**
	 * This field is used to keep track of which level is being selected 
	 */
	private int levelSelect;
	
	
	/**
	 * This field is used to keep track of whether the level is Day or Night.
	 * Day is automatic when boolean is false.
	 * Night is automatic when boolean is true.
	 */
	private boolean dayNight;
	
	/**
	 * This field is for use with {@link #bulletsFired(boolean)}
	 * Is true when either User or Enemy is hit
	 */
	private static boolean isHit;


	/**
	 * This field defines the amount of damage to be passed to either the {@link Enemy}
	 * or {@link User} classes
	 */
	private static int dmgFinal;


	/**
	 * This field is for use with {@link #redFlagStatus()}. The flag can be at home, under
	 * enemy control, away, or captured. Defined by integers 1, 2, 3, and 4 respectively.
	 */
	private static int redFlag;


	/**
	 * This field is for use with {@link #blueFlagStatus()}. The flag can be at home, under
	 * enemy control, away, or captured. Defined by integers 1, 2, 3, and 4 respectively.
	 */
	private static int blueFlag;


	/**
	 * This field is for use with {@link #scoreCount()}. Can keep track of kills (DeathMatch), flag captures
	 * (CTF), seconds in the hill (King of the Hill), or points scored from sector control (Domination)
	 * 
	 */
	private static int point;
	
	
	/**
	 * This method tracks the bullets fired from either the User or the Enemy
	 * 
	 * @param isShooting
	 * 		true when {@link User} or {@link Enemy} are actively firing their weapon
	 * @return
	 * 		boolean {@link #isHit} that is true if {@link User} or {@link Enemy} are hit
	 */
	public static boolean bulletsFired(boolean isShooting) {
		return isHit;
	}
	
	/**
	 * This method will calculate the amount of damage taken by either {@link User}
	 * or {@link Enemy}
	 * 
	 * @param dmg 
	 * 		passed from either {@link User} or {@link Enemy}, is the amount of damage
	 * 		that each shot fired can do
	 * 
	 * @param isHit 
	 * 		passed from {@link #bulletsFired(boolean)}, true with each hit that lands
	 * 
	 * @return
	 * 		The amount of damage to be done to either {@link User} or {@link Enemy}
	 */
	public static int dmgCalculator(int dmg, boolean isHit) {
		return dmgFinal;
	}
	
	/**
	 * This method keeps track of red team's flag
	 * 
	 * @return
	 * 		the status of the {@link #redFlag}
	 */
	public static int redFlagStatus() {
		return redFlag;
	}
	
	/**
	 * This method keeps track of blue team's flag
	 * 
	 * @return
	 * 		the status of the {@link #blueFlag}
	 */
	public static int blueFlagStatus() {
		return blueFlag;
	}
	
	/**
	 * This method adds points for the gametype CTF, only used when
	 * {@link #redFlag} or {@link #blueFlag} is equal to 4.
	 * 
	 * @param flag
	 * 		passed from either {@link #redFlagStatus()} or
	 * 		{@link #blueFlagStatus()}
	 * @return
	 * 		an integer, {@link #point}, for keeping track of score
	 */
	public static int flagCapture(int flag) {
		return point;
	}
	/**
	 * This method sets up the level and uses {@link #dayNight}
	 * to determine whether the level will use the day or night skin
	 * 
	 * @param dayNight
	 * 		The boolean that determines whether the level will use the day or night skin
	 */
	public static void levelOne(boolean dayNight) {
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) { 
	
	}

}
