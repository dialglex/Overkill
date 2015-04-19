import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Overkill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Overkill extends Actor
{
    private int overkill = 0;
    private int time = 1800;
    private int secs = 30;
    private GreenfootImage sprite;
    private GreenfootImage image;
    /**
     * Act - do whatever the Overkill wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage(sprite));
        getImage().drawImage(sprite, 0, 0);
        getImage().drawString(String.valueOf("x" + overkill), 0, 50);
        secs = time / 60;
        if(time >= 0)
        {    
            time--;
        }
        getImage().drawString(String.valueOf("Time:" + secs), 50, 50);
        if(time == 0)
        {
            ((Kat) getWorld().getObjects(Kat.class).get(0)).explode();
            getWorld().addObject(new Finish(overkill), 300, 200);
            getWorld().removeObject(this);
        }
    }    
    public void addedToWorld(World world)
    {
        sprite = new GreenfootImage("overkill.png");
        act();
    }
    public void overkill()
    {
        overkill++;
    }
}
