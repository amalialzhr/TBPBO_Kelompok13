import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TankOnlyButton extends Actor
{
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
             Greenfoot.setWorld(new TankOnly());
    }    
}
