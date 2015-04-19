 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dogs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dogs extends Actor
{
    /**
     * Act - do whatever the Dogs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void doggyDoo()
    {
        move(1);
        if(isTouching(Kat.class) || (getX() == 599))
        {
            if(isTouching(Kat.class))
            {
                ((Kat) getWorld().getObjects(Kat.class).get(0)).die();
            }
            getWorld().removeObject(this);
        }
    }
}
