import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
         PopulateWorld();
        }
        /**
         * image test
         */
        public void imgtest()
        {
         
        }
    public void PopulateWorld()
    {
        addObject( new Player_Crab(), 250, 250);
        addObject( new Crab(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Crab(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Crab(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Crab(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Crab(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Crab(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Crab(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Crab(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530)); 
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Worm(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Lobster(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Lobster(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Lobster(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Lobster(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Lobster(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Lobster(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
        addObject( new Lobster(), Greenfoot.getRandomNumber(530),Greenfoot.getRandomNumber(530));
    }
    
}