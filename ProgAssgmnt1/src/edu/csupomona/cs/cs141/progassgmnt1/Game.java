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

/** This class starts by initializing the game, 
* then monitors the objectives and determines the winner based on the game type's objectives.
* Once the winner is determined, it ends the game.
* This class determines if the game is over, based upon the different types ( 
* e.g. "Deathmatch" and "CaptureTheFlag").
*/
public class Game {
	 
	 /**
	 * So far we have a DEATHMATCH and CAPTURETHEFLAG game type.
	 */
	 private String gameType; 
	  
	 /**
	  * This is used for Deathmatch to check the amount of remaining players.
	  * This allows for making teams.  
	  */
	 private int playerCount; 
	 
	 
	 /**
	  * This is the win condition for the Capture the Flag game type.
	  */
	private boolean flagCaptured;
	 
	 /**
	 * The boolean to check if the game is over
	 */
	private static boolean gameOver;
	
	/**
	 * This is the array for all the players in the game.
	 */
	private User[] players;
		
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

	/**
	 * This will get the game type from the {@link User}
	 * @return
	 * 		whatever the game type is
	 */
	public String getGameType() {
		return gameType;
	}

	/**
	 * This method sets the game type 
	 * @param gameType
	 * 		sets the string to be used
	 */
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	/**
	 * counts the players in the lobby
	 * @return
	 * 		however many players are in the lobby
	 */
	public int getPlayerCount() {
		return playerCount;
	}

	/**
	 * sets the {@link #playerCount}
	 * @param playerCount
	 * 		amount of players in the lobby
	 */
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	/**
	 * determines if the flag is captured
	 *
	 * @return
	 * 		whether or not the flag got captured
	 */
	public boolean getFlagCaptured() {
		return flagCaptured;
	}

	/**
	 * sets the flag as being captured
	 * @param flagCaptured
	 * 		true when the flag is captured
	 */
	public void setFlagCaptured(boolean flagCaptured) {
		this.flagCaptured = flagCaptured;
	}

	/**
	 * If there are multiple {@link User users} in the game, this will be the {@code array}
	 *  to keep track of them
	 * @return
	 * 		the {@code array} of {@link User users}
	 */
	public User[] getPlayers() {
		return players;
	}

	/**
	 * Sets the {@code array}
	 * @param players
	 * 		the {@code array} of {@link User users}
	 */		
	public void setPlayers(User[] players) {
		this.players = players;
	}
}
