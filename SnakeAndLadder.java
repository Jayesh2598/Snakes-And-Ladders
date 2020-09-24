package com.capgemini.training;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		Random ran=new Random();
		
		System.out.println("***** Snake and Ladder Game *****");
		
		int playerScore=0;
		System.out.println("The initial player score is set to "+ playerScore);
		
		System.out.println("No of rolls \t Player Position");
		int no_of_rolls=0;
		
		while(playerScore<100) {
			
			//Rolling the die
			int score = ran.nextInt(6) + 1;
			no_of_rolls++;
			System.out.println("\t"+no_of_rolls+"\t\t"+playerScore);
			if(playerScore + score >100)
				continue;
			
			//Selecting the option
			int option = ran.nextInt(3);
			
			//Choosing action from option
			switch (option) {
				case 1:
					playerScore += score;
					break;
				case 2:
					playerScore -= score;
					if(playerScore<0)
						playerScore=0;
					break;
				default:
					break;
			}
		}	
		
		System.out.println("The player has won after reaching "+ playerScore+ " position after "+ (no_of_rolls+1)+ " rolls");
		
	}

}
