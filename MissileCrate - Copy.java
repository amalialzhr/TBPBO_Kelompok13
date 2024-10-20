import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MissileCrate extends Crates
{
    public MissileCrate(){
        setImage("MissileAmmo.png");
    }
    
    /**
     * Act - do whatever the MissileCrate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkStack();
    }    
}
