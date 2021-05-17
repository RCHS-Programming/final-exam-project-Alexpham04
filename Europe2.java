import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Europe2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Europe2 extends World
{

    /**
     * Constructor for objects of class Europe2.
     * 
     */
    public Europe2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        addObject(new Robot(), 745, 530);
        
        addObject(new Block(), 425, 565);
        addObject(new Block(), 350, 230);        
        addObject(new Block(), 500, 230);
        
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 12);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 587);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge2.png"), 12, 25 +50*i);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge2.png"), 787, 25 +50*i);
        } 
        
         for(int i = 0; i < 6; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 450);
        }      
         for(int i = 0; i < 8; i++)
        {
            addObject(new Wall("edge.png"), 775 - 50*i, 450);
        }
         for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 287, 370 +50*i);
        }
         for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 412, 370 +50*i);
        }
        
         for(int i = 0; i < 5; i++)
        {
            addObject(new Wall("edge.png"), 625 - 50*i, 350);
        }
         for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 650, 288 +50*i);
        }
         for(int i = 0; i < 3; i++)
        {
            addObject(new Wall("edge2.png"), 650, 0+50*i);
        }
    }
}
