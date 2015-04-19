import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guy extends Actor
{
    private int counter = 0;
    private String dog = "";
    /**
     * Act - do whatever the Guy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        String[] dogs = {"bDog", "dbDog", "pDog"};
        dog = dogs[Greenfoot.getRandomNumber(dogs.length)];
        if(isTouching(Kat.class))
        {
            setLocation(getX() - 3, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY());
        }
        if(Greenfoot.isKeyDown("space"))
        {
            if(dog == "bDog")
            {
                if(counter == 0)
                {
                    getWorld().addObject(new bDog(), getX(), getY());
                    counter = counter + 1;
                }
            }
            if(dog == "dbDog")
            {
                if(counter == 0)
                {
                    getWorld().addObject(new dbDog(), getX(), getY());
                    counter = counter + 1;
                }
            }
            if(dog == "pDog")
            {
                if(counter == 0)
                {
                    getWorld().addObject(new pDog(), getX(), getY());
                    counter = counter + 1;
                }
            }
        }
        else
        {
            counter = 0;
        }
        
    }    
}
