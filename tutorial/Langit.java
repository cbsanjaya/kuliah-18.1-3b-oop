import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Langit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Langit extends World
{

    /**
     * Constructor for objects of class Langit.
     * 
     */
    public Langit()
    {    
        // Create a new world with 800x500 cells with a cell size of 1x1 pixels.
        // super(800, 500, 1, false);
        super(800, 500, 1);
        
        this.inisialisasi();
        
    }
    
    public void inisialisasi()
    {
        // int acak = Greenfoot.getRandomNumber(360);
        
        Roket mumbulDewe = new Roket();
        // mumbulDewe.setRotation(acak);
        
        addObject(mumbulDewe, 100, 250);
        
        Roket layang = new Roket();
        layang.setMaju(2);
        layang.getImage().scale(60, 30);
        
        addObject(layang, 20, 100);
    }
}
