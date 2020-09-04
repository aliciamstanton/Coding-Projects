// Author: Alicia Stanton

// Date: June 2, 2020

// Description: Affine Cipher. This is a shift cipher with both a multiplication and an addition shift component
import java.util.ArrayList;
import java.util.Scanner;
class Main 
{
  public static void main(String[] args)
  {

    Scanner keyboard = new Scanner(System.in);

   // First we want to create or arrayList alphabet*****************

    String plainAlpha = "abcdefghijklmnopqrstuvwxyz";

    // Create the arrayList
    ArrayList<Character> plainAlphaSet = new ArrayList<Character>();


    // Create a single character value 
    char plainValue;

    // Iterate over the entire list and add each character to the arrayList individually

    for(int i = 0; i < plainAlpha.length(); i++)
    {
      // Take each character at a single index 
      plainValue = plainAlpha.charAt(i);

      // Then we want to add it to the arrayList 
      plainAlphaSet.add(plainValue);

      //*****************************

    }

 // DEBUG
      System.out.print(plainAlphaSet);

      System.out.println();

    // We want to ask the user for a string to encrypt

    System.out.print("Please enter what you'd like to encrypt: ");

    String userMessage = keyboard.next();

    // Make sure that the userMessage is all lowercase 
    userMessage = userMessage.toLowerCase();

    //DEBUG
   // System.out.println(userMessage);


    //**********************************

    // First we need to get the multiplicator
    System.out.print("Please enter the multiplicator: ");

    int multiplicator = keyboard.nextInt();


    // DEBUG
    System.out.println("Multiplicator: " + multiplicator);


    // Second we need to get the additor
    System.out.print("Please enter the additor: ");

    int additor = keyboard.nextInt();

    // DEBUG
    System.out.println("Additor: " + additor);

    System.out.println();

    //**********************************


    // Take each character and compare it to the items in the arrayList - providing the index that these items can be found at in the arrayList

  // Variables ****************************
    int currentIndex;
    int newIndex;
    int modIndex;
    char encryptedValue;
    String encryptedText = "";

    //************************************

    // Encryption Loop *******************************

    for(int k = 0; k < userMessage.length(); k++)
    {
       System.out.print(userMessage.charAt(k) + " ");
      currentIndex = plainAlphaSet.indexOf(userMessage.charAt(k));
      
      System.out.println(currentIndex);

      // Now we want to use the multiplicator to update the index of these items 


     // DEBUG - make sure the index is correct 
     newIndex = currentIndex * multiplicator;

     //System.out.println("UPDATED INDEX: " + newIndex);

     // Now we need to do the additor as well and reprint the index

      newIndex += additor;

      // DEBUG - make sure the index is correct
     // System.out.println("FINAL INDEX: " + newIndex);

      // Now we mod these items by 26 to see what index they would fall in for the alphabet

      modIndex = newIndex % 26;

      // DEBUG - Index should be lower than 26 
      //System.out.println("MODDED INDEX: " + modIndex);

      // Now we want to figure out which character is at that index in the alphabet to figure out what the encrypted letter is 

      encryptedValue = plainAlphaSet.get(modIndex);


      // Add each item to a string and we will print the message outside the loop
      encryptedText += encryptedValue;
    }

    // End of Encryption Loop ********************************

    System.out.println();


// Here we will print the encrypted message
System.out.println("Your encrypted message is: " + encryptedText);
   




   
    







    
  }
}