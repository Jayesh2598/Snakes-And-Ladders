package com.capgemini.training;

import java.util.Random;

public class SnakeAndLadder {
	
	public static final int Ladder=1;
	public static final int Snake=2;

	public static void main(String[] args) {
		
		Random ran=new Random();
		
		System.out.println("***** Snake and Ladder Game *****");
		
		int playerScore=0;
		System.out.println("The initial score of the player is set to 0");
		
		System.out.println("No of rolls \t Position");
		int no_of_rolls=0;
		
		while(playerScore<100) {
			
			//Rolling the die
			int score = ran.nextInt(6) + 1;
			no_of_rolls++;
			
			if(playerScore + score >100) {
				System.out.println("\t"+no_of_rolls+"\t\t"+playerScore);
				continue;
			}	
			
			//Selecting the option
			int option = ran.nextInt(3);
			
			//Choosing action from option
			switch (option) {
				case Ladder:
					playerScore += score;
					break;
				case Snake:
					playerScore -= score;
					if(playerScore<0)
						playerScore=0;
					break;
				default:
					break;
			}
			System.out.println("\t"+no_of_rolls+"\t\t"+playerScore);
		}	
		
		System.out.println("The player has won after reaching "+ playerScore+ " position after "+ (no_of_rolls)+ " rolls");
		
	}

}
