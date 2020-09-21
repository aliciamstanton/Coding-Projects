import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DirectoryTest 
{

	
	// JUnit test to see if the item was removed correctly 
	@Test
	void RemoveTest() 
	{
		// We are testing the Directory Class - Create a new Directory Object
		Directory theDirectory = new Directory();
		
		// Add two random entries to the directory for reference
		theDirectory.addOrChangeEntry("Alicia Stanton", "9417693140");
		theDirectory.addOrChangeEntry("Bhrigu Celly", "7465819546");
		
		// Take out the current size of the directory - Should be 2
		int sizeOfDirectory = theDirectory.sizeOfDirectory();
		
		// Then we want to call the remove method 
		theDirectory.removeEntry("Alicia Stanton");
		
		// The test should return 1 as the size because we have removed one
		assertEquals(1, theDirectory.sizeOfDirectory());
		
		//fail("Not yet implemented");
	}
	
	
	//JUnit test to see if the addOrChange is working in regard to adding entries 
	@Test
	void addTest()
	{
		// Create a new Directory to test
		Directory secondDirectory = new Directory();
		
		// hold the size of the directory, which should be zero since
		// we have no entries at this time
		int size = secondDirectory.sizeOfDirectory();
		
		// Then we want to add an entry
		secondDirectory.addOrChangeEntry("Jack Martin",  "7068646839");
		
		// Now we can check the size again
		size = secondDirectory.sizeOfDirectory();
		
		// Now we want to test, which should return one as we have added an entry
		assertEquals(1,size);
		//fail("Not yet implemented");
	}
	
	// Junit test to see if the addOrChange method is working in regard to changing entries
	@Test
	void changeTest()
	{
		// Create a new Directory object
		Directory thirdDirectory = new Directory();
		
		// Create a new DirectoryEntry object
		DirectoryEntry newEntry = new DirectoryEntry("Alicia Stanton", "9417693140");
		
		// Add two entries randomly
		thirdDirectory.addOrChangeEntry(newEntry.getName(), newEntry.getNumber());
		thirdDirectory.addOrChangeEntry("Bhrigu Celly",  "7465819546");
		thirdDirectory.addOrChangeEntry("Andrea Stanton",  "9417690849");
		
		// Get a string value to hold the number for Alicia
		String aliciaNumber = newEntry.getNumber();
		
		// Now we want to change that number
		thirdDirectory.addOrChangeEntry("Alicia Stanton",  "7068646839");
		
		// Grab the entry of myself, since we know it is at index 0
		DirectoryEntry myEntry = thirdDirectory.printEntry(0);
		
		// Now that we have access to the entry we need to access the number
		String myNumber = myEntry.getNumber();
		
		// Now we can test to see if this changed from the new entry above 
		assertEquals("7068646839", myNumber);
		
		//fail("Not yet implemented");
	}

}
