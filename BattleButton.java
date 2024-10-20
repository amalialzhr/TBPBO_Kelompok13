import greenfoot.*; 

public class BattleButton extends Actor
{
    /**
     * Act - do whatever the BattleButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
             Greenfoot.setWorld(new Battlefield());
    }    
}
