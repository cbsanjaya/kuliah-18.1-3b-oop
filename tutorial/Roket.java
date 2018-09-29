import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roket extends Actor
{
    int maju = 1;
    
    /**
     * Act - do whatever the Roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int acak = Greenfoot.getRandomNumber(15);
        
        move(maju);
        
        turn( acak - 7 );
        
        boolean mentok =  isAtEdge();
        
        if (mentok) {
            turn(45);
        }        
    }
    
    public void setMaju(int go)
    {
        maju = go;
    }
}
