import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asia extends World
{
    String[] flags={ "china flag.png","vietnamese flag.png","mongolian flag.png"};
    String[] questions={" has a wall that is over 13,000 miles long"," has the largest desert in asia"};
    int ans= 0;
    /**
     * Constructor for objects of class Asia.
     * 
     */
    public Asia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        showText(" match the countries flag to a question ", 300, 50);
        showText(questions[ans] ,300, 100);
        addObject(new flag1(flags[0]), 142, 217);
        addObject(new flag1(flags[1]), 100, 200);
        addObject(new flag1(flags[2]), 100, 200);

    }
       
    }

