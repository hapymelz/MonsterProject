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
		this.cutenessQuotient = adorableDeathPercent * 5;
		this.adorableDeathPercent = eyeCount * 4;
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
}
