package com.capgemini.training;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		System.out.println("***** Snake and Ladder Game *****");
		
		int playerScore=0;
		System.out.println("The initial player score is set to "+ playerScore);

		System.out.println("Rolling a die... ");
		int score = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Score generated is :" + score);
		
	}

}
