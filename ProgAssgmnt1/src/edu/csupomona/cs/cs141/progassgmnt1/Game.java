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

/** This class starts by intializing the game, 
* then monitors the objectives and determines the winner based on the game type's objectives.
* Once the winner is determined, it ends the game.
* This class determines if the game is over, based upon the different types ( 
* e.g. "Deathmatch", "KingOfTheHill", and "CaptureTheFlag").
*/
public class Game {
	 
	 /**
	 * So far we have a DEATHMATCH, KINGOFTHEHILL, and CAPTURETHEFLAG gametype.
	 */
	 private String gametype; 
	  
	 /**
	  * This is used for deathmatch to check the amount of remaining players.
	  * This allows for making teams.  
	  */
	 private int playerCount; 
	 
	 /**
	  * This is the win condition for the King of the Hill game type.
	  */
	 private int controlTimeGoal;  
	 
	 /**
	  * This is the win condition for the Capture the Flag game type.
	  */
	 private int flagCaptured;
	 
	 /**
	 * The boolean to check if the game is over
	 */
	private static boolean gameOver;
	
	/**
	 * This is the array for all the players in the game.
	 */
	private User players[];
	
	
		
	/**
	  * This method adds a new user from the {@link User} class to the array as a player which will be .  
	  */
	 public void addplayer(User newPlayers){

	 }
	 
	 /**
	  *  This function determines if the current game is over based on the game type. 
	  *  Theoretically, a switch statement could be used to determine the win condition based on the game type as the switch arguments.
	  *  From there the switch would call the players array which calls the {@link User} class for its win condition checks: 
	  *  e.g. Kills(Deathmatch), Control Time(King of the Hill), Flags Captured(Capture the Flag).  
	  */
	 public static boolean isGameOver(){
		 return gameOver;
	}
}
