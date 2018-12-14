
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int guessNum = rand.nextInt(20) + 1; 
		int numOfTries = 0;
		Scanner input = new Scanner(System.in);
	    int guess;
	    boolean correct = false;
	    
	    	while (correct == false) {
	    		System.out.println("Guess the secret number between 0 and 20: ");
	    		guess = input.nextInt();
	    		numOfTries++;
	    
	    	if(guess == guessNum) {
	    		correct = true;
	    	}
	    	else if (guess < guessNum) {
	    		System.out.println("Guess higher");
	    	}else if (guess > guessNum) {
	    		System.out.println("Guess lower");
	    	}
	    	}
		System.out.println("Congratulations!");		
	}
}



/*
Game Idea: In this game, our program will
1)      have secret number OR
2)      // EXTRA - Generate a random number and the task for the user is to guess the number.

If the user guesses correctly we will show a message: “Congratulations!”.
If the user guesses a higher number we will show a message: “Guess Lower”.
If the user guesses a lower number we will show a message: “Guess Higher”.
The game will continue until user guesses the correct number.

For example, let’s assume that the secret number is  3.

Now the user's first input is 1, so our program's output will be “Guess Higher”, then user's second input is 4, 
so our program's output will be “Guess Lower”. 
Now if the user input is 3 then our program's output will be “Congratulations!”, after that our program will stop. 
Let’s Build the Game…

Build Process
1. First of all we will generate a secret or random number from 1 to 10.
2. Then we initialize the Scanner.
3. Then we will create a while loop and we will take input from user and check those conditions to show messages to the user. 
That’s it.
What you should know:
Variable, if else, loop, break statement, How to take input from user
*/