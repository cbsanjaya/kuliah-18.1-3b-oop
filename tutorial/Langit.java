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
        super(800, 500, 1);
        
        this.inisialisasi();
        
    }
    
    public void inisialisasi()
    {
        Pesawat hero = new Pesawat();
        addObject(hero, 100, 250);
        
        Roket musuh = new Roket();
        addObject(musuh, 400, 100);
        
    }
}
