
//class stores word and provide words
import java.util.Arrays;
import java.util.Random;

public class HangmanGame {

	int missed;
	char guess;
	char letter;
	StringBuffer secretWord;
	int stars;
	int lives;
	boolean GuessedWord;
	
		//declare words
		private String wordsArray[] = {"Roma", "Austria", "Berlin", "Paris", "Vienna"};
		
		//generate  random word from string words
		Random randomWord = new Random();
		String Word = wordsArray [randomWord.nextInt(wordsArray.length)];
		
		public void hideWord(String word) {
			this.Word = word;
				for (int i=0; i<word.length(); i++) {
					System.out.println("*");
				}
		}
			
		// show is letter already used or not
		private String usedLetters = "";
		
		public boolean letterIsUsed(char letter) {
			boolean LetterIsUsed = false;
			for (char i=0; i<usedLetters.length(); i++) {
				if (usedLetters.charAt(i)== letter) {
					 LetterIsUsed  = true; //isLetterUsed = true
				}
				
			}
			return LetterIsUsed;
			
		}
		//declare method if the letter provided by the user is found in word
				public boolean letterIsGuessed(String word, char letter) {
					boolean letterIsGuessed = false; //letter is not guessed
					for(int i = 0; i < word.length(); i ++) {	
						if(letter == word.charAt(i)) { //if the Word contains the user's provided letter
							letterIsGuessed = true; 
					}
				}
					return letterIsGuessed;

	}
			//is the word guessed or not'
			public void isWordGuessed(StringBuffer secretWord) {
				int stars = 0;
				for(int j = 0; j < secretWord.length(); j++) {
					if(secretWord.charAt(j) == '*') {//if star is found
						stars++;//update status
		}
	}
}		
}			
			
			
			
			
			
			
			

