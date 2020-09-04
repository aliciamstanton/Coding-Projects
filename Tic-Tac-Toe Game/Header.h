// This is the header file for Tic-Tac-Toe

// IOStream
#include <iostream>

// String
#include <string>

// Manipulation
#include <iomanip>

// Termination
#include <cstdlib>

// Update namespace
using namespace std;

// This method will create the board 
void newBoard();


// This method will show the current status of the board
void showBoard();

// This method will play the game
void play();

// This method will check the board - assuming to see if someone has already won or not 
bool check();

// This method will check the individual spot
bool checkSpot(int userChoice);

// This method will change players
void changePlayer();

// This will show a dummy board for the positions
void dummyBoard();

// This method will update the space based on the value returned from checkSpot
void updateSpace(int userChoice);

// Method that gets player info
void getPlayerInfo();

string getPlayerOne();

string getPlayerTwo();

