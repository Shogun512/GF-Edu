import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach. They like sand worms 
 * (very yummy, especially the green ones).
 * 
 * Version: 2
 * 
 * In this version, the crab walks around the beach more or less randomly.
 */

public class Lobster extends Animal
{
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        wt();
        rt();
        eat();
    }
    /**
     * wt - Turn away at if hit world edge
     */
    public void wt()
    {
               if ( atWorldEdge() ) 
        {
            turn(13);
        } 
    }
    /**
     * rt - RandomTurn - look for a ramdom number and turn 10% of the time.
     */
    public void rt()
    {
         if ( Greenfoot.getRandomNumber(100) < 10 ) 
        {
            turn( Greenfoot.getRandomNumber(13)-45 );
        }
    }
    
        /** 
     * Eat - If crab is found, eat it.
     */
    public void eat()
    {
        if ( canSee (Crab.class) )
        {
            eat(Crab.class);
        }
               if ( canSee (Player_Crab.class) )
        {
            eat(Player_Crab.class);
            Greenfoot.playSound("slurp.wav");
            Greenfoot.stop();
        }
    }
}