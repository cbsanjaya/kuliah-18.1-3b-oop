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
    int waktu = 100;
    
    public Roket()
    {
        GreenfootImage gambar = getImage();
        int lebar = gambar.getWidth();
        int tinggi = gambar.getHeight();
        
        int skala = 2;
        
        gambar.scale(lebar / skala, tinggi / skala);
                        
    }

    /**
     * Act - do whatever the Roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int acak = Greenfoot.getRandomNumber(21);
        
        move(maju);
        
        turn( acak - 11 );
        
        boolean mentok =  isAtEdge();
        
        if (mentok) {
            turn(45);
        }
        
        waktu--;
        if ( waktu <= 0 ) {
            tembak();
            waktu = 100;
        }
    }
    
    public void setMaju(int go)
    {
        maju = go;
    }
    
    public void tembak() 
    {
        PeluruMusuh pelor = new PeluruMusuh();
            
        pelor.setRotation(getRotation());
        
        World langit = getWorld();
        
        langit.addObject(pelor, getX(), getY());
    }
}
