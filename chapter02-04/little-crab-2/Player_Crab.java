import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a Player_Crab. Crabs live on the beach. They like sand worms 
 * (very yummy, especially the green ones).
 * 
 * Version: 2
 * 
 * In this version, the crab walks around the beach more or less randomly.
 */

public class Player_Crab extends Animal
{
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        rt();
        lt();
        mf();
        eat();
    }
    /**
     * rt - Turn Right - Turn right if the "A" key is pressed
     */
    public void rt()
    {
    if (Greenfoot.isKeyDown("A"))
    {
       turn(5); 
       move();
    }
    }
    /**
     * lt - Turn Left - Turn Left if the "D" key is pressed
     */
    public void lt()
   {
    if (Greenfoot.isKeyDown("D"))
    {
       turn(-5);
       move();
    }
    }
    /**
     * mf - Move Forward - Move forward if the "W" key is pressed
     */
    public void mf()
    {
    if (Greenfoot.isKeyDown("W"))
    {
       move(); 
    }
    }
    
        /** 
     * Eat - If a worm is found, eat it.
     */
    public void eat()
    {
        if ( canSee (Worm.class) )
        {
            eat(Worm.class);
        }
    }
}