package com.capgemini.training;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		System.out.println("***** Snake and Ladder Game *****");
		
		int playerScore=0;
		System.out.println("The initial player score is set to "+ playerScore);
		
		//Rolling the die
		System.out.println("Rolling a die... ");
		int score = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Score generated:" + score);
		
		//Selecting the option
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		switch (option) {
			case 1:
				System.out.println("Option: Ladder");
				playerScore += score;
				break;
			case 2:
				System.out.println("Option: Snake");
				playerScore -= score;
				if(playerScore<0)
					playerScore=0;
				break;
			default:
				System.out.println("Option: No Play");
		}
		
		System.out.println("The final player position is :"+ playerScore);
		
	}

}
