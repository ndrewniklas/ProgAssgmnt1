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
 * This class allows {@link User} and {@link Enemy} to interact with eachother within some level of the \
 * User's choosing.
 * 
 * @author Ben
 *
 */
/**
 * @author Ben
 *
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
	 */
	private static int point;


	/**
	 * This field is for use with {@link #killTracker(boolean)}, it returns true if the 
	 * {@link Enemy} killed the {@link User}
	 */
	private static boolean enemyKill;

	/**
	 * This field is for use with {@link #killTracker(boolean)}, it returns true if the
	 * {@link User} killed the {@link Enemy} 
	 */
	private static boolean userKill;	
	
	/**
	 * This method tracks the bullets fired from either the User or the Enemy
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
	 * @param dmg 
	 * 		passed from either {@link User} or {@link Enemy}, is the amount of damage
	 * 		that each shot fired can do
	 * @param isHit 
	 * 		passed from {@link #bulletsFired(boolean)}, true with each hit that lands
	 * @return
	 * 		The amount of damage to be done to either {@link User} or {@link Enemy}
	 */
	public static int dmgCalculator(int dmg, boolean isHit) {
		return dmgFinal;
	}
	
	/**
	 * This method will determine if the {@link Enemy} killed the {@link User} and return a boolean
	 * @param who
	 * 		contains the info of whoever last hit the {@link User} to kill them.
	 * @return
	 * 		boolean {@link #enemyKill} true, if {@link Enemy} got the last hit. 
	 */
	public static boolean userKilled(String who) {
		return enemyKill;
	}
	
	/**
	 * This method will determine if the {@link User} killed the {@link Enemy} and return a boolean
	 * @param who
	 * 		contains the info of whoever last hit the {@link Enemy} to kill them.
	 * @return
	 * 		boolean {@link #userKill} true, if {@link User} got the last hit. 
	 */
	public static boolean enemyKilled(String who) {
		return userKill;
	}
	
	
	/**
	 * This method will award a point to the appropriate party for getting a kill.
	 * @param kill
	 * 		either {@link #userKill} or {@link #enemyKill}.
	 * @return
	 * 		gives a {@link point} to the appropriate party
	 */		
	public static int killTracker(boolean kill) {
		return point;
	}
	
	/**
	 * This method calculates score by adding together {@link #point points}, this should be called from
	 * {@link GameType}
	 * @param point
	 * 		passed in whenever something occurs that denotes a "point" be given, dependent on game type
	 * @param score
	 * 		passed from {@link GameType} to this method, can only increase
	 * @return
	 * 		{@link #score}, to keep track of red and blue team score in {@link GameType}
	 */
	public static int scoreCalculator(int point, int score) {
		return score;
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
