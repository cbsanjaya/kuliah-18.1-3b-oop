import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesawat extends Actor
{
    
    public Pesawat()
    {
        GreenfootImage gambar = getImage();
        int lebar = gambar.getWidth();
        int tinggi = gambar.getHeight();
        
        int skala = 3;
        
        gambar.scale(lebar / skala, tinggi / skala);
                        
    }
    
    /**
     * Act - do whatever the Pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( Greenfoot.isKeyDown("up") ) {
            move(2);
        } else 
        if ( Greenfoot.isKeyDown("down") ) {
            move(-1);
        }
        
        if ( Greenfoot.isKeyDown("right") ) {
            turn(3);
        } else 
        if ( Greenfoot.isKeyDown("left") ) {
            turn(-3);
        }
        
        if ( "space".equals( Greenfoot.getKey() ) ) {
            PeluruHero pelor = new PeluruHero();
            
            pelor.setRotation(getRotation());
            
            World langit = getWorld();
            
            langit.addObject(pelor, getX(), getY());
        }
    }    
}
