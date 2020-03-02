import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines the Evader. The Evader is snake controlled by the player, that evades balls.
 * 
 * @author n/a 
 * @version: 1
 */
public class Evader extends Actor
{
    /**
     * Move - defines the movements that the evader can make using the "A" & "D" Keys.
     */
    public void act() 
    {
    mv();
    mv2();
    } 
    /**
    * D
    */
   
   public void mv()
   {
      
       if (Greenfoot.isKeyDown("D"))
       {
        turnTowards​(600, 580);
        
        }
    
}
    /**
    * A
    */
   
   public void mv2()
   {
      
       if (Greenfoot.isKeyDown("A"))
       {
       turnTowards (0, 580);
       
        }
    
}
}
