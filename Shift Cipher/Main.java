class Main 
{
  public static void main(String[] args) 
  {
  // Create a new ShiftCipher object
  ShiftCipher cipher1 = new ShiftCipher();

 // Set the ShiftSize for the new object
 cipher1.setShiftSize();

// Make sure that this information prints out correctly
System.out.println(cipher1.getShiftSize());


// Making Pseudo plainText, but can be passed down from the parent class
// since all ciphers have a plainText and a cipherText

String plainText = "Welcome to the Lab";

// Make sure that all letters are lowercase prior to doing the operation
plainText = plainText.toLowerCase();

// Print out to make sure that all letters are now lowercase
System.out.println(plainText);

// ENCRYPTION BEGINS HERE:

// Make a place for the cipherText to go, can initialize the String to empty for now so that it exists outside the for loop below

String cipherText = " ";

// Create a character placeholder that we can use to shift our elements during the encryption process

char alphaShift;


// Create a for loop to iterate over each letter in the plainText
for(int i = 0; i < plainText.length(); i++)
{
  // iterate over each character in the plainText 
  alphaShift = plainText.charAt(i);

// This reads the same as if alphaShift is >= 0 and alphaShift <= 25
  if(alphaShift >= 'a' && alphaShift <= 'z')
  {
    alphaShift = (char)(alphaShift + cipher1.getShiftSize());
  }
  // This reads the same as if alphaShift is > 25 : We want this to loop back around to the beginning of the alphabet aka O
  if(alphaShift > 'z')
  {
    alphaShift = (char)(alphaShift % 26);
  }
  // This says build the cipherText String by adding each character individually to the end of the String.
  cipherText = cipherText + alphaShift;
}
System.out.println(cipherText);

// ENCRYPTION ENDS HERE:


// DECRYPTION BEGINS HERE:

// Need to set a new shift size, should be the inverse of what was originally entered, in this case -3
cipher1.setShiftSize();

// Make sure that the information has been updated correctly by printing the information back out to the console
System.out.println(cipher1.getShiftSize());

// CipherText is already defined above and should already be lowercase based on our conditions above, will write in the code as these will be placed in separate methods within the shiftCipher class

// Make an empty String that will hold our decrypted message
String messageDecryption = " ";

// Make a character that we can use as a placeholder throughout our loop 
char shiftBack;

// Iterates over each character in the cipherText String 
for(int i = 0; i < cipherText.length(); i ++)
{
  // Work on each character individually as we iterate through the loop
  shiftBack = cipherText.charAt(i);
   
   // Maintains the spaces during the decryption process 
   if(shiftBack == ' ')
   {
     shiftBack = ' ';
   }
// This reads the same as if the shiftBack is >= 0 or <= 25
  else if(shiftBack >= 'a' && shiftBack <= 'z')
  {
    shiftBack = (char)(shiftBack - cipher1.getShiftSize());
  }
  
  // This says if the shiftBack gives our position a negative number, we want 
  // to loop back around to the end of the alphabet
  else if(shiftBack < 'a')
  {
    shiftBack = (char)(shiftBack % 26);
  }

  

  // Append each new character onto the end of the decryptedMessage String
  messageDecryption = messageDecryption + shiftBack;
}

// Print out the decrypted message to the console to ensure that the process works forwards and backwards

System.out.println(messageDecryption);

// DECRYPTION ENDS HERE:


  }
}