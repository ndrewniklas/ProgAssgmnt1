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
	  * Need array of players to access each player's variables.
	  * Note: User constructor will need to register a new player in the array using addplayer method. 
	  */
	 private players = new array[User];
	 /**
	  * This is used for deathmatch to check the amount of remaining players.
	  */
	 private int player_count = 0; 
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
	private boolean gameOver;
	 /**
	  * 
	  * @param gametype This is the constructor for the initilization of the game and whichever type it will be.  
	  */
	 public Game(String gametype){ 
		 currentgame = new Game();  
		 currentgame.gametype = gametype; 
	 }
	 
	 /**
	  * This method adds a new user to the array as a player.
	  */
	 public void addplayer(User){

	 }
	 
	 /**
	  *  This function determines if the current game is over based on the game type. 
	  *  
	  */
	 public static boolean isGameOver(){

	}
}
