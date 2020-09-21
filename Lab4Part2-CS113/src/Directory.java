// Class that has DirectoryEntry as a data field 
import java.util.ArrayList;

public class Directory 
{
	
	// Create a data field that uses DirectoryEntry Objects as the Data type
	private ArrayList<DirectoryEntry> theDirectory;
	
	
	// Create a constructor that will initialize the directory
	public Directory()
	{
		theDirectory = new ArrayList<DirectoryEntry>();
	}
	
	// Method to addOrChangeEntry - needs to return null if the 
	// entry is not in the directory or return the old number
	// if the name is found in the directory
	public String addOrChangeEntry(String aName, String newNumber)
	{
		// Looks for a directory entry with the name we have provided
		int index = theDirectory.indexOf(new DirectoryEntry(aName));
		
		// If we find this item in the list, we want to return the old number and
		// update it to a new number 
		if(index != -1)
		{
			// Grab the old Phone Number
			String oldNumber = theDirectory.get(index).getNumber();
			
			// Then we want to replace it
			theDirectory.set(index, new DirectoryEntry(aName, newNumber));
			
			// Then we want to return the number we replaced
			return oldNumber;
			
		}
		
		// If the item is not in the list, then we should return null and add this item
		// to the directory
		else
		{
			theDirectory.add(new DirectoryEntry(aName, newNumber));
			
			return null;
		}
		
	}
	
	
	
	// Method to remove an entry - needs to return null if the entry
	// is not in the directory
	public DirectoryEntry removeEntry(String aName)
	{
		// Search for the item in the directory
		int indexOfEntry = theDirectory.indexOf(new DirectoryEntry(aName));
		
		// if the index is -1, then the item is not in the current directory
		// and we can return null
		if(indexOfEntry == -1)
		{
			return null;
		}
		
		// If the item is in the directory, then we want to find it and remove it 
		else
		{
			// Create another directory Entry that will hold the one we are removing
			DirectoryEntry removedEntry = theDirectory.get(indexOfEntry);
			
			// Then we want to remove that item
			theDirectory.remove(indexOfEntry);
			
			// Then return the entry back to the console
			return removedEntry;
		}
		
	}
	
	// Want to be able to print the directory
	public void printDirectory()
	{
		for(int i = 0; i < theDirectory.size(); i++)
		{
			System.out.println(theDirectory.get(i));
		}
	}
	
	// Want to have the size of the directory
	public int sizeOfDirectory()
	{
		return theDirectory.size();
	}
	
	
	// Want to return a specific directory Entry
	public DirectoryEntry returnEntry(ArrayList<DirectoryEntry> theDirectory, String aName)
	{
		int indexEntry = theDirectory.indexOf(new DirectoryEntry(aName, " "));
		
		DirectoryEntry entryToReturn = theDirectory.get(indexEntry);
		
		return entryToReturn;
		
	}
	
	public DirectoryEntry printEntry(int index)
	{
		// Create a directory entry we want 
		DirectoryEntry entryToReturn = new DirectoryEntry();
		
		
		entryToReturn = theDirectory.get(index);
		
		return entryToReturn;
	}
	
	
	
	

}
