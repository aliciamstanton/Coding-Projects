
public class DirectoryEntry 
{
	
	// Data Fields
	private String name;
	
	private String number;
	
	
	
	
	// Methods
	
	// Default Constructor
	public DirectoryEntry()
	{
		name = " ";
		number = " ";
	}
	
	// Partial Constructor
	public DirectoryEntry(String nameIn)
	{
		name = nameIn;
		number = " ";
	}
	
	
	// Full Constructor
	public DirectoryEntry(String nameIn, String numberIn)
	{
		name = nameIn;
		number = numberIn;
	}
	
	// Getter Methods
	public String getName()
	{
		return this.name;
	}
	
	public String getNumber()
	{
		return this.number;
	}
	
	// Setter Methods
	public void setName(String nameIn)
	{
		name = nameIn;
	}
	
	public void setNumber(String numberIn)
	{
		number = numberIn;
	}
	
	
	// String representation of the Entry
	@Override
	public String toString()
	{
		return "Name: " + this.name + "; Number: " + this.number;
	}
	
	// Equals Method
	@Override 
	public boolean equals(Object obj)
	{
		// Null check
		if(obj == null)
		{
			return false;
		}
		
		// Self Check
		if(obj == this)
		{
			return true;
		}
		
		// Class Check
		if(obj.getClass() != this.getClass())
		{
			return false;
		}

		// Type Check - need to check that names are equal 
		
		DirectoryEntry other = (DirectoryEntry) obj;
		if(other.name == this.name)
		{
			return true;
		}
		
		// If none of the above are true, then return false
		return false;
		
	}
	
	
	
	
	
	
	

}
