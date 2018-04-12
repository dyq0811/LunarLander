/**
   The main method to test out LunarLander class.
   @author Yingqi Ding, Starr Wang, 2018-03-31
*/
import java.util.Scanner;
public class Simulation
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to Lunar Lander!");

      //create an instance called lander1
      LunarLander lander1 = new LunarLander();
      Scanner kb = new Scanner(System.in);
      
      //show the player the current information for the lander
      int alt = lander1.getAltitude();
      int vel = lander1.getVelocity();
      int fuel = lander1.getFuel();
      System.out.print("Alt = " + alt + " ");
      System.out.print("Vel = " + vel + " ");
      System.out.println("Fuel = " + fuel);

      //System.out.format("Alt = %d, Vel = %d",alt, velocity)
      
      while (lander1.getAltitude() > 0)
      {
         //print the question as to how many units of thrust to burn
         //store the answer in variable called units
         System.out.println("How much thrust this round?");
         int units = kb.nextInt();

         //if the player enter -1, exit the game.
         if (units == -1)
         {
            System.exit(1);
         }

         //updated the imformation about the lander after one second
         lander1.doOneSecond(units);

         //print out the new information about the lander
         alt = lander1.getAltitude();
         vel = lander1.getVelocity();
         fuel = lander1.getFuel();
         System.out.print("Alt = " + alt + " ");
         System.out.print("Vel = " + vel + " ");
         System.out.println("Fuel = " + fuel);
         

      }
      //When the lander lands on the moon, if the velocity is smaller than 4 m/s, it safely lands.
      if (lander1.getVelocity() <= 4)
      {
         System.out.println("Congratulations! Safely land!");
      }
      //Otherwise, the lander crashes.
      else
      {
         System.out.println("Oh no, you crashed!");
      }
   }
}