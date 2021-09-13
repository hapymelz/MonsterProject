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
//		System.out.println("I made a monster!");
//		System.out.println(myMonster.getName() + " is its name!");
//		System.out.println("My custom monster's name is " + customMonster.getName());
//		System.out.println("My monster has " + myMonster.getEyeCount() + " eyes!");
//		System.out.println("My monster has " + myMonster.getHair() + " strands of hair!");
//		System.out.println("My monster has " + myMonster.getLegCount() + " legs!");
//		
//		if (myMonster.getTeeth() == true)
//		{
//			System.out.println("My monster has teeth!");
//		}
//		else
//		{
//			System.out.println("My monster does not have teeth!");
//		}
//		if (myMonster.getHasTail() == true)
//		{
//			System.out.println("My monster has a tail!");
//		}
//		else
//		{
//			System.out.println("My monster does not have a tail!");
//		}
//		System.out.println("Most people will rate my Monster " + myMonster.getCutenessQuotient() + "/10.0");
//		System.out.println("The probability that you would die of adorableness once you gaze upon my monster is " + myMonster.getAdorableDeathPercent() + "%");
//	
//		System.out.println(myMonster);
//		
//		System.out.println("What should my monster's new name be?");
//		String response = input.next();
//		
//		
//		myMonster.setName(response);
//		System.out.println("My monster is now named " + myMonster.getName());
//		
		System.out.println("How many monsters would you like to make?");
		int monsterNumber = input.nextInt();
		
		makingMonsters(monsterNumber);
	}
	
	private void makingMonsters(int times)
	{
		while (times > 0)
		{
			MarshmallowMonster custom = new MarshmallowMonster();
			
			System.out.println("What is your monsters name?");
			custom.setName(input.next());
			System.out.println("How many eyes does your monster have?");
			custom.setEyeCount(input.nextInt());
			System.out.println("How many hair strands does your monster have?");
			custom.setHair(input.nextInt());
			System.out.println("How many legs does your monster have?");
			custom.setLegCount(input.nextInt());
			System.out.println("Does your monster have a nose? true/false");
			custom.setHasNose(input.nextBoolean());
			System.out.println("Does your monster have teeth? true/false");
			custom.setTeeth(input.nextBoolean());
			System.out.println("Does your monster have a tail? true/false");
			custom.setHasTail(input.nextBoolean());
			
			custom.setAdorableDeathPercent(custom.getEyeCount() * 20);
			custom.setCutenessQuotient((custom.getAdorableDeathPercent() * 5) / 10);
			
			System.out.println("Meet your custom monster! ");
			
			System.out.println(custom);
			
			
			
			times -= 1;
		}
	}
	private void monsterLoops()
	{
		for (int index = 0; index < 6; index++)
								// or index += 1
		{
			MarshmallowMonster monster = new MarshmallowMonster();
			System.out.println("What is your monsters name?");
			monster.setName(input.next());
			System.out.println("How many eyes does your monster have?");
			monster.setEyeCount(input.nextInt());
			System.out.println("How many hair strands does your monster have?");
			monster.setHair(input.nextInt());
			System.out.println("How many legs does your monster have?");
			monster.setLegCount(input.nextInt());
			System.out.println("Does your monster have a nose? true/false");
			monster.setHasNose(input.nextBoolean());
			System.out.println("Does your monster have teeth? true/false");
			monster.setTeeth(input.nextBoolean());
			System.out.println("Does your monster have a tail? true/false");
			monster.setHasTail(input.nextBoolean());
			
			monster.setAdorableDeathPercent(monster.getEyeCount() * 20);
			monster.setCutenessQuotient((monster.getAdorableDeathPercent() * 5) / 10);
			
		}
	}
	
}
