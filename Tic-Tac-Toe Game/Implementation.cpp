// This is the Implementation File for Tic-Tac-Toe


// Header file
#include "Header.h"


// Want to create the multidimensional array that will hold the board
char TTTBoard[3][3];

// Array that holds the players of the game
string players[2] = {"", ""};

// Int variable that holds the move number 
int counter = 1;

// Integer value that holds the user's choice for board space
int userChoice;

string winnerStatusString = "";


// This method will display a new (blank) board
void newBoard()
{
  // Header that shows the icons for each player 
  cout << "PLAYER 1 = [X] \t PLAYER 2 = [O]" << endl;
  cout << "\n\n";

// We want to default all the items in the array back to empty if we request that a new board be shown 
TTTBoard[0][0] = '\0';
TTTBoard[0][1] = '\0';
TTTBoard[0][2] = '\0';
TTTBoard[1][0] = '\0';
TTTBoard[1][1] = '\0';
TTTBoard[1][2] = '\0';
TTTBoard[2][0] = '\0';
TTTBoard[2][1] = '\0';
TTTBoard[2][2] = '\0';


 // *********** ROW 1 OF BOARD *******************
  cout << "\t\t | \t\t | \t\t " << endl;

  // Note the blank space is 6 spaces 
  cout << "      " << TTTBoard[0][0] << "\t |   "  << TTTBoard[0][1] << " \t" << " |  " << TTTBoard[0][2] << endl;
  cout << "    -------------------" << endl;

//************ ROW 2 OF BOARD ********************
  cout << "\t\t | \t\t | \t\t" << endl;

   // Note the blank space is 6 spaces 
  cout << "      " << TTTBoard[1][0] << "\t |   "  << TTTBoard[1][1] << " \t" << " |  " << TTTBoard[1][2] << endl;
  cout << "    -------------------" << endl;


//************ ROW 3 OF BOARD *******************
  cout << "\t\t | \t\t | \t\t" << endl;

    // Note the blank space is 6 spaces 
  cout << "      " << TTTBoard[2][0] << "\t |   "  << TTTBoard[2][1] << " \t" << " |  " << TTTBoard[2][2] << endl;
 
 cout << "\n\n";
}

//------------------------------------------------------------------

void showBoard()
{

  // *********** ROW 1 OF BOARD *******************
  cout << "\t\t | \t\t | \t\t " << endl;

  // Note the blank space is 6 spaces 
  cout << "      " << TTTBoard[0][0] << "\t |   "  << TTTBoard[0][1] << " \t" << " |  " << TTTBoard[0][2] << endl;
  cout << "    -------------------" << endl;

//************ ROW 2 OF BOARD ********************
  cout << "\t\t | \t\t | \t\t" << endl;

   // Note the blank space is 6 spaces 
  cout << "      " << TTTBoard[1][0] << "\t |   "  << TTTBoard[1][1] << " \t" << " |  " << TTTBoard[1][2] << endl;
  cout << "    -------------------" << endl;


//************ ROW 3 OF BOARD *******************
  cout << "\t\t | \t\t | \t\t" << endl;

    // Note the blank space is 6 spaces 
  cout << "      " << TTTBoard[2][0] << "\t |   "  << TTTBoard[2][1] << " \t" << " |  " << TTTBoard[2][2] << endl;

  cout << "\n\n";

}
//------------------------------------------------------------------

void play()
{
  // Generates the starting board 
  dummyBoard();

// Gets information for both players 
  getPlayerInfo();

// Since there are only 9 maximum moves in a tic-tac-toe game then we can use
// a for loop here
// Player one goes first, therefore their moves would be odd and Player Two's would 
// be even
for(int i = 0; i < 9; i++)
{
cout << "Please enter the space you would like to take: ";
do
{
do
{
  // Take in the user choice 
  cin >> userChoice;

  if(userChoice < 1 || userChoice > 9)
  {
    cout << "Please make sure to choose a number between 1 - 9: "; 
  }

}while(userChoice < 1 || userChoice > 9);

if(checkSpot(userChoice) == true)
  {
   cout << "This spot has already been taken, please choose another: ";
  }
  
}while(checkSpot(userChoice) == true);

// If we get this far we want to update the board
updateSpace(userChoice);

// Then we want to show the board
showBoard();

// Want to check if there is a winner
check();

// If check equates to true then we want to say there is a winner and stop the game 
if(check() == true)
{
  cout << "Congratulations, we have a winner!" << endl;

  exit(0);
}

// If there is no winner we will continue and increment the counter
counter++;

}
}

//------------------------------------------------------------------

// This method is checking whether someone has already won the game or if the game should continue being played 
bool check()
{
  // Create a variable that will hold the condition of the board
  bool winnerStatus = false;


  if(TTTBoard[0][0] == 'X' && TTTBoard[0][1] == 'X' && TTTBoard[0][2] == 'X')
  {
    winnerStatus = true;
  }

  if(TTTBoard[0][0] == 'O' && TTTBoard[0][1] == 'O' && TTTBoard[0][2] == 'O')
  {
    winnerStatus = true;
  }

// This will test if someone has won in the second row
  
   if(TTTBoard[1][0] == 'X' &&  TTTBoard[1][1] == 'X' && TTTBoard[1][2] == 'X')
  {
    winnerStatus = true;
  } 
  
 if(TTTBoard[1][0] == 'O' &&  TTTBoard[1][1] == 'O' && TTTBoard[1][2] == 'O')
  {
    winnerStatus = true;
  }

  // This will test if someone has won in the third row
  
   if( TTTBoard[2][0] == 'X' && TTTBoard[2][1] == 'X' && TTTBoard[2][2] == 'X')
  {
    winnerStatus = true;
  }
    if( TTTBoard[2][0] == 'O' && TTTBoard[2][1] == 'O' && TTTBoard[2][2] == 'O')
  {
    winnerStatus = true;
  }

   // This will test if someone has won in the first column
  
  if( TTTBoard[0][0] == 'X' && TTTBoard[1][0] == 'X' && TTTBoard[2][0] == 'X')
  {
    winnerStatus = true;
  }
  if( TTTBoard[0][0] == 'O' && TTTBoard[1][0] == 'O' && TTTBoard[2][0] == 'O')
  {
    winnerStatus = true;
  }

   // This will test if someone has won in the second column
   if( TTTBoard[0][1] == 'X' && TTTBoard[1][1] == 'X' && TTTBoard[2][1] == 'X')
  {
    winnerStatus = true;
  }
 if( TTTBoard[0][1] == 'O' && TTTBoard[1][1] == 'O' && TTTBoard[2][1] == 'O')
  {
    winnerStatus = true;
  }
  
   // This will test if someone has won in the third column
  
  if( TTTBoard[0][2] == 'X' && TTTBoard[1][2] == 'X' && TTTBoard[2][2]== 'X')
  {
    winnerStatus = true;
  }
   if( TTTBoard[0][2] == 'O' && TTTBoard[1][2] == 'O' && TTTBoard[2][2]== 'O')
  {
    winnerStatus = true;
  }

   // Now we want to check if someone has won on the first diagonal
  
   if(TTTBoard[0][0] == 'X' && TTTBoard[1][1] == 'X' && TTTBoard[2][2]== 'X')
  {
    winnerStatus = true;
  }
   if(TTTBoard[0][0] == 'O' && TTTBoard[1][1] == 'O' && TTTBoard[2][2]== 'O')
  {
    winnerStatus = true;
  }

    // Now we want to check if someone has won on the second diagonal
  
 if(TTTBoard[2][0] == 'X' && TTTBoard[1][1] == 'X' && TTTBoard[0][2] == 'X')
{
  winnerStatus = true;
}
 if(TTTBoard[2][0] == 'O' && TTTBoard[1][1] == 'O' && TTTBoard[0][2] == 'O')
{
  winnerStatus = true;
} 


 /* // This would test if someome has won in the first row 
  if(TTTBoard[0][0] == 'X' || TTTBoard[0][0] == 'O')
  {
  if(TTTBoard[0][0] == TTTBoard[0][1] == TTTBoard[0][2])
  {
    winnerStatus = true;
  }
  }


  // This will test if someone has won in the second row
  else if(TTTBoard[1][0] == 'X' || TTTBoard[1][0] == 'O')
  {
   if(TTTBoard[1][0] == TTTBoard[1][1] == TTTBoard[1][2])
  {
    winnerStatus = true;
  } 
  } 

  // This will test if someone has won in the third row
  else if(TTTBoard[2][0] == 'X' || TTTBoard[2][0] == 'O')
  {
   if( TTTBoard[2][0] == TTTBoard[2][1] == TTTBoard[2][2])
  {
    winnerStatus = true;
  }
  }

  // This will test if someone has won in the first column
  else if(TTTBoard[0][0]== 'X' || TTTBoard[0][0] == 'O')
  {
  if( TTTBoard[0][0] == TTTBoard[1][0] == TTTBoard[2][0])
  {
    winnerStatus = true;
  }
  }

  // This will test if someone has won in the second column
  else if(TTTBoard[0][1] == 'X' || TTTBoard[0][1] == 'O')
{
   if( TTTBoard[0][1] == TTTBoard[1][1] == TTTBoard[2][1])
  {
    winnerStatus = true;
  }
}

  // This will test if someone has won in the third column
  else if(TTTBoard[0][2] == 'X' || TTTBoard[0][2] == 'O')
  {
  if( TTTBoard[0][2] == TTTBoard[1][2] == TTTBoard[2][2])
  {
    winnerStatus = true;
  }
  }

  // Now we want to check if someone has won on the first diagonal
  else if(TTTBoard[0][0] == 'X' || TTTBoard[0][0] == 'O')
  {
   if(TTTBoard[0][0] == TTTBoard[1][1] == TTTBoard[2][2])
  {
    winnerStatus = true;
  }
  }

  // Now we want to check if someone has won on the second diagonal
  else if(TTTBoard[2][0] == 'X' || TTTBoard[2][0] == 'O')
  {
 if(TTTBoard[2][0] == TTTBoard[1][1] == TTTBoard[0][2])
{
  winnerStatus = true;
}
  }


// If none of the above conditions are true, then there is no winner
else
{
  winnerStatus = false;
}

*/

if(winnerStatus == true)
{
  winnerStatusString = "true";
}
else 
{
  winnerStatusString = "false";
}

  return winnerStatus;

}
//-------------------------------------------------------------------

// This method will let the player know that this spot has already been chosen and they would need to choose another spot within the board 

bool checkSpot(int userChoice)
{
  
  // Create a boolean condition that will return true if the space has been taken
  bool spotTaken = false;


  /*// Can use a for each loop to iterate over each element in the array
  // Outer loop iterates over the rows
  for(auto& spot: TTTBoard)
  {
    // Iterates over the column
    for(char innerSpot : spot)
    {
      if(innerSpot == 'X' || innerSpot == 'O')
      {
        spotTaken = true;
      }
    }
  }
  */

  // Since there are only 9 spaces, we can use a switch statement
  switch(userChoice)
  {
    case 1:
    {
      if(TTTBoard[0][0] == 'X' || TTTBoard[0][0] == 'O')
      {
        spotTaken = true;
      }
      break;
    }

    case 2:
    {
      if(TTTBoard[0][1] == 'X' || TTTBoard[0][1] == 'O')
      {
        spotTaken = true;
      }
        break;
    }

    case 3:
    {
      if(TTTBoard[0][2] == 'X' || TTTBoard[0][2] == 'O')
      {
        spotTaken = true;
      }
        break;
    }

    case 4:
    {
      if(TTTBoard[1][0] == 'X' || TTTBoard[1][0] == 'O')
      {
        spotTaken = true;
      }
        break;
    }

    case 5:
    {
      if(TTTBoard[1][1] == 'X' || TTTBoard[1][1] == 'O')
      {
        spotTaken = true;
      }
        break;
    }

    case 6:
    {
      if(TTTBoard[1][2] == 'X' || TTTBoard[1][2] == 'O')
      {
        spotTaken = true;
      }
        break;
    }

    case 7:
    {
      if(TTTBoard[2][0] == 'X' || TTTBoard[2][0] == 'O')
      {
        spotTaken = true;
      }
        break;
    }

    case 8:
    {
      if(TTTBoard[2][1] == 'X' || TTTBoard[2][1] == 'O')
      {
        spotTaken = true;
      }
        break;
    }

    case 9:
    {
      if(TTTBoard[2][2] == 'X' || TTTBoard[2][2] == 'O')
      {
        spotTaken = true;
      }
        break;
    }
  }

// Will return the status of this space so that we can use this condition elsewhere in our program 
 return spotTaken;

}
//--------------------------------------------------------------------

// This is the method that will change the player 
void changePlayer()
{
  // Since we have already set the players we can just create a dummy variable and swap them
  // Dummy holds the first player name 
  string temp = players[0];

// Puts the second player into the first players spot 
  players[0] = players[1];

// Re-assigns the second player spot to the first player as defined using temp 
  players[1] = temp;

}
//--------------------------------------------------------------------

void dummyBoard()
{

  cout << "Welcome to Tic Tac Toe!" << endl;
  cout << "Below is a game board that details the spaces you can choose from 1-9" << endl;
  cout << "\n\n";
  // *********** ROW 1 OF BOARD *******************
  cout << "\t\t | \t\t | \t\t " << endl;

  // Note the blank space is 6 spaces 
  cout << "      " << "1" << "\t |   "  << "2" << " \t" << " |  " << "3" << endl;
  cout << "    -------------------" << endl;

//************ ROW 2 OF BOARD ********************
  cout << "\t\t | \t\t | \t\t" << endl;

   // Note the blank space is 6 spaces 
  cout << "      " << "4" << "\t |   "  << "5" << " \t" << " |  " << "6" << endl;
  cout << "    -------------------" << endl;


//************ ROW 3 OF BOARD *******************
  cout << "\t\t | \t\t | \t\t" << endl;

    // Note the blank space is 6 spaces 
  cout << "      " << "7" << "\t |   "  << "8" << " \t" << " |  " << "9" << endl;

  cout << "\n\n";

}

//------------------------------------------------------------------

// If checkSpot() returns false then this method should execute as normal 
void updateSpace(int userChoice)
{
  // The max number of moves in a game of tic-tac-toe is 9
  // With that in mind, player 1 should have all odd moves
  // and player two should have all even moves

  // If the counter variable is odd, then it is player one's turn. Create a variable that will hold the player marker
  char playerOneMarker = 'X';
  char playerTwoMarker = 'O';


  
  switch(userChoice)
  {

    // Spot 1
    case 1:
    {
      // If even, then it was player two's turn 
      if(counter % 2 == 0)
      {
        TTTBoard[0][0] = playerTwoMarker;
      }

      // Else, i.e. odd, then it was player one's turn 
      else
      {
        TTTBoard[0][0] = playerOneMarker;
      }
      break;
    }

    // Spot 2
    case 2:
    {
      if(counter % 2 == 0)
      {
        TTTBoard[0][1] = playerTwoMarker;
      }
      else 
      {
        TTTBoard[0][1] = playerOneMarker;
      }
      break;
      
    }

    // Spot 3
    case 3:
    {
      if(counter % 2 == 0)
      {
        TTTBoard[0][2] = playerTwoMarker;
      }
      else 
      {
        TTTBoard[0][2] = playerOneMarker;
      }
      break;
    }

    // Spot 4
    case 4:
    {
      if(counter % 2 == 0)
      {
        TTTBoard[1][0] = playerTwoMarker;
      }
      else 
      {
        TTTBoard[1][0] = playerOneMarker;
      }
      break;

    }

    // Spot 5
    case 5:
    {
      if(counter % 2 == 0)
      {
        TTTBoard[1][1] = playerTwoMarker;
      }
      else 
      {
        TTTBoard[1][1] = playerOneMarker;
      }
      break;

    }

    // Spot 6
    case 6:
    {
       if(counter % 2 == 0)
      {
        TTTBoard[1][2] = playerTwoMarker;
      }
      else 
      {
        TTTBoard[1][2] = playerOneMarker;
      }
      break;

    }

    // Spot 7
    case 7:
    {
        if(counter % 2 == 0)
      {
        TTTBoard[2][0] = playerTwoMarker;
      }
      else 
      {
        TTTBoard[2][0] = playerOneMarker;
      }
      break;

    }

    // Spot 8
    case 8:
    {
        if(counter % 2 == 0)
      {
        TTTBoard[2][1] = playerTwoMarker;
      }
      else 
      {
        TTTBoard[2][1] = playerOneMarker;
      }
      break;

    }

    // Spot 9
    case 9:
    {
        if(counter % 2 == 0)
      {
        TTTBoard[2][2] = playerTwoMarker;
      }
      else 
      {
        TTTBoard[2][2] = playerOneMarker;
      }
      break;

    }

  }

}

//----------------------------------------------------

// This method will get player Info
void getPlayerInfo()
{
  cout << "Player One, please enter your name: ";
  cin >> players[0];

  cout << "Player Two, please enter your name: ";
  cin >> players[1];

}

// DEBUG METHODS -------------------------------------------------

string getPlayerOne()
{
  return players[0];
}

string getPlayerTwo()
{
  return players[1];
}