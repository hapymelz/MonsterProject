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
		System.out.print("I made a mosnster!");
		System.out.print(myMonster.getName() + " is its name!");
		
		
	}
}
