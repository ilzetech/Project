

import java.util.Scanner;

public class HangmanApp1 {
	public class HangmanGame {

		public void main (String[] args) {
		}		
			
		//declare instance variables
		 int numOfGames;
		 int numOfWins;
		 int numOfLosses;
		 boolean startGame;
		boolean game; //start game
		StringBuffer randomWord;
		char letter;
		StringBuffer lettersUsed;
		StringBuffer secretWord;
		StringBuffer guessedWord;
		
		
		Scanner input = new Scanner(System.in);
		HangmanGame hangman = new HangmanGame();
	
		//declare method to start the game
		  public void startGame () {
			startGame = true;
		  }
		  //declare method to display game conditions to the user
			public void game() {
				System.out.println("Hello!" + "\n" 
						  + "Welcome to the game Hangman!" + "\n"
						  + " guess the name " + "\n");
				System.out.println();
			
			//make main loop of the game (do-while)
			do {
				numOfGames++;
				int lives = 5;//stringword
				while(lives > 0) {
					int i=0;
					boolean compare;
					boolean stillAlive = false;
					compare  = (!secretWord. toString(). equals(lettersUsed));
				
	
					System.out.println("Please enter the letter: ");
					String wordToShow = "a-zA-Z";{ 
					char letter = input.next().toLowerCase().charAt(0); 
					}
				}
				
					//if the letter entered by the user is already used then inform user about it
					boolean letterAlreadyUsed = false; //the letter is not already used
					if(letterAlreadyUsed == true) { 
						System.out.println("letter is  used: " + letter); 
						System.out.println();
						continue; //stop while loop iteration and continue with the next iteration
					}
				
				//if the letter provided by the user is found in the randomly chosen word	
					boolean letterIsGuessed = false;//letter is not guessed
					if (letterIsGuessed == true) {
						secretWord = replaceTheLetter(randomWord, letter, secretWord);
						// check is the word guessed or not
						boolean guessedWord = guessedWord(secretWord);
						if(guessedWord == true) {
							System.out.println("_______________________");
							System.out.println("You won!" + "\n"
												+ "You found the word: " + secretWord + "\n"
												+ "With " + lives + " more live(s) left");
							numOfWins++;
							break;
							//the letter is not guessed -1	
					} else 
						lives--;
						if(lives == 0) {// lost
							System.out.println("lost!" + "\n"); //+ "You have not found the word: " + randomWord);
							numOfLosses++;
							playAgain(lives);
	
					}
				}
			}while(game);
		}
}

		private StringBuffer replaceTheLetter(StringBuffer randomWord2, char letter2, StringBuffer secretWord2) {
				// TODO Auto-generated method stub
				return null;
			}

		//declare method to display current game status
		public void GameStatus(int lives, StringBuffer secretWord, StringBuffer lettersUsed) {
			System.out.println("Lives: " + lives);
			System.out.println("Word: " + secretWord);
			
			if(lettersUsed.length() == 0) {
				System.out.println("Letters used: Waiting for your first letter");
			} else 
				System.out.println("Letters used: " + lettersUsed);}

		//ask the user to play another game or not
		public void playAgain(int lives) {
			System.out.println("Do you want to play another game? (choose y/n)");
			Scanner input = null;
			String answer = input.next().toLowerCase();
			System.out.println();
			boolean startGame;
			// answer is yes 'y'
			if(answer.equals("y")) {
				startGame = true;
				lives = 5;
			} else // answer is no 'n' 
			// statistics
				startGame = false;
		
				String numOfGames = null;
				String numOfWins = null;
				String numOfLosses = null;
				System.out.println("The game is finished!" + "\n"
									+ "_______________________" + "\n"
									+ "Game statistics" + "\n"
									+ "Games played: " + numOfGames +"\n"
									+ "Games won: " + numOfWins + "\n"
									+ "Games lost: " + numOfLosses + "\n");
		}
	public boolean guessedWord(StringBuffer secretWord) {
		// TODO Auto-generated method stub
		return false;
	}
	}



	
	


		
		
	
