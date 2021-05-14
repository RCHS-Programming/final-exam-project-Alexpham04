import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start_Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start_Screen extends World
{

    /**
     * Constructor for objects of class Start_Screen.
     * 
     */
    public Start_Screen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        showText("Select area of world", 300, 50);
        showText("North America", 100, 150);
        showText("Europe", 300, 150);
        showText("Asia", 500, 150);
        
        addObject(new Button(), 100, 200);
        addObject(new EuButton(), 300, 200);
        addObject(new Button(), 500, 200);
        
    }
}
