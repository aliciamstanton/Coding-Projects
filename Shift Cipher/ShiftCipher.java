import java.util.Scanner;
public class ShiftCipher 
{
  // Instance Variables
  private int shiftSize;

  Scanner input = new Scanner(System.in);

 // Empty Constructor
 public ShiftCipher()
 {

 }

 // Full Constructor??

 // Copy Constructor
 public ShiftCipher(ShiftCipher theObject)
 {
   this.shiftSize = theObject.getShiftSize();
 }

 // Getters and Setters
public int getShiftSize()
{
  return this.shiftSize;
}

public void setShiftSize()
{
  System.out.print("How many spaces would you like to shift?: ");
  int userShift = input.nextInt();
  this.shiftSize = userShift;
}

 // Equals Method

 // ToString Method 


}