import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Main 
{
  public static void main(String[] args) 
  {
    // Create a keyword - keyword should be "Welcome", using "welcom" to mimic the removal of duplicates.
   String keyword = "Welcom";
   keyword = keyword.toLowerCase();

   // Create a list that will hold the character array 
   // of that keyword 
   List<Character> keywordChar = new ArrayList<>();

  // Adds each of the characters to the array 
   for(char ch: keyword.toCharArray())
   {
     keywordChar.add(ch);
   }
   //----------------------------------------------
   // Prints out the entire character arrayList of the word
   // welcome
   System.out.println(keywordChar);

   // Create the alphabet as a list 
   String plainAlphabet = "abcdefghijklmnopqrstuvwxyz";

   List<Character> plainAlphabetChar = new ArrayList<>();

   for(char charAlpha : plainAlphabet.toCharArray())
   {
     plainAlphabetChar.add(charAlpha);
   }

   System.out.println(plainAlphabetChar);

//----------------------------------------------------

   // Create what will be the cipherAlphabet
   String cipherAlphabet = "abcdefghijklmnopqrstuvwxyz";

   // Turn this into a list, at this moment should match plaintext
   List<Character> cipherAlphabetChar = new ArrayList<>();

   for(char charCipher : cipherAlphabet.toCharArray())
   {
     cipherAlphabetChar.add(charCipher);
   }

   System.out.println(cipherAlphabetChar);

   //---------------------------------------------------

   // Remove the letters that were already used in the keyword from the 
   // cipherAlphabet

   for(char keychar : keyword.toCharArray())
   {
     cipherAlphabetChar.remove(new Character(keychar));
   }
   System.out.println(cipherAlphabetChar);

//-----------------------------------------------------

//  Add in the unique characters from the keyword into the beginning
// of the array list for the cipherAlphabet - 

    for(int i = 0; i <keyword.length(); i++)
    {
      cipherAlphabetChar.add(i, keyword.charAt(i));
    }
  
  System.out.println(cipherAlphabetChar);

  //---------------------------------------------------


  // Print out the cipherAlphabet and the plainAlphabet near each other 
  // to determine the number of collisions
System.out.println();
System.out.println();

 System.out.println("Plain Alphabet: " + plainAlphabetChar);
 System.out.println("Cipher Alphabet: " + cipherAlphabetChar);

 // Should be an if else statement here for the length of the array. Since
 // we always know the array will have 26 elements, nothing more and nothing less.

//----------------------------------------------------
// Updates made below this line:
//----------------------------------------------------

// DEFINE A PLAINTEXT BELOW:
String plainText = "Welcome to the lab";

// Make sure that all letters are lowercase to work with our encrpyption scheme
plainText = plainText.toLowerCase();

// ENCRYPTION STARTS HERE:
int index = 0;

// Empty string that will hold our cipherText, initialized outside the loop so we can reference it elsewhere
String cipherText = " ";

// Create a placeholder that we can use for each character that we will iterate over
char sub;
char cipherAdd;
for(int i = 0; i <plainText.length(); i++)
{
// Work on each character individually
sub = plainText.charAt(i);

// Spaces are not a part of the original or cipher alphabet
// therefore they will throw an index of -1 that cannot be 
// matched in the cipherAlphabet

if(sub == ' ')
{
 cipherAdd = ' ';
}
else
{
// Find this letter in the plainText Alphabet
index = plainAlphabetChar.indexOf(sub);

// Take this index and find the value that maps to it in the cipherAlphabet 
 cipherAdd = cipherAlphabetChar.get(index);
}

cipherText = cipherText + cipherAdd;
}

System.out.println(cipherText);

// ENCRYPTION ENDS HERE: 

//-------------------------------------------
// DECRYPTION STARTS HERE:

int reverseIndex = 0;

// Create placeholders that we can use to iterate over each character
char reverseSub;
char plainAdd;

// Create an empty String that we can place our message into 
String decryptedMessage = " ";

for(int i = 0; i <cipherText.length(); i++)
{
  // Iterate over each item individually
  reverseSub = cipherText.charAt(i);

  // Make sure to maintain the spaces, as these do not hold indeces within the plainAlphabet or cipherAlphabet

  if(reverseSub == ' ')
  {
    plainAdd = ' ';
  }
  else
  {
    // Find this letter in the cipherAlphabet 
    reverseIndex = cipherAlphabetChar.indexOf(reverseSub);

    // Take this index and find the corresponding letter in the plainAlphabet at the same location
    plainAdd = plainAlphabetChar.get(reverseIndex);
  }

  // Append to the end of the string to form the decrypted message
  decryptedMessage = decryptedMessage + plainAdd;

}

// Print out the decryptedMessage
System.out.println(decryptedMessage);
// DECRYPTION ENDS HERE:


// Calculating the number of collisions below:
// Test how to get the number of Collisions between the cipherAlphabet and the plainAlphabet 

// in the method call, it will take in the ciperAlpha and plainAlpha as parameters

// Initialize the number of collisions to 0
int numberOfCollisions = 0;

// Get the size of the plainAlphabetChar
int plainAlphaSize = plainAlphabetChar.size();

// Should return 26
System.out.println(plainAlphaSize);

// Get the size of the cipherAlphabetChar
int cipherAlphaSize = cipherAlphabetChar.size();

// Should also return 26
System.out.println(cipherAlphaSize);

for(int i = 0; i < plainAlphabetChar.size(); i++)
{
  if(plainAlphabetChar.get(i) == cipherAlphabetChar.get(i))
  {
    numberOfCollisions++;
  }
}

System.out.println(numberOfCollisions);


  }
}