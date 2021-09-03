package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster myMonster;
	
	public MonsterController()
	{
		this.myMonster = new MarshmallowMonster();
		
	}
	
	public void start()
	{
		System.out.println("I made a mosnster!");
		System.out.println(myMonster.getName() + " is its name!");
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
		
		
	}
}
