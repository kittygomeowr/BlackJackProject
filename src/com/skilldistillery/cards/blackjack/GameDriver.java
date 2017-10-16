package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//add in story about an evil robot dealer. save the world, win the game.
		System.out.println("Welcome, gambler. What's your name?");
		String name = kb.next();
		System.out.println(name + ", huh? Are you ready to play? (Y/N)");
		String ready = kb.next();

		if (ready.equals("Y")) {
			int score = Player.startGamePlay();
			int dealerScore = Dealer.startGamePlayDealer();
			Table.contGamePlay(score);
			if (Player.lose == false && Player.win == false){
				Table.dealerPlay(dealerScore);
			}
			Table.winDetermine();
			//Player.playerScore(score);
		} else {
			System.out.println("A sore loser, eh? Well, we don't like your kind around these parts.");
			kb.close();
		}
	}
}
/*
 * Greeting / name Game prompts (stay, hold)
 * 
 */
/* To do:
 * Write sysout for if the dealer loses. Determine whether that means the player wins
 * Sort out what happens if both dealer and player stand (if/else statements with boolean)
 * Clean up the interface so that there aren't repeats of win/stand/etc
 * write plot
 * add ASCII/fix unicode
 * clean up README
 */
