    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class PeluruMusuh here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
public class PeluruMusuh extends Actor
{
    public PeluruMusuh()
    {
        GreenfootImage gambar = getImage();
        int lebar = gambar.getWidth();
        int tinggi = gambar.getHeight();
        
        int skala = 3;
        
        gambar.scale(lebar / skala, tinggi / skala);
                        
    }

    /**
     * Act - do whatever the PeluruMusuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        
        if ( isAtEdge() ) {
            getWorld().removeObject(this);
        }
    }    
}
