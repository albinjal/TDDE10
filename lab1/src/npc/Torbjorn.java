package npc;

import java.util.Scanner;

import the_adventure.Player;

public class Torbjorn extends Human {
	private Scanner keyboard;
	private Boolean win = false;

	
	public Torbjorn(String name, Player player) {
		super(name, player);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void interactWith(Player player) {
		String command;
		System.out.printf("I am you course admin. I hope you have studied well so that you are prepared for whats to come!\n");
		command = keyboard.nextLine();
		this.addCommand("Do exam ", () -> this.exam(player));

	}
	
	@Override
	public void observe() {
		System.out.printf("%s is standing, lurking in the shadows...\n", this.getName());
	}
	
	private void exam(Player player) {
		
		if (player.getStamina() > 70) {
			System.out.print("You did not pass the exam due too exhaustion!!");
		}
		else {
			System.out.print("You passed the exam!!");
		}
	}
	
	

}
