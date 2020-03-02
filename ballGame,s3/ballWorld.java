import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ballWorld extends World
{

    /**
     * Constructor for objects of class ballWorld.
     * 
     */
    public ballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject​(new Evader() , 300, 580);
    }
}
