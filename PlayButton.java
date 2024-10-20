import greenfoot.*;  
public class PlayButton extends Actor
{
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
             Greenfoot.setWorld(new LevelSelect());
    }    
}
