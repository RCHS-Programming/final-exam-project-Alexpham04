import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Europe1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Europe1 extends World
{

    /**
     * Constructor for objects of class Europe1.
     * 
     */
    public Europe1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Robot(), 745, 530);
        
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 12);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 587);
        }
         for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 12, 25 +50*i);
        }
         for(int i = 0; i < 9; i++)
        {
            addObject(new Wall("edge2.png"), 12, 600 - 50*i);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge2.png"), 787, 25 +50*i);
        } 
        
          for(int i = 0; i < 10; i++)
        {
            addObject(new Wall("edge2.png"), 700, 600 - 50*i);
        }
         for(int i = 0; i < 8; i++)
        {
            addObject(new Wall("edge.png"), 663 - 50*i, 137);
        }
         for(int i = 0; i < 9; i++)
        {
            addObject(new Wall("edge2.png"), 175, 25 +50*i);
        }
         for(int i = 0; i < 8; i++)
        {
            addObject(new Wall("edge.png"), 200 + 50*i, 235);
        }
         for(int i = 0; i < 8; i++)
        {
            addObject(new Wall("edge.png"), 665 - 50*i, 335);
        }
    }
}
