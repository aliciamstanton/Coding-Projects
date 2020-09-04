// This is the client file for the Tic-Tac-Toe Final Project

// Alicia Stanton

// May 2, 2020

// CS 150 5:30- 9:30 PM Monday 


#include "Header.h"

int main() 
{

  
 /* // Dummy board that will show the positions that can be chosen
   dummyBoard();

   // We will ask the user to pick a spot from 1-9 and will validate 
  
  // Variable that will hold the user choice
int userChoice; 

//********************************************
// Loop that will validate that the user choice is one of the spaces between 1 -9: 

cout << "Please enter the space you would like to take: ";

do
{
  // Take in the user choice 
  cin >> userChoice;

  if(userChoice < 1 || userChoice > 9)
  {
    cout << "Please make sure to choose a number between 1 - 9: "; 
  }

}while(userChoice < 1 || userChoice > 9);
//*****************************************


// Check the getPlayerInfo() method
getPlayerInfo();

// Test our get player one and get player two info methods
cout << "Player One, before swap: " << getPlayerOne() << endl;


 cout << "Player Two, before swap: " << getPlayerTwo() << endl;

 // Now we want to test that the swap player method works
 changePlayer();

// Recall the getplayer methods to see if the swap occurred
cout << "Player One, after the swap: " << getPlayerOne() << endl;

cout << "Player Two, after the swap: " << getPlayerTwo() << endl;


// Now we want to test the update space method
updateSpace(userChoice);

// Now we want to check that the board is updated
showBoard();

// We want to test the checkspot method
if(checkSpot(userChoice) == true)
{
  cout << "This spot is already taken!" << endl;
}
else 
{
  cout << "You can choose this spot" << endl;
}

*/

play();


  
}