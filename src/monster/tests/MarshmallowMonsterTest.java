package monster.tests;

/**
 * Project imports
 */

import monster.model.MarshmallowMonster;

/**
 * Reflection imports
 */
import java.lang.reflect.*;

/**
 * Testing imports
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarshmallowMonsterTest
{
	private MarshmallowMonster testedMonster;

	@BeforeEach
	void setUp() throws Exception
	{
		testedMonster = new MarshmallowMonster();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		testedMonster = null;
	}

	@Test
	void testMarshmallowMonster()
	{
		assertNotNull(testedMonster, "If you have a zero parameter constructor this cannot fail.");
		assertNotNull(testedMonster.getName(), "Your default constructor must initialize the name data member.");
		Constructor [] constructors = testedMonster.getClass().getDeclaredConstructors();
		assertTrue(constructors.length >= 2, "You need to write at least two constructors for your object");
	}
	
	@Test
	public void testGettersAndSetters()
	{
		Method [] methods = testedMonster.getClass().getDeclaredMethods();
		int getterCount = 0;
		int setterCount = 0;
		int requiredVisibility = 0;
		for (Method currentMethod : methods)
		{
			int currentModifier = currentMethod.getModifiers();
			if (currentMethod.getName().contains("get"))
			{
				getterCount++;
				if(Modifier.isPublic(currentModifier))
				{
					requiredVisibility++;
				}
			}
			if (currentMethod.getName().contains("set"))
			{
				setterCount++;
				if(Modifier.isPublic(currentModifier))
				{
					requiredVisibility++;
				}
			}
		}
		assertTrue(getterCount >= 6, "Not all data members have a getter");
		assertTrue(setterCount >= 6, "Not all data members have a setter");
		assertTrue(requiredVisibility >= 12, "All getters/setters need public visibility");
	}

	@Test
	public void testToString()
	{
		Method [] methods = testedMonster.getClass().getDeclaredMethods();
		for (Method currentMethod : methods)
		{
			if (currentMethod.getName().equals("toString"))
			{
				String toStringResult = testedMonster.toString();
				assertFalse(toStringResult.indexOf("monster.model") >= 0, "The fully qualified name should not be part of the toString");
			}
		}
		
	}

}
