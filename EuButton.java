import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EuButton here.
 * 
 * @author Jonathan & Alex
 * @version (a version number or a date)
 */
public class EuButton extends Actor
{
    /**
     * Act - do whatever the EuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked("EuButton"))
        {
            Greenfoot.setWorld(new Europe1());
        }
    }
}
