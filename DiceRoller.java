import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
   public static void main (String[] args) {
      Scanner scanInt = new Scanner (System.in);
      Scanner scanText = new Scanner (System.in);
      
      Random rand = new Random();
      
      System.out.print("Enter number of entries: ");
      int num = scanInt.nextInt();
      
      String[] input = new String[num];
      
      for (int x = 0; x < num; x++) {
         input[x] = scanText.nextLine();
      }
      
      for (int x = 0; x < num; x++) {
         int y = 0;
         while(input[x].charAt(y) != 'd') {
            y++;
         }
         
         int numDice = Integer.parseInt(input[x].substring(0,y));
         int numSides = Integer.parseInt(input[x].substring(y+1));
         
         int[] rolls = new int[numDice];
         int sum = 0;
         
         for (int z = 0; z < numDice; z++) {
            rolls[z] = rand.nextInt(numSides) + 1;
            sum += rolls[z];
         }
         
         System.out.print(sum + ":");
         
         for (int z = 0; z < numDice; z++) {
            System.out.print(" " + rolls[z]);
         }
         
         System.out.println();
      }
   }
}