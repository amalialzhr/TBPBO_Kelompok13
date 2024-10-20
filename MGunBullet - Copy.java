import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class MGunBullet extends MyProjectile
{
    private int accuracy;
    
    public MGunBullet(int acute){
        counter = 0;
        fizzOut = 40;
        speed = 10;
        accuracy = acute;
    }
   
    public void act() 
    {
        if(!lockOn){
            turnTowardsMouse();
            Random rand = new Random();
            turn(rand.nextInt(accuracy) - accuracy/2); 
            lockOn = true;
        }
        move(speed);
        selfDestruct();
    }    
    

    public void selfDestruct(){
        counter++;
        Actor obj = getOneIntersectingObject(Objects.class);    
        if(counter > fizzOut || obj != null){
            getWorld().removeObject(this);
        }
    }
    
    //turn towards mouse
    public void turnTowardsMouse(){
        MouseInfo mouse = Greenfoot.getMouseInfo();             
        if (mouse != null)      
           turnTowards(mouse.getX(), mouse.getY());   
    }  
}
