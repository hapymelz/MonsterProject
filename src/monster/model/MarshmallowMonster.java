package monster.model;

public class MarshmallowMonster
{
	private String name;
	private int eyeCount;
	private int hair;
	private int legCount;
	private boolean teeth;
	private boolean hasNose;
	private boolean hasTail;
	private double cutenessQuotient;
	private double adorableDeathPercent;

	public MarshmallowMonster()
	{
		this.name = "Charlie";
		this.eyeCount = 3;
		this.hair = 15;
		this.legCount = 4;
		this.teeth = true;
		this.hasNose = true;
		this.hasTail = true;	
		this.adorableDeathPercent = eyeCount * 20;
		this.cutenessQuotient = adorableDeathPercent * 5;
		
	}
	
	public MarshmallowMonster(String name, int eyeCount, int hair, int legCount, boolean teeth, boolean hasNose, boolean hasTail, double cutenessQuotient, double adorableDeathPercent)
	{ 		
		this.name = name;
		this.eyeCount = eyeCount;
		this.hair = hair;
		this.legCount = legCount;
		this.teeth = teeth;
		this.hasNose = hasNose;
		this.hasTail = hasTail;
		this.cutenessQuotient = cutenessQuotient;
		this.adorableDeathPercent = adorableDeathPercent;
	}
	
	
	
	// Getters
	
	
	
	public String getName()
	{
		return this.name;
	}
	
	public int getEyeCount()
	{
		return this.eyeCount;
	}
	
	public int getHair()
	{
		return this.hair;
	}

	public int getLegCount()
	{
		return this.legCount;
	}
	
	public boolean getTeeth()
	{
		return this.teeth;
	}
	
	public boolean getHasNose()
	{
		return this.hasNose;
	}
	
	public boolean getHasTail()
	{
		return this.hasTail;
	}
	
	public double getCutenessQuotient()
	{
		return this.cutenessQuotient;
	}
	
	public double getAdorableDeathPercent()
	{
		return this.adorableDeathPercent;
	}
	
	
	
	// Setters
	
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHair(int hair)
	{
		this.hair = hair;
	}
	
	public void setLegCount(int legCount)
	{
		this.legCount = legCount;
	}
	
	public void setHasNose(boolean hasNose)
	{
		this.hasNose = hasNose;
	}
	
	public void setTeeth(boolean teeth)
	{
		this.teeth = teeth;
	}
	
	public void setHasTail(boolean hasTail)
	{
		this.hasTail = hasTail;
	}
	
	public void setCutenessQuotient( double cutenessQuotient)
	{
		this.cutenessQuotient = cutenessQuotient;
	}
	
	public void setAdorableDeathPercent(double adorableDeathPercent)
	{
		this.adorableDeathPercent = adorableDeathPercent;
	}
	
	
	
	
	@Override
	public String toString()
	{
		String description = "I am a monster, and my name is " + name;
		description += ".\n";
		description += "I have " + eyeCount + " eyes!\n";           
		description += "I have " + hair + " strands of hair!\n";
		description += "I have " + legCount + " legs!\n";
		if (hasNose == true)
		{
			description += "I have a nose!\n";
		}
		else
		{
			description += "I do not have a nose.\n";
		}
		if (teeth == true)
		{
			description += "I have teeth!\n";
		}
		else
		{
			description += "I do not have teeth.\n";
		}
		if (hasTail == true)
		{
			description += "I have a tail!\n";
		}
		else
		{
			description += "I do not have a tail.\n";
		}
		description += "Most people will rate me " + cutenessQuotient + "/10.0\n";
		description += "The probability that you would die of adorableness once you gaze upon me is " + adorableDeathPercent + "%\n";		
		
		return description;
	}
	
	
}
