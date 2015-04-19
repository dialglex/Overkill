import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kat extends Actor
{
    GreenfootImage sprite1 = new GreenfootImage("sadPotatoKat.png");
    boolean overkill = false;
    /**
     * Act - do whatever the Kat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    public void die()
    {
        setImage(sprite1);
        if(!overkill)
        {
            getWorld().addObject(new Overkill(), 300, 50);
            overkill = true;
        }
        ((Overkill) getWorld().getObjects(Overkill.class).get(0)).overkill();
    }
    public void explode()
    {
        getWorld().addObject(new Explosion(), getX(), getY());
        getWorld().removeObject(this);
    }
}
