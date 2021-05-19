import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EuropeFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EuropeFinal extends World
{

    /**
     * Constructor for objects of class EuropeFinal.
     * 
     */
    public EuropeFinal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
       
        addObject(new Robot(), 745, 530);
        
        addObject(new Block(), 650, 400);
        addObject(new Block(), 650, 275);
        addObject(new Block(), 650, 150);
        
        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 12);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 587);
        }
         for(int i = 0; i < 10; i++)
        {
            addObject(new Wall("edge2.png"), 12, 25 +50*i);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge2.png"), 787, 25 +50*i);
        } 
    }
}
