/**
   The main method to test out LunarLander race.
   @author Yingqi Ding, Starr Wang, 2018-03-31
*/
import java.util.Scanner;
public class SimulationRace
{
   public static void main(String[] args)
   {
      LunarLander lander1 = new LunarLander();
      //create an instance called lander1 

      Scanner kb = new Scanner(System.in);
      //create a scanner
      
      System.out.println("Welcome to Lunar Lander!You are controlling lander1.");
      int alt = lander1.getAltitude();
      int vel = lander1.getVelocity();
      int fuel = lander1.getFuel();
      System.out.print("Alt = " + alt + " ");
      System.out.print("Vel = " + vel + " ");
      System.out.println("Fuel = " + fuel);
      
      //provide the player with a welcome message and show the player the current information for the lander
      
      LunarLander lander2 = new LunarLander();
      //create an instance called lander1 

      
      System.out.println("Welcome to Lunar Lander!You are controlling lander2.");
      int alt2 = lander2.getAltitude();
      int vel2 = lander2.getVelocity();
      int fuel2 = lander2.getFuel();
      System.out.print("Alt = " + alt2 + " ");
      System.out.print("Vel = " + vel2 + " ");
      System.out.println("Fuel = " + fuel2);
      
      //provide the player with a welcome message and show the player the current information for the lander

      while (lander1.getAltitude() > 0 && lander2.getAltitude() > 0 )
      {
         System.out.println("How much thrust this round for lander1?");
         int units = kb.nextInt();
         
         //print the question as to how many units of thrust to burn and store the answer in variable called units

         if (units == -1)
         {
            System.exit(1);
         }
         
         //if the player enter -1, exit the game.

         lander1.doOneSecond(units);
         //updated the imformation about the lander after one second
         
         alt = lander1.getAltitude();
         vel = lander1.getVelocity();
         fuel = lander1.getFuel();
         System.out.print("Alt = " + alt + " ");
         System.out.print("Vel = " + vel + " ");
         System.out.println("Fuel = " + fuel);
         //print out the new information about the lander

         System.out.println("How much thrust this round for lander2?");
         units = kb.nextInt();
         
         //print the question as to how many units of thrust to burn and store the answer in variable called units

         if (units == -1)
         {
            System.exit(1);
         }
         
         //if the player enter -1, exit the game.

         lander2.doOneSecond(units);
         //updated the imformation about the lander after one second
         
         alt2 = lander2.getAltitude();
         vel2 = lander2.getVelocity();
         fuel2 = lander2.getFuel();
         System.out.print("Alt = " + alt2 + " ");
         System.out.print("Vel = " + vel2 + " ");
         System.out.println("Fuel = " + fuel2);
         //print out the new information about the lander
      }
      
      if (lander1.getAltitude() <= 0 && lander1.getAltitude() <= 0)
      {
         if((lander1.getVelocity() <= 4)==(lander2.getVelocity() <= 4))
         {
            System.out.println("Draw!");
         }
         else if(lander1.getVelocity() <= 4)
         {
            System.out.println("Lander1 win.");
         }
         else
         {
            System.out.println("Lander2 win.");
         }   
      }  
      else if (lander1.getAltitude() <= 0)
      {
         if(lander1.getVelocity() <= 4)
         {
            System.out.println("Lander1 win.");
         }
         else
         {
            System.out.println("Lander2 win.");
            
         }        
      }        
      else
      {
         if(lander2.getVelocity() <= 4)
         {
            System.out.println("Lander2 win.");
         }
         else
         {
            System.out.println("Lander1 win.");
         }        
      }
   }
}