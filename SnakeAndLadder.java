package com.capgemini.training;

import java.util.Random;

public class SnakeAndLadder {
	
	public static final int Ladder=1;
	public static final int Snake=2;
	public static final int NOPLAY=0;
			
	public static void main(String[] args) {
		
		System.out.println("\t***** Snake and Ladder Multiplayer Game *****");
		
		int playerScore[]= new int[] {0,0};
		int no_of_rolls=0;
		System.out.println("The initial score of both the players Alpha and Beta is set to 0");
		
		System.out.println("No of rolls \t\tScore \t\tOption \tAlpha Position \tBeta Position");
		
		int turn= (int)(Math.floor(Math.random()*10) %2);
		int arr[]= new int[3];
		
		while (playerScore[turn]<100) {
			arr=roll(playerScore, turn, no_of_rolls);
			playerScore[turn]=arr[0];
			turn=arr[1];
			no_of_rolls = arr[2];
		}
		
		String name="";
		if(turn==0)
			name="Alpha";
		else
			name="Beta";
		System.out.println("\t"+name+" has won the game after "+no_of_rolls+" rolls!");
		
	}
	
	public static int[] roll (int[] playerScore, int turn, int no_of_rolls) {
		Random ran = new Random();
		int result[] = new int[3];
			
		//Rolling the die
		int score = ran.nextInt(6) + 1;
		no_of_rolls++;
		
		int option = ran.nextInt(3);				//Choosing an option randomly
		
		System.out.print("\t"+no_of_rolls+"\t\t"+score+"\t\t"+ option);
		
		switch (option) {							//Choosing action from option
			case Ladder:
				if(playerScore[turn] + score <=100)
					playerScore[turn] += score;
				result[0]=playerScore[turn];
				break;
			case Snake:
				playerScore[turn] -= score;
				if(playerScore[turn]<0)
					playerScore[turn]=0;
				result[0]=playerScore[turn];
				if(turn==0)
					turn=1;
				else 
					turn=0;
				break;
			case NOPLAY:
				result[0]=playerScore[turn];
				if(turn==0)
					turn=1;
				else 
					turn=0;
				break;
		}
		
		System.out.print("\t\t"+playerScore[0]+"\t\t"+playerScore[1]+"\n");
		result[1]=turn;
		result[2]=no_of_rolls;
		return result;
	}

}
