package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;


public class Controller
{
	private MarshmallowMonster myMonster;
	private MarshmallowMonster customMonster;
	private Scanner input;
	
	public Controller()
	{
		this.myMonster = new MarshmallowMonster();
		this.customMonster = new MarshmallowMonster("Jeb_", 2, 26, 7, false, true, false, 0.0, 0.0);
		this.input = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("I made a monster!");
		System.out.println(myMonster.getName() + " is its name!");
		System.out.println("My custom monster's name is " + customMonster.getName());
		System.out.println("My monster has " + myMonster.getEyeCount() + " eyes!");
		System.out.println("My monster has " + myMonster.getHair() + " strands of hair!");
		System.out.println("My monster has " + myMonster.getLegCount() + " legs!");
		if (myMonster.getHasNose() == true)
		{
			System.out.println("My monster has a nose!");
		}
		else
		{
			System.out.println("My monster does not have a nose!");
		}
		if (myMonster.getTeeth() == true)
		{
			System.out.println("My monster has teeth!");
		}
		else
		{
			System.out.println("My monster does not have teeth!");
		}
		if (myMonster.getHasTail() == true)
		{
			System.out.println("My monster has a tail!");
		}
		else
		{
			System.out.println("My monster does not have a tail!");
		}
		System.out.println("Most people will rate my Monster " + myMonster.getCutenessQuotient() + "/10.0");
		System.out.println("The probability that you would die of adorableness once you gaze upon my monster is " + myMonster.getAdorableDeathPercent() + "%");
	
		System.out.println(myMonster);
		
		System.out.println("What should my monster's new name be?");
		String response = input.next();
		
		
		myMonster.setName(response);
		System.out.println("My monster is now named " + myMonster.getName());
	}
}
