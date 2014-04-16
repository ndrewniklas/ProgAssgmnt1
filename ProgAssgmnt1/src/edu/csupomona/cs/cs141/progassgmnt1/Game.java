package edu.csupomona.cs.cs141.progassgmnt1;

public class Game {
	 /* This class starts by intializing the game, 
	 * then monitors the objectives and determines the winner based on the game type's objectives.
	 * Once the winner is determined, it ends the game.
	 * This class determines if the game is over, based upon the different types ( 
	 * e.g. "Deathmatch", "KingOfTheHill", and "CaptureTheFlag").
	 */
	 private String gametype; // So far we have a DEATHMATCH, KINGOFTHEHILL, and CAPTURETHEFLAG gametype.
	 private players = new array[User]; // need array of players to access each player's variables.
	 // Note: User constructor will need to register a new player in the array using addplayer method.  

	 
	 public Game(String gametype){ // This is the constructor for the initialization of the game and type.
		 currentgame = new Game();  
		 currentgame.gametype = gametype; 
	 }
	 
	 public void addplayer(User){
		 /*
		  * This method adds a new user to the array as a player.
		  */
	 }
	 
	 
	 public static boolean isGameOver(){
		/*
		 *  This function determines if the current game is over based on the game type. 
		 */
		 int player_count = 0; // This is used for deathmatch to check the amount of remaining players.
		 int controltimegoal = 300; // This is the win condition for King of the Hill.
		 int flag_captured = 4;
		 boolean gameover = false;
		 
		 switch (gametype){
		 	case "DEATHMATCH": // Over when the lives of all but 1 or fewer players is 0.
		 		for(int i = 0; i < players; i++){
		 			if(players[i].lives > 0 ){
		 			player_count++; // Found a player with lives left.
		 			}
		 			if(player_count > 1){
		 				gameover = false; // If there are at least two players alive the game is NOT OVER!
		 				break; 
		 			} 
		 		}  // End of FOR loop.
		 		
		 		if(player_count <= 1){
		 			gameover = true; // The game is over if only 1 or fewer players is alive.  GAME OVER!
		 		}
		 		break;
		 		
		 	case "KINGOFTHEHILL": // Over when a player has controlled the hill for a total of n minutes. 
		 		for(int i = 0; i < players; i++){
		 			if(players[i].controltime = controltimegoal){
		 			winner = i; // Found a winner.
		 			}
		 			if(player_count = 1){
		 				gameover = true; // If there is a player with at least 300 points
		 				break; 
		 			} 
		 		}  // End of FOR loop.		 		
		 		break;
		 		
		 	case "CAPTURETHEFLAG": // Over when one team has captured the opposing flag 5 times.
			/*
			 * This method calls Levels.blueFlagStatus and Levels.redFlagStatus Which tally the total score of flag captures
			 * It then determines if the game is over.	 		
			 */
		 	if(Levels.redFlagStatus == 5 || Levels.blueFlagStatus == 5){
		 		gameover = true;
		 	}
		 		break;
		 		
		 	default:
		 		return false; //Game is not over.
			 
		 } // End of SWITCH.
		 return gameover;
	}
}
