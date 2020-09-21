// Driver for the DirectoryEntry Class 
public class Main 
{

	public static void main(String[] args) 
	{
		// Test that the DirectoryEntry Class is functioning as it should
		DirectoryEntry newEntry = new DirectoryEntry();
		
		// Suppose we want to set the name
		newEntry.setName("Alicia Stanton");
		
		// Suppose we want to set the number
		newEntry.setNumber("9417693140");
		
		
		// Create a Directory object
		Directory theDirectory = new Directory();
		
		
		theDirectory.addOrChangeEntry(newEntry.getName(), newEntry.getNumber());
		
		// Test to see if an entry already exists - returns null if not already in directory
		System.out.println(theDirectory.addOrChangeEntry("Trevor Kelly", "8588695599"));
		
		
		// Test to make sure that the item was added correctly, since it shouldn't be there 
		theDirectory.printDirectory();
		
		// Now we want to test the remove method
		theDirectory.removeEntry("Trevor Kelly");
		
		// Print out the directory again
		theDirectory.printDirectory();
		
		// We should test just changing the number as well
		theDirectory.addOrChangeEntry("Alicia Stanton", "7068646839");
		
		// print out the directory again
		theDirectory.printDirectory();
		


	}

}
