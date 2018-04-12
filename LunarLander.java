/**
   The class that holds the lunar lander.
   @author Yingyi Ding and Starr Wang, 2018-03-31
*/


public class LunarLander
{
   private int altitude;   //meters
   private int velocity;   //meters per second
   private int fuel;   //units 
   private final int gravity;
   private final int antigravity;
   private final int useFuelUnit;

   /** Constructor of lunar landers. */
   public LunarLander()
   {
      altitude = 1000;   // the initial altitude
      velocity = 40;   // the initial velocity
      fuel = 25;   // the initial units of fuel
      gravity = 2; // the gravity will increase the velocity by 2
      antigravity = -4;
      useFuelUnit = -1;
   }

   /** Get the altitude of the lunar landers at the moment. */
   public int getAltitude()
   {
      return altitude;
   }

   /** Get the velocity of the lunar landers at the moment. */
   public int getVelocity()
   {
      return velocity;
   }

   /** Get the units of fuel left at the moment. */
   public int getFuel()
   {
      return fuel;
   }

   /** Applies one unit of fuel to give thrust to the ship,
   and decreases the velocity by 4 meters per second. */
   public void thrust()
   {
      fuel += useFuelUnit;
      velocity += antigravity;
   }

   /** Simulates one complete second of activity,
   where the astronaut has requested to burn fuelUnits units of fuel. */
   public void doOneSecond(int fuelUnits)
   {
      velocity += gravity;
      //Check to if the lulnar lander actually has this much fuel.
      if (fuelUnits <= fuel)
      {
         for (int i = 0; i < fuelUnits; i++)
         {
            this.thrust();
         }
      }
      //If not, burn all that  the lulnar lander has.
      else
      {
         while (fuel > 0)
         {
            this.thrust();
         }
      }
      altitude = altitude - velocity;
   }
}
