 package monster.tests;

/**
 * Project imports
 */
import java.util.Scanner;
import monster.model.MarshmallowMonster;
import monster.controller.Controller;

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


class ControllerTest
{
	private Controller testedController;

	@BeforeEach
	void setUp() throws Exception
	{
		this.testedController = new Controller();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		this.testedController = null;
	}

	@Test
	public void testRequiredDataMembers()
	{
		Field [] dataMembers = testedController.getClass().getDeclaredFields();
		int memberCount = dataMembers.length;
		int requiredVisibility = dataMembers.length * -1;
		boolean hasScanner = false;
		int monsterCount = 0;
		
		for (Field currentField : dataMembers)
		{
			int modifiers = currentField.getModifiers();
			
			
			if (currentField.getType().equals(Scanner.class))
			{
				hasScanner = true;
			}
			if (currentField.getType().equals(MarshmallowMonster.class))
			{
				monsterCount++;
			}
			if (Modifier.isPrivate(modifiers))
			{
				requiredVisibility++;
			}
			
		}
		assertTrue(hasScanner, "Your Scanner instance needs to be a data member not a local variable");
		assertFalse(memberCount < 3, "You need at least 3 data members for this assignment: Scanner and two monsters");
		
		assertTrue(monsterCount >= 2, "You need at least two MarshmallowMonster data members");
		assertTrue(requiredVisibility == 0, "All data members need to be private as a rule");
	}


}
