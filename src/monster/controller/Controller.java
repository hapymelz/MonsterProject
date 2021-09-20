package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import java.util.ArrayList;


public class Controller
{
	private MarshmallowMonster myMonster;
	private MarshmallowMonster customMonster;
	private Scanner input;
	private ArrayList<MarshmallowMonster> myMonsterList;
	private ArrayList<MarshmallowMonster> puppyList;
	
	public Controller()
	{
		this.myMonster = new MarshmallowMonster();
		this.customMonster = new MarshmallowMonster("Jeb_", 2, 26, 7, false, true, false, 0.0, 0.0);
		this.input = new Scanner(System.in);
		this.myMonsterList = new ArrayList<MarshmallowMonster>();
		this.puppyList = new ArrayList<MarshmallowMonster>();
	}
	
	public void start()
	{
	
		LoopPractice(6);
		
		testANewLoop();
		
		createAFamily();
		
		monsterLoops();
		
		System.out.println("I made a monster!");
		System.out.println(myMonster.getName() + " is its name!");
		System.out.println("My custom monster's name is " + customMonster.getName());
		
		System.out.println(myMonster);
		
		System.out.println("What should my monster's new name be?");
		String response = input.next();
		
		
		myMonster.setName(response);
		System.out.println("My monster is now named " + myMonster.getName());
		
		System.out.println("How many monsters would you like to make?");
		int monsterNumber = input.nextInt();
		
		makingMonsters(monsterNumber);
	}
	
	private void testANewLoop()
	{
		myMonsterList.clear();
		
		MarshmallowMonster temp = new MarshmallowMonster();
		temp.setName("Demo");
		myMonsterList.add(temp);
		
		temp = new MarshmallowMonster();
		temp.setName("Another monster");
		myMonsterList.add(temp);
		
		temp = new MarshmallowMonster();
		temp.setName("third monster");
		myMonsterList.add(temp);
		
		// Demo the For Each loop
		for (MarshmallowMonster currentMonster : myMonsterList)
		{
			System.out.println(currentMonster.getName() + " is my name!");
		}
		
		
		for (MarshmallowMonster current : myMonsterList)
		{
			current.setName(current.getName() + " updated");
		}
		
		
		for (MarshmallowMonster currentMonster : myMonsterList)
		{
			System.out.println("The updated name is: " + currentMonster.getName());
		}
		
		
		
	}
	
	private void makingMonsters(int times)
	{
		while (times > 0)
		{
			MarshmallowMonster custom = new MarshmallowMonster();
			
			System.out.println("What is your monsters name?");
			custom.setName(input.nextLine());
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
			
			System.out.println("\nMeet your custom monster!\n");
			
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
//			System.out.println("How many eyes does your monster have?");
//			monster.setEyeCount(input.nextInt());
//			System.out.println("How many hair strands does your monster have?");
//			monster.setHair(input.nextInt());
//			System.out.println("How many legs does your monster have?");
//			monster.setLegCount(input.nextInt());
//			System.out.println("Does your monster have a nose? true/false");
//			monster.setHasNose(input.nextBoolean());
//			System.out.println("Does your monster have teeth? true/false");
//			monster.setTeeth(input.nextBoolean());
//			System.out.println("Does your monster have a tail? true/false");
//			monster.setHasTail(input.nextBoolean());
//			
//			monster.setAdorableDeathPercent(monster.getEyeCount() * 20);
//			monster.setCutenessQuotient((monster.getAdorableDeathPercent() * 5) / 10);
//			
			myMonsterList.add(monster);
			
		}
		System.out.println("\nI made " + myMonsterList.size() + " monsters");
		
		for (int index = 0; index < myMonsterList.size(); index++)
		{
			System.out.println("The monster at index " + index + " has a name of " + myMonsterList.get(index).getName());
		}
		
		System.out.println(myMonsterList.get(myMonsterList.size() - 1).getName());
		
		
		MarshmallowMonster specialMonster = new MarshmallowMonster();
		specialMonster.setName("devin");
		myMonsterList.add(2, specialMonster);
		
		MarshmallowMonster removedMonster = myMonsterList.remove(0);
		System.out.println(removedMonster.getName() + " was removed from the list");
		
		MarshmallowMonster alsoRemoved = myMonsterList.set(3, removedMonster);
		System.out.println("I replaced " + alsoRemoved.getName() + " with " + removedMonster.getName());
		
		for (int index = 0; index < myMonsterList.size(); index++)
		{
			System.out.println("The monster at index " + index + " has a name of " + myMonsterList.get(index).getName());
		}
		
	}
	
	private void createAFamily()
	{
		
	
		for (int index = 0; index < 6; index++)
		{
			MarshmallowMonster monster = new MarshmallowMonster();
			System.out.println("What is monster " + (index + 1) + "'s name?");
			monster.setName(input.nextLine());
			myMonsterList.add(monster);
			
		}
		
		for (int index = 0; index < myMonsterList.size(); index++)
		{
			System.out.println(myMonsterList.get(index).getName() + " is in the family!");
		}
		
		MarshmallowMonster deadMonster = myMonsterList.remove(5);
		System.out.println("\n" + deadMonster.getName() + " died. So sad.");
		
		
		System.out.println("\nA new baby monster has joined the family! What do you want to name it?");
		MarshmallowMonster baby = new MarshmallowMonster();
		baby.setName(input.nextLine());
		
		myMonsterList.add(2, baby);
		System.out.println(baby.getName() + " is now in the family\n");
		
		
		MarshmallowMonster prodigalSon = myMonsterList.get(3);
		System.out.println(prodigalSon.getName() + " has a new friend. What is his name?");
		MarshmallowMonster friend = new MarshmallowMonster();
		friend.setName(input.nextLine());
		
		System.out.println(prodigalSon.getName() + " ran away. " + friend.getName() + " has now joined the family. ");
		myMonsterList.set(3, friend);
		
		
		System.out.println("\nHere is the new family: \n");
		for (int index = 0; index < myMonsterList.size(); index++)
		{
			System.out.println(myMonsterList.get(index).getName() + " is in the family!");
		}
		
	}
	
	private void LoopPractice(int times)
	{
		myMonsterList.clear();
		for (int index = 0; index < 6; index++)
		{
			MarshmallowMonster monster = new MarshmallowMonster();
			System.out.println("Name a Monster:");
			monster.setName(input.nextLine());
			
			myMonsterList.add(monster);
		}
		for (int index = 0; index < myMonsterList.size(); index++)
		{
			System.out.println(myMonsterList.get(index).getName() + " is on the list.");
		}
		
		for (MarshmallowMonster monster : myMonsterList)
		{
			System.out.println(monster.getName() + " died. So sad.");
			
		}
		
		myMonsterList.clear();
		
		while (times > 0)
		{
			System.out.println("You had a funeral for the monster that died.");
			System.out.println("Then you got a puppy. What was his name?");
			MarshmallowMonster puppy = new MarshmallowMonster();
			puppy.setName(input.nextLine());
			puppyList.add(puppy);	
			
			times -= 1;
		}
		System.out.println("You got a puppy after each of the monster funerals. Their names are: ");
		for (int index = 0; index < puppyList.size(); index++)
		{
			System.out.println(puppyList.get(index).getName());
		}
		
	}
	
	
}
