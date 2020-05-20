/**
 * TortoiseAndHare
 * 
 * This class will generate the winning results of a race between the hare and
 * the tortoise. Two methods will be used to generate a random number with
 * percentages built in. The random number will be used to display the progress
 * of both the hare and tortoise.
 * 
 * @author sDantzler
 */
public class TortoiseAndHare {

   public static void main(String[] args) {
      // create base variables needed to use in race while loop
      int hareCount = 1;
      int tortoiseCount = 1;
      int winPosition = 50;
      boolean noWinner = true;

      // It's time to race!
      System.out.println("And they're off!");

      while (noWinner) {

         display(tortoiseCount, hareCount);

         hareCount += randomMoveHare();
         tortoiseCount += randomMoveTortoise();

         // make sure the hareCount does not return an illegal action
         if (hareCount < 1) {
            hareCount = 1;
         }
         // make sure the tortoiseCount does not return an illegal action
         if (tortoiseCount < 1) {
            tortoiseCount = 1;
         }

         // When the tortoise and hare are at the same position
         if (tortoiseCount == hareCount) {
            System.out.println("Ouch!");
         }

         // Needed a way to exit the loop successfully
         if (tortoiseCount > winPosition || hareCount > winPosition) {
            display(tortoiseCount, hareCount);
            noWinner = false;
         }

      } // end while loop

      // if-else if statement to determine the final result of the race
      if (tortoiseCount > winPosition && hareCount > winPosition) {
         // Winning position is greater than 50 that's why this is a tie
         System.out.println("It's a tie");
      } else if (tortoiseCount > winPosition && hareCount <= winPosition) {
         System.out.println("Tortoise wins!");
      } else if (tortoiseCount <= winPosition && hareCount > winPosition) {
         System.out.println("Hare wins!");
      }

   }// end main method

   /**
    * display
    * 
    * This method will return display the status of the tortoise and the hare
    * within the race
    * 
    * @param tortoiseCount, hareCount
    */
   public static void display(int tortoiseCount, int hareCount) {

      // visually show where the tortoise is
      for (int index = 1; index <= hareCount; index++) {
         System.out.print(" ");
      }
      System.out.println("H");

      // visually show where the hare is
      for (int index = 1; index <= tortoiseCount; index++) {
         System.out.print(" ");
      }
      System.out.println("T");

      // Print out a buffer line for the visuals
      System.out.println("--------------------------------------------------");

   }

   /**
    * randomMoveHare
    * 
    * This method will return the integer value needed to determine how many
    * spaces the hare will move
    * 
    * @return int value
    */
   public static int randomMoveHare() {
      // Generate a random number between 1 and 10
      int randNum = (int) (10 * Math.random()) + 1;

      switch (randNum) {
         // Big hop occurs 20% of the time from 1-2 and
         // adds 9 spaces
         case 1:
         case 2:
            return 9;
         // Small hop occurs 30% of the time from 3-5 and
         // adds 1 space
         case 3:
         case 4:
         case 5:
            return 1;
         // Big slip occurs 10% of the time at 6 and
         // subtracts 12 spaces
         case 6:
            return -12;
         // Small slip occurs 20% of the time from 7-8 and
         // subtracts 2 spaces
         case 7:
         case 8:
            return -2;
         // Fall asleep occurs 20% of the time from 9-10 and
         // adds no spaces or does nothing
         case 9:
         case 10:
            return 0;
         default:
            return 0;
      }// end switch

   }// end randomMoveHare method

   /**
    * randomMoveTortoise
    * 
    * This method will return the integer value needed to determine how many
    * spaces the tortoise will move
    * 
    * @param randNum
    * @return int value
    */
   public static int randomMoveTortoise() {
      // Generate a random number between 1 and 10
      int randNum = (int) (10 * Math.random()) + 1;

      switch (randNum) {
         // Fast plod occurs 50% of the time from 1-5 and
         // adds 3 spaces
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            return 3;
         // Slow plod occurs 30% of the time from 6-8 and
         // adds 1 space
         case 6:
         case 7:
         case 8:
            return 1;
         // Slip occurs 20% of the time from 9-10 and
         // subtracts 6 spaces
         case 9:
         case 10:
            return -6;
         default:
            return 0;
      }// end switch

   }// end randomMoveTortoise method

}// end TortoiseAndHare class
